package BusTicket;

import java.util.Scanner;

import BusTicket.BusList.BusTicketManagerImplimentation;
import BusTicket.Login.LoginDAOImplementation;
import BusTicket.TestUserLogin.LoginMainpage;
import BusTicket.TestUserLogin.TestUserRegister;
import BusTicket.UserLogin.UserLoginDAOImplementation;

public class TestCall {
public static void main(String[] args) throws Exception {
	Scanner sc=new  Scanner(System.in);
	System.out.println("Chose Your Login:\n1.Admin Login:\n2.User Login:\n3.User Registration:");
	int test=sc.nextInt();
	switch(test)
	{
	case 1:
		LoginMainpage bus=new LoginMainpage();
		 bus.admin();
		 break;
	case 2:
		LoginMainpage bus1=new LoginMainpage();
		 bus1.user();
		 break;
	case 3:
		TestUserRegister.main(null);
		break;
	}
}
}
