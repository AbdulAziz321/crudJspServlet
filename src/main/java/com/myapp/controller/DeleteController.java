package com.myapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myapp.model.User;
import com.myapp.service.UserService;
import com.myapp.service.UserServiceImpl;

/**
 * Servlet implementation class DeleteController
 */
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		int idnew=Integer.parseInt(id);
		System.out.println(idnew);
		UserService userService=new UserServiceImpl();
		int data=userService.deleteUser(idnew);
		 List<User>listUser=userService.getListUser();
		 request.setAttribute("userList", listUser);
		if(data>0) {
		request.getRequestDispatcher("listUser.jsp").forward(request, response);
		out.print("<html><body><h3>deteled</h3></body></html>");
		}
		
	}
		
	}

	

