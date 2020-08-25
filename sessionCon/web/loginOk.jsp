<%--
  Created by IntelliJ IDEA.
  User: John Doe
  Date: 2020-08-25
  Time: 오후 7:04
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
        session = request.getSession();
        out.print("memID : "+ session.getAttribute("ID"));
    %>
    <form action = "logoutCon" methods = "post">
        <input type = "submit" value = "logout">
    </form>
</body>
</html>
