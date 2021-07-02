<%-- 
    Document   : Questions
    Created on : 1 Jul, 2021, 8:11:50 PM
    Author     : kumar
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.io.PrintWriter"%>
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
               out.println("SIGN IN IS SUCCESSFULLY DONE");
           
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/kumar","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select * from questions");
          while(rs.next()){
              String no1=rs.getString(1);
              String question=rs.getString(2);
              String A=rs.getString(3); 
              String B=rs.getString(4);
              String C=rs.getString(5);
              String D=rs.getString(6);
              String Ans=rs.getString(7);
               out.println("<br><br>"+no1+question); 
               out.println("<br>"+A+"<br>"+B+"<br>"+C+"<br>"+D);
               out.println("<br><h1>'"+Ans+"'</h1>");
              
         }
           }
           catch(Exception ex){
           out.println(ex);
           }
    %>
    </body>
</html>
