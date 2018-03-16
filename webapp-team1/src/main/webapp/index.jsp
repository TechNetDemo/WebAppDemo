<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ page import = "javax.servlet.RequestDispatcher" %>
<%@ page import="com.technet.ConnectDB" %>




<html>
<body bgcolor="eeaaee">
<% out.println("Your IP address is " + request.getRemoteAddr());%>
<h2>This is the index page of webapp-team1</h2>

 
      <table border = "1" width="100%">
         <tr>
            <th>Film ID</th>
            <th>Film Name</th>
            <th>Description</th>
         </tr>		
     

     <jsp:include page="/ConnectDB" />
     </table>
     
     
</body> 
</html>
