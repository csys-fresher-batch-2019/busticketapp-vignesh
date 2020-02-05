package BusTicket.TestUserLogin;

import java.util.Scanner;

import BusTicket.UserLogin.UserLogin;
import BusTicket.UserLogin.UserLoginDAOImplementation;

public class TestUserRegister {

	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		UserLoginDAOImplementation impl = new UserLoginDAOImplementation();
		UserLogin obj = new UserLogin();
		System.out.println("Ener user name:");
		obj.UserName=sc.next();
		System.out.println("Enter the emailId:");
		obj.EmailId=sc.next();
		System.out.println("Enter the password:");
		obj.password=sc.next();
		System.out.println("Enter the mobileNumber:");
		obj.contactNumber=sc.nextLong();
		System.out.println("Enter the UserId:");
		obj.UserId=sc.nextInt();
		
		impl.NewUserRegister(obj);
		
		
	}

}
