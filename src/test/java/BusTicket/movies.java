package BusTicket;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class movies {
	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
		System.out.println(connection);
		Statement stmt=connection.createStatement();
		String type1="premium";
		int movieId=3;
		//int discount = 20;//declare discount value
		//String sql= " insert into movies(movie_id,movie_name,active) values (3,'hero',1)";
		//String sql= " insert into movies(movie_id,movie_name,active) values (seq_movie_id.nextval,'darbar',3)";
	    //String sql= "update movies set active=1 where movie_name='darbar'";
		//String sql= "update movies set release_date = to_date('17-01-2019') where movie_name='darbar'";
		//String sql= "update movies set ticket_cost=200 where movie_name='darbar'";
		//String sql= "update movies set ticket_cost=-(200*.10) where movie_name='darbar'";//offer 20 %
		//String sql= "update movies set ticket_cost=ticket_cost-(ticket_cost*("+ discount +"/100)) where movie_name='darbar'";//true discount
		//String sql= " insert into movie_price (movie_id,type1,price) values (3,'nonpremium',100)";
		//String sql= "update movies set type='premium' where movie_name='darbar'";//set primium
		//String sql= " update movie_price set type1='premium' where movie_id=3";
		//String sql= " update movie_price set price=2000 where movie_id=3";
		//String sql="select price from movie_price where type1= ? and movie_id= ?";
		//String sql= " insert into movie_theatre(movie_id,theatre_name) values (10,'luxe')";
		//String sql= " insert into booking(theatre_id,mobile_number,ticket_booked,status) values (1,8888811111,10,'booked')";
		//String sql= " insert into booking(theatre_id,mobile_number,ticket_booked,status) values (2,8888822222,20,'waiting')";
		//String sql="select theatre_name from movie_theatre where movie_id= (select movie_id from movies where movie_name='darbar')";
		//String sql="select price from movie_price where movie_id in (select movie_id from movie_theatre where theatre_name='vetri')";
		//String sql="select ticket_booked from booking where theatre_id=1";
		String sql="select sum(ticket_booked)as ticket_booked from booking";
		//PreparedStatement pst= connection.prepareStatement(sql);
		//pst.setString(1,type1);
	    //pst.setInt(2, movieId);
   	   // ResultSet rows=pst.executeQuery();
		
		
		ResultSet rows= stmt.executeQuery(sql);
		if(rows.next()) {
			//int movie_price= rows.getInt("price");
			int price= rows.getInt("ticket_booked");
			System.out.println(price);
			
		}
		
		/*while(rows.next())//many rows output display 
		{
			String theatre_name=rows.getString("theatre_name");
			System.out.println(theatre_name);
		}*/
		
		/*if(rows.next())//only one statement will be display
		{
			String theatre_name=rows.getString("theatre_name");
			System.out.println(theatre_name);
		}
		*/
		
	/*inset statements 	
		int row=stmt.executeUpdate(sql);
		System.out.println("No.of row selected:"+row);*/ //end
		/*while(rows.next())
		{
			int price=rows.getInt("price");
			System.out.println(price);
	
	}*/
}
}