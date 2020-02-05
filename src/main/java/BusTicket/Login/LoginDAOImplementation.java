package BusTicket.Login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import BusTicket.TestConnections;

public class LoginDAOImplementation implements LoginDAO {
	public boolean AdminLogin(String Adminname, String pass) throws Exception {
		Connection con = TestConnections.getConnection();
		Statement stmt = con.createStatement();
		if (stmt.executeUpdate("select Admin_name from AdminRegister where Admin_name='" + Adminname + "'") != 0) {
			ResultSet rs = stmt
					.executeQuery("select pass_word from AdminRegister where Admin_name ='" + Adminname + "'");
			rs.next();
			if (pass.equals(rs.getString("pass_word"))) {
				return true;
			}

			return false;
		}
		return false;
	}
	// user Login

	public boolean user(String name, String pass) throws Exception {

		Connection con = TestConnections.getConnection();
		Statement stmt = con.createStatement();
		if (stmt.executeUpdate("select name from UserRegister where name='" + name + "'") != 0) {
			ResultSet rs = stmt.executeQuery("select password from UserRegister where name='" + name + "'");
			rs.next();
			if (pass.equals(rs.getString("password"))) {
				return true;
			}

			return false;
		}
		return false;
	}
}
