package busticket.testuserlogin;

import java.util.Scanner;

import com.chainsys.busticketapp.dao.impl.UserLoginDAOImplementation;

public class TestdeleteUserLoign {

	public static void main(String[] args) throws Exception {
		UserLoginDAOImplementation impl = new UserLoginDAOImplementation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter delete UserID:");
		int userId = sc.nextInt();
		impl.removeUser(userId);

	}

}
