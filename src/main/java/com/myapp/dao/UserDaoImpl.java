package com.myapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.myapp.model.User;
import com.util.DbConnection;

public class UserDaoImpl implements UserDao {


	public int addUser(User user) {
		// TODO Auto-generated method stub
		Connection con=null;
		int row=0;
		try {
			 con=DbConnection.getConnection();
			 PreparedStatement ps=con.prepareStatement("insert into user(username,email,mobileNo,address,city,panNo) values(?,?,?,?,?,?)");
			 ps.setString(1, user.getUsername());
			 ps.setString(2, user.getEmail());
			 ps.setLong(3, user.getMobileNo());
			 ps.setString(4, user.getAddress());
			 ps.setString(5, user.getPanNo());
			 ps.setString(6, user.getCity());
			  row=ps.executeUpdate();
			 if(row>0) {
				 System.out.println("data update" +row);
			 }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return row;
	}

	public List<User> getListUser() {
		// TODO Auto-generated method stub
		List<User>list=new ArrayList<User>();
		try {
			Connection con=DbConnection.getConnection();
			 PreparedStatement ps=con.prepareStatement("select * from user");
			 ResultSet resultSet=ps.executeQuery();
			 while(resultSet.next()) {
				 User user=new User();
				 int userId = resultSet.getInt("userId");
				 String username = resultSet.getString("username");
				 String email = resultSet.getString("email");
				 long mobileNo = resultSet.getInt("mobileNo");
				 String address = resultSet.getString("address");
				 String panNo = resultSet.getString("panNo");
				 String city = resultSet.getString("city");
				 user.setUserId(userId);
				 user.setUsername(username);
				 user.setEmail(email);
				 user.setMobileNo(mobileNo);
				 user.setAddress(address);
				 user.setPanNo(panNo);
				 user.setCity(city);
				 list.add(user);
			 }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

	public int deleteUser(int userId) {
		Connection con=null;
		int row=0;
		try {
			 con=DbConnection.getConnection();
			 PreparedStatement ps=con.prepareStatement("delete from User where userId="+userId+"");
			  row=ps.executeUpdate();
			 if(row>0) {
				 System.out.println("data delete" +row);
			 }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return row;
	}

	public int updateUser(User user) {
		Connection con=null;
		int row=0;
		try {
			 con=DbConnection.getConnection();
			 PreparedStatement ps=con.prepareStatement("update user set username=?,email=?,mobileNo=?,address=?,city=?,panNo=? where userId="+user.getUserId()+"");
			 ps.setString(1, user.getUsername());
			 ps.setString(2, user.getEmail());
			 ps.setLong(3, user.getMobileNo());
			 ps.setString(4, user.getAddress());
			 ps.setString(5, user.getPanNo());
			 ps.setString(6, user.getCity());
			  row=ps.executeUpdate();
			 if(row>0) {
				 System.out.println("data update" +row);
			 }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return row;
	}

	
}
 