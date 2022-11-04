package projcet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			 
		//getting connection
		Connection con;
		Statement st;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","1Sagar.@");
		//for retriving parameter
		String n=request.getParameter("txtname");
		String p=request.getParameter("txtpwd");
PreparedStatement ps=con.prepareStatement("select uname from login where uname=? and password=?");
ps.setString(1,n);
ps.setString(2,p);
ResultSet rs=ps.executeQuery();
if(rs.next()) { 
	RequestDispatcher rd=request.getRequestDispatcher("Welcome.html");
rd.forward(request, response);}
else {
out.println("<html><body><h1 color:red>Login failed</h1><br><a href=login.jsp>TryAgain</a></body></html>");
}}
catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}}}
	

