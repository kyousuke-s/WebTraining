<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Hero" %>
<% Hero hero = (Hero) request.getAttribute("hero"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>
<%= hero.getName() %><br>
<%//for文でやってみる
String str=(String)String.join(",",(String)hero.getStatus());
%>
<%= str %><br>
</p>
<form action="/selfapp/HeroMake" method="post">
種族を選んで下さい<br>
0.人間<input type="radio" name="race" value="0">
<input type="submit" value="決定">
</form>
</body>
</html>