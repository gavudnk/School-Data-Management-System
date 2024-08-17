package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.util.*;

public class KuDAO {
	String url = "jdbc:mysql://localhost:3306/school";
	
	String username = "root";
	
	String password = "";
	
	String sql = "INSERT INTO student(SID, Name, Address) VALUES (?, ?, ?)";
	
	String sqld ="DELETE FROM student where SID = ?";
	
	String sqlt = "INSERT INTO teacher(tid, Name, address) VALUES (?, ?, ?)";
	
	String sqltd = "DELETE FROM teacher where tid = ?";
	
	String sqle = "INSERT INTO exam(eid, Name, duration) VALUES (?, ?, ?)";
	
	String sqled = "DELETE FROM exam where eid = ?";
	
	String sqls = "INSERT INTO subject(subid, Name, lecInCh) VALUES (?, ?, ?)";
	
	String sqlsd = "DELETE FROM subject where subid = ?";
	
	
	
	//Method to input Student Information
	
	public void inputstudent(int sid, String name, String Address)
	
	{
	
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, sid);
			st.setString(2, name);
			st.setString(3, Address);
			int count = st.executeUpdate();
		
			
			con.close();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
	
	}
	
	//Method to delete Student Information based on the ID
	
	public void deletestudent(int id)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sqld);	
			st.setInt(1, id);
			int count = st.executeUpdate();
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		
	}
	
	
	//Method to input Teacher Information
	
	public void inputTeacher(int tid, String tname, String tAddress)
	
	{
	
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sqlt);
			st.setInt(1, tid);
			st.setString(2, tname);
			st.setString(3, tAddress);
			int count = st.executeUpdate();
		
			
			con.close();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
	
	}
	
	//Method to delete Teacher Information based on the ID
	
		public void deleteteacher(int id)
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement st = con.prepareStatement(sqltd);	
				st.setInt(1, id);
				int count = st.executeUpdate();
				con.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
				
			
		}
	
	//Method to input Exam Information
	
	public void inputExam(int tid, String tname, String tAddress)
	
	{
	
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sqle);
			st.setInt(1, tid);
			st.setString(2, tname);
			st.setString(3, tAddress);
			int count = st.executeUpdate();
		
			
			con.close();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
	
	}
	
	//Method to delete Exam Information based on the ID
	
			public void deleteexam(int id)
			{
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url, username, password);
					PreparedStatement st = con.prepareStatement(sqled);	
					st.setInt(1, id);
					int count = st.executeUpdate();
					con.close();
					
				}catch(Exception e) {
					e.printStackTrace();
				}
					
				
			}	
	
	//Method to input Subject Information
	
	public void inputSubject(int tid, String tname, String tAddress)
	
	{
	
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sqls);
			st.setInt(1, tid);
			st.setString(2, tname);
			st.setString(3, tAddress);
			int count = st.executeUpdate();
		
			
			con.close();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
	
	}

	//Method to delete Subject Information based on the ID
	
	public void deletesubject(int id)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sqlsd);	
			st.setInt(1, id);
			int count = st.executeUpdate();
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		
	}	



}
