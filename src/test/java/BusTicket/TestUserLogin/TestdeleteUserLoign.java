package busticket.testuserlogin;

import java.util.Scanner;

import busticket.userlogin.UserLoginDAOImplementation;

public class TestdeleteUserLoign {

	public static void main(String[] args) throws Exception {
		UserLoginDAOImplementation impl = new UserLoginDAOImplementation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter delete UserID:");
		int UserId=sc.nextInt();
		impl.RemoveUser(UserId);

	}

}
