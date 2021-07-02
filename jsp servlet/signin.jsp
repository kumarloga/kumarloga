<%-- 
    Document   : signin
    Created on : 27 Jun, 2021, 8:51:22 PM
    Author     : Vijay
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
           try{
               String username=request.getParameter("username");
            String password=request.getParameter("password");
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kumar","root","");
            Statement st=c.createStatement();
            ResultSet rs=st.executeQuery("select * from sign where username='"+username+"' and  password='"+password+"'");
            if(rs.next()){
           
            out.println("login");
            response.sendRedirect("questions.jsp");
            }
            else 
            {
            out.println("unsuccessfull");
                    }
       
           }
           catch(Exception ex){
               out.println(ex);
           
           }
       %>
    </body>
</html>
