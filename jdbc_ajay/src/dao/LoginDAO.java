package dao;
import java.sql.*;

import connectionManager.ConnectionManager;
import model.Login;
public class LoginDAO {

	public boolean validate(Login login) throws ClassNotFoundException,SQLException
	{
		String username=login.getUsername();
		String password=login.getpassword();
		ConnectionManager conn = new ConnectionManager();
		Connection con = conn.establishConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from login");
		while(rs.next())
		{
			if(username.equals(rs.getString("username"))&&password.equals(rs.getString("password")))
			{
				conn.closeCConnection();
				return true;
			}
		}
		conn.closeCConnection();
		return false;
	}

}
