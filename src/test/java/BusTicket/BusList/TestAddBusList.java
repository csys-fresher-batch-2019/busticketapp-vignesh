package BusTicket.BusList;
import java.sql.Statement;
import java.util.Scanner;

import BusTicket.BusList.BusTicketManagerImplimentation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
//TestBusTicket
public class TestAddBusList {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the BusNo:");
		int BusNo = sc.nextInt();
		
		System.out.println("Enter the Busname:");
		String BusName = sc.next();
		
		System.out.println("Enter the busSource:");
		String BusSource = sc.next();
		
		System.out.println("Enter the busDestination:");
		String BusDestination = sc.next();
		
		System.out.println("Enter the busClass:");
		String Class = sc.next();
		
		BusTicketManagerImplimentation Busimpl=new BusTicketManagerImplimentation();
		//Busimpl.addBuslist(1244,"abcd","kovai","madurai","sleeper");
		
		Busimpl.addBuslist(BusNo,BusName,BusSource,BusDestination,Class);
		
	}

}