<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ page import = "javax.servlet.RequestDispatcher" %>
<%@ page import="com.technet.*" %>


<html>
<body bgcolor="abcdef">
<% out.println("Your IP address is " + request.getRemoteAddr());%>
<h2>This is the abandoned jsp of webapp-team1</h2>
 
      <table border = "1" width="100%">
         <tr>
            <th>Film ID</th>
            <th>Film Name</th>
            <th>Description</th>
         </tr>		

