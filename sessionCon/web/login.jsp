<%--
  Created by IntelliJ IDEA.
  User: John Doe
  Date: 2020-08-25
  Time: 오후 6:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset = "utf-8">
    <title>Title</title>
</head>
<body>
<%
    if(session.getAttribute("ID") != null){
        response.sendRedirect("loginOK.jsp");
    }
%>
<form action = "loginCon" method = "post">
    ID : <input type = "text" name = "ID"><br>
    PW : <input type = "password" name = "PW"><br>
    <input type = "submit" value = "login">
</form>
</body>
</html>
