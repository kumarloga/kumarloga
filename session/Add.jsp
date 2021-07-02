<%-- 
    Document   : Add
    Created on : 30 Jun, 2021, 9:13:26 PM
    Author     : Vijay
--%>

<%@ page import="java.io.*"%><%@
page import="java.util.*"%><?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<%
        String sum = (String) session.getAttribute("sum");
        if (sum==null) {
                sum = "0";
                session.setAttribute("sum",sum);
        }
        int isum = Integer.parseInt(sum);
        String fib1 = "8";
        int ifib1 = Integer.parseInt(fib1);
        String fib2 = "13";
        int ifib2 = Integer.parseInt(fib2);
        isum=ifib1+ifib2;

        if(request.getParameter("number").equals(isum))
        {
                if(request.getParameter("submit") != null){
                out.print("correct");
                }
        }
%>
<body>
        <%=fib1%> + <%=fib2%> = <input type="text" name="number">
        <input type="button" value="go" onclick="doTheGObutton();">
        <form action="Add.jsp" method="POST">
        <input type="submit" value="continue">
        </form>

</body>
</html>
