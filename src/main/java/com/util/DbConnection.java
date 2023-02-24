package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DbConnection {

		public static Connection getConnection() throws SQLException, ClassNotFoundException{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/adil","root","root");  
			
			return con;
			
		}
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			System.out.println("DBConnnection.main()"+DbConnection.getConnection());
		}
}
