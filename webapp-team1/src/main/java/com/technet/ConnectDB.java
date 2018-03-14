package com.technet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class ConnectDB
 */
public class ConnectDB extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConnectDB() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Drive found");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found: " + e);
		}
		String url = "@@@db_url@@@";
		String user = "@@@db_user@@@";
		String password = "@@@db_password@@@";
		String dbname = "@@@dbname@@@";

		try {
			request.getRequestDispatcher("/team1_topHalf.jsp").include(request, response);
			
			Connection con = null;

			con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection Success");
			Statement statement = con.createStatement();
			PrintWriter out = response.getWriter();
			String sql = "Select * from " + dbname;
			ResultSet rs = statement.executeQuery(sql);



			for (int i = 0; rs.next(); i++) {
				String film_id = rs.getString("film_id");
				String title = rs.getString("title");
				String description = rs.getString("description");

				out.println("<tr>");
				out.println("<td>"+ film_id +"</td>");
				out.println("<td>"+ title +"</td>");
				out.println("<td>"+ description +"</td>");
				out.println("</tr>");

			}

			out.println("</table></body></html>");
			
			return;
			

		} catch (SQLException e) {
			System.out.println("Connection string misconfigured?: " + e);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	/*
	 * protected void doPost(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { // TODO Auto-generated
	 * method stub }
	 */

}
