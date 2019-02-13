<%--
  Created by IntelliJ IDEA.
  User: Alexander
  Date: 29.01.2019
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show User's cart</title>
</head>
<body>
    <%@ page import="logic.Cart" %>
    <% Cart cart = (Cart) session.getAttribute("cart"); %>

    <p>Наименование: <%= cart.getName() %></p>
    <p>Количество: <%= cart.getQuantity()%></p>

</body>
</html>
