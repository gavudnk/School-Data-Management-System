package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/LogIn")
public class LogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try {
		    	String UserName = request.getParameter("UserName");
		    	String Password = request.getParameter("Password");
		    	String logUserName = null;
		    	String logPassword = null;
		    	String sql9 = "SELECT * FROM registration WHERE UserName = ? AND Password = ?";
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root", "");
				PreparedStatement ps = conn.prepareStatement(sql9);
				ps.setString(1, UserName);
				ps.setString(2, Password);
				ResultSet rs = ps.executeQuery();
				PrintWriter out = response.getWriter();
				while(rs.next()) {
					logUserName = rs.getString("UserName");
					logPassword = rs.getString("Password");
				}
				if(UserName.equals(logUserName) && Password.equals(logPassword)) {
					out.println("Login Successful");
					response.sendRedirect("HTML.jsp");
				}else {
					response.sendRedirect("index.jsp");
					RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
					rd.include(request, response);
				}
				
				
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
	}

}
