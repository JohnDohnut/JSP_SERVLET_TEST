<%--
  Created by IntelliJ IDEA.
  User: John Doe
  Date: 2020-08-25
  Time: 오후 5:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset = "UTF-8">
    <title>Title</title>
</head>
<body>
<%!
    String Status;
%>
<%
    Status = (String)application.getInitParameter("status");
    System.out.println(Status);
    application.setAttribute("status","abnormal");
    Status = (String)application.getAttribute("status");
    System.out.println(Status);

%>
</body>
</html>
