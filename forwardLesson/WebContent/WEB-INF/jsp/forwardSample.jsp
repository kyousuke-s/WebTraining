<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String fortune=(String)request.getAttribute("ft");
    String weather=(String)request.getAttribute("wt");
    Integer comfort=(Integer)request.getAttribute("ci");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>フォワードのサンプル</h1>
<p><%=weather %></p>
<p><%=comfort %></p>
<p><%=fortune %></p>
</body>
</html>