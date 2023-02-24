package com.myapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myapp.model.User;
import com.myapp.service.UserService;
import com.myapp.service.UserServiceImpl;

/**
 * Servlet implementation class UpdateController
 */
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		request.setAttribute("myname", id);
	
			request.getRequestDispatcher("update.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 PrintWriter out=response.getWriter();
		 String userId=request.getParameter("userId");
		 int useId=Integer.parseInt(userId);
		 String username=request.getParameter("username");
		 String email=request.getParameter("email");
		 Integer mobileNo=Integer.parseInt(request.getParameter("mobileNo"));
		 String address=request.getParameter("address");
		 String panNo=request.getParameter("panNo");
		 String city=request.getParameter("city");
		 
	   // model used for
		 User user=new User();
		 user.setUserId(useId);
		 user.setUsername(username);
		 user.setEmail(email);
		 user.setMobileNo(mobileNo);
		 user.setAddress(address);
		 user.setPanNo(panNo);
		 user.setCity(city);
		 UserService userService=new UserServiceImpl();
		 int row=userService.updateUser(user);
		if(row>0) {
			request.getRequestDispatcher("addUser.jsp").forward(request, response);
			out.print("<html><body><h3>Update User added</h3></body></html>");
			
		}
	}
		


}
