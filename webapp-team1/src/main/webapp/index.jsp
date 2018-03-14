<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  





<html>
<body bgcolor="55ee55">
<% out.println("Your IP address is " + request.getRemoteAddr());%>
<h2>This is the Forbidden Index.jsp</h2>
<%= request.getAttribute("str1") %>

 <% String[] idArray = (String[])request.getAttribute("idArray"); %>
 <% String[] jspArray = {"aaa","bbb","ccc"}; %>
 <% String str1 = (String)request.getAttribute("str1"); %>
 
 
      <table border = "1" width="100%">
         <tr>
            <th>Film ID</th>
            <th>Film Name</th>
            <th>Description</th>
            <th><%=str1 %> </th>
         </tr>		
     </table>


      
</body>
</html>
