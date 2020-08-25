<%--
  Created by IntelliJ IDEA.
  User: John Doe
  Date: 2020-08-25
  Time: 오후 6:33
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
        Cookie[] cookies = request.getCookies();
        for(Cookie c : cookies){
            out.print("name : "+c.getName()+"<br>");
        }
    %>

</body>
</html>
