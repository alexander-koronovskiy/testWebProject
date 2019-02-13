<%--
  Created by IntelliJ IDEA.
  User: Alexander
  Date: 27.01.2019
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
<h1>Test Jsp</h1>

<%@ page import="java.util.Date, logic.TestClass"  %>

<%
    TestClass testClass = new TestClass();
%>
<p>
    <% out.println("Hello, user!"); %>
</p>
<p>
    <%= testClass.getInfo() + new Date() %>
<%
    String name = request.getParameter("name");
    out.print("Hello, user " + name);
%>
</p>

</body>
</html>
