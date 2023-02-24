package com.myapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myapp.dao.UserDaoImpl;
import com.myapp.model.User;
import com.myapp.service.UserService;
import com.myapp.service.UserServiceImpl;

/**
 * Servlet implementation class UserController
 */
//@WebServlet("UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 PrintWriter out=response.getWriter();
		 String username=request.getParameter("username");
		 String email=request.getParameter("email");
		 Integer mobileNo=Integer.parseInt(request.getParameter("mobileNo"));
		 String address=request.getParameter("address");
		 String panNo=request.getParameter("panNo");
		 String city=request.getParameter("city");
		 
	   // model used for
		 User user=new User();
		 user.setUsername(username);
		 user.setEmail(email);
		 user.setMobileNo(mobileNo);
		 user.setAddress(address);
		 user.setPanNo(panNo);
		 user.setCity(city);
		 UserService userService=new UserServiceImpl();
		 int row=userService.addUser(user);
		if(row>0) {
			request.getRequestDispatcher("addUser.jsp").forward(request, response);
			out.print("<html><body><h3>User added</h3></body></html>");
			
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		 UserService userService=new UserServiceImpl();
		 List<User>listUser=userService.getListUser();
		 request.setAttribute("userList", listUser);
		 System.out.println("listUser");
			request.getRequestDispatcher("listUser.jsp").forward(request, response);
	}




}
	
	
	
	