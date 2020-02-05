package BusTicket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserAcc {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		System.out.print("Enter your id : ");
		int PasId = obj.nextInt();
		boolean result = login(PasId);
		if (result) {

			System.out.println("Login Succesfully ");
		}
		else {

			System.out.println("Login failed ");
		}
		
		obj.close();
	}

	public static boolean login(int password) throws Exception {

		boolean result = false;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
		System.out.println(connection);
		Statement stmt = connection.createStatement();

		String sql = "select pas_id from passenger where pas_id =" + password;
		ResultSet rs = stmt.executeQuery(sql);
		if (rs.next()) {
			result = true;
		} else {
			result = false;

		}
		return result;

	}

}
