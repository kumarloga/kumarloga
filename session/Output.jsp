<%-- 
    Document   : Output
    Created on : 30 Jun, 2021, 8:24:21 PM
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
               
          int res=Integer.parseInt(session.getAttribute("data").toString());
          int t=Integer.parseInt(session.getAttribute("two").toString());
          int s=Integer.parseInt(session.getAttribute("three").toString());
          
          out.println(res+t+s);
            
            
            
            
          
           
           
           %>
        
       
    </body>
</html>
