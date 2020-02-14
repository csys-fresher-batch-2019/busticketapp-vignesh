package com.chainsys.busticketapp.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;

import com.chainsys.busticketapp.DBException;
import com.chainsys.busticketapp.ErrorMessages;
import com.chainsys.busticketapp.dao.ReservationDAO;
import com.chainsys.busticketapp.dao.impl.mail.Mail;
import com.chainsys.busticketapp.logger.Logger;
import com.chainsys.busticketapp.model.ListReservation;
import com.chainsys.busticketapp.util.ConnectionUtil;

public class ReservationImplementation implements ReservationDAO {
	ListReservation obj = new ListReservation();
	Logger logger=Logger.getInstance();
	public void addReservationList(ListReservation obj) throws Exception {
		try(Connection con = ConnectionUtil.getConnection();){
		/*
		 * String
		 * sql="insert into reserve(ticket_no,bus_no,pas_id,no_of_ticket,journy_date) values(ticket_no.nextval,?,?,?,?)"
		 * ; Connection con = TestConnections.getConnection(); System.out.println(sql);
		 * PreparedStatement pst=con.prepareStatement(sql);
		 * 
		 * pst.setInt(1,obj.BusNo); pst.setInt(2,obj.PassengerId);
		 * pst.setInt(3,obj.NoOfTicket); LocalDate ld=LocalDate.parse(obj.date); Date
		 * Journydate=Date.valueOf(ld); pst.setDate(4, Journydate); int
		 * row=pst.executeUpdate(); System.out.println(row);
		 */
		try(CallableStatement stmt = con.prepareCall("{call ticket_booking(?,?,?,?)}");){
		stmt.setInt(1, obj.getBusNo());
		logger.info(obj.getBusNo());
		stmt.setInt(2, obj.getPassengerId());
		logger.info(obj.getPassengerId());
		stmt.setInt(3, obj.getNoOfTicket());
		logger.info(obj.getNoOfTicket());
		stmt.registerOutParameter(4, Types.INTEGER);
		stmt.executeUpdate();
		int result=stmt.getInt(4);
		logger.info(result);
		if(result>100) {
			Mail.send("vignesh280519@gmail.com","6369541046","vigneshn051995@gmail.com"," Your Ticket is Booked ","Thanks for using this application",obj.getPassengerId());
		}	
		
	}
		catch (Exception e) {
			throw new DBException(ErrorMessages.NO_DATA_FOUND);
		}
		}
		catch (Exception e) {
			throw new DBException(ErrorMessages.CONNECTION_FAILURE);
		}
	
	}
	public void cancelReservationList(int ticketNo) throws Exception {
		String sql = "delete from reserve where ticket_no=?";
		logger.debug(sql);
		try(Connection con = ConnectionUtil.getConnection();){
		try(PreparedStatement pst = con.prepareStatement(sql);){
		pst.setInt(1, ticketNo);
			int row = pst.executeUpdate();
		logger.info(row);
	}
		catch (Exception e) {
			throw new DBException(ErrorMessages.NO_DATA_FOUND);
		}
	}
		catch (Exception e) {
			throw new DBException(ErrorMessages.CONNECTION_FAILURE);
		}
	}
	public ArrayList<ListReservation> reserveDetails() throws Exception {
		String sql = "select * from reserve";
		logger.debug(sql);
		ArrayList<ListReservation> List = new ArrayList<>();
		try (Connection con = ConnectionUtil.getConnection(); Statement stmt = con.createStatement();) {

			try(ResultSet rs = stmt.executeQuery(sql);){
			while (rs.next()) {
				ListReservation obj = new ListReservation();
				obj.setTicketNo(rs.getInt("ticket_no"));
				obj.setBusNo(rs.getInt("bus_no"));
				obj.setPassengerId(rs.getInt("pas_id"));
				obj.setNoOfTicket(rs.getInt("no_of_ticket"));
				// obj.Journydate=rs.getDate("journy_date");
				obj.setTotalAmount(rs.getInt("total_amount"));
				List.add(obj);
			}
			}
			catch(SQLException e) {
				throw new Exception("Unable to execute resultset query");
			}
		} catch (Exception e) {
			throw new DBException(ErrorMessages.CONNECTION_FAILURE);
		}
		return List;
	}

	public int getBusNo(int ticketNo) throws DBException {
		int busid = 0;
		String sql = "select bus_no from reserve where ticket_no= ?";
		try (Connection con = ConnectionUtil.getConnection(); PreparedStatement pst = con.prepareStatement(sql);) {
			pst.setInt(1, ticketNo);
			try (ResultSet rs = pst.executeQuery();) {
				
				if (rs.next()) {
					busid = rs.getInt("bus_no");
				}
			}
			catch (Exception e) {
				throw new DBException(ErrorMessages.NO_DATA_FOUND);
			}
		} 
		
		catch (Exception e) {
			throw new DBException(ErrorMessages.CONNECTION_FAILURE);
		}
		return busid;
	}
	

	public void updateNoOfTicket(int ticketNo, int passengerId, int noOfTicket) throws Exception {
		int busid = getBusNo(ticketNo);

		//String sql = "update reserve set no_of_ticket=? where ticket_no=? and pas_id=?";
		//System.out.println(sql);
		
		try (Connection con = ConnectionUtil.getConnection(); ) {
			String sql2 = "update seat_availability set available_seats= available_seats+" + noOfTicket+ " where bus_no=" + busid;
			try(Statement stmt = con.createStatement();){
				int row1 = stmt.executeUpdate(sql2);
				String sql3 = "update reserve r set total_amount = ( (no_of_ticket - ?)*(select amount from bus_time where bus_no=r.bus_no)),"
						+ "no_of_ticket=no_of_ticket- ? where ticket_no = ?";
			try(PreparedStatement pst1 = con.prepareStatement(sql3);){
				pst1.setInt(1, noOfTicket);
				pst1.setInt(2, noOfTicket);
				pst1.setInt(3, ticketNo);
				logger.debug(sql3);
				int row2 = pst1.executeUpdate();
				logger.info(row1);
				logger.info(row2);
		}
			catch(SQLException e) {
				logger.error("Unable to execute preparedstatement query");
			}
			
		}catch(SQLException e) {
			logger.error("Unable to execute statement query");
		}
			
		}
		catch (Exception e) {
			throw new DBException(ErrorMessages.CONNECTION_FAILURE);
		}

	}
	
	
}