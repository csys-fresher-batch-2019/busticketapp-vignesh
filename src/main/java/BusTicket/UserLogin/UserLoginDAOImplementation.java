package busticket.userlogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.chainsys.busticketapp.dao.UserLoginDAO;
import com.chainsys.busticketapp.model.UserLogin;
import com.chainsys.busticketapp.util.ConnectionUtil;

public class UserLoginDAOImplementation implements UserLoginDAO {
	UserLogin obj=new UserLogin();
	public void NewUserRegister(UserLogin obj) throws Exception{
		String sql="insert into UserRegister(name,Email_id,password,contact,user_id) values(?,?,?,?,?)";
		Connection con = ConnectionUtil.getConnection();
		System.out.println(sql);
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, obj.UserName);
		pst.setString(2, obj.EmailId);
		pst.setString(3, obj.password);
		pst.setLong(4, obj.contactNumber);
		pst.setInt(5, obj.UserId);
		int row=pst.executeUpdate();
		System.out.println(row);
		
	}
	public void RemoveUser(int UserId)throws Exception{
		String sql="delete from UserRegister where user_id="+UserId;
		Connection con = ConnectionUtil.getConnection();
		//System.out.println(sql);
		Statement stmt=con.createStatement();
		int row=stmt.executeUpdate(sql);
		System.out.println(row);
	
		
	}
}
