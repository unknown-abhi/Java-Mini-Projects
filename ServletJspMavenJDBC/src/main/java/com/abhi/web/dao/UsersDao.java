package com.abhi.web.dao;

import com.abhi.web.model.Users;
import java.sql.*;

public class UsersDao {

	String url = "jdbc:mysql://localhost:3306/loginmodule";
	String username = "root";
	String password = "rootAbhi";
	String query = "select * from users where idusers=?";

	public Users getUsers(int uID) {

		Users u = new Users();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);

			PreparedStatement pS = con.prepareStatement(query);
			pS.setInt(1, uID);

			ResultSet rS = pS.executeQuery();
			if (rS.next()) {
				u.setiD(rS.getInt("idusers"));
				u.setPassword(rS.getString("password"));
				u.setUserName(rS.getString("username"));
				u.setUserEmail(rS.getString("user_email"));
				u.setUserPhoneNo(rS.getString("user_phoneno"));
			} else {
				throw new RuntimeException("User With ID : " + uID + ". Is not available.");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
}
