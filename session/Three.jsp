<%-- 
    Document   : Three
    Created on : 30 Jun, 2021, 8:24:06 PM
    Author     : Vijay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
        
        String the=session.getAttribute("three").toString();
       
        out.println(the);
        
        %>
        <a href="Output.jsp"> Next page</a>
    </body>
</html>
