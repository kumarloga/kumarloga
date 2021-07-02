<%-- 
    Document   : One
    Created on : 30 Jun, 2021, 8:23:33 PM
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
        
        String one=request.getParameter("n");
         session.setAttribute("data",one);
         String sec =request.getParameter("two");
         session.setAttribute("two", sec);
          String three=request.getParameter("three");
           session.setAttribute("three", three);
       
        out.println(one);
       
        
        
        %>
        <a href="Two.jsp"> Next page</a>
    </body>
</html>
