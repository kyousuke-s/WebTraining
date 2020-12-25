<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
String[] hands={"gu.png","choki.png","pa.png"};
String[] result={"あいこです","アナタのまけです","アナタのかちです!"};
String hand=request.getParameter("hand");
%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="css/main.css">
  <link href="https://fonts.googleapis.com/earlyaccess/nicomoji.css" rel="stylesheet">
  <title>じゃんけんぽん</title>
</head>
<body>
  <form method="post">
    <input type="radio" name="hand" value="0">ぐー<br>
    <input type="radio" name="hand" value="1">ちょき<br>
    <input type="radio" name="hand" value="2">ぱー<br>
    <button type="submit" name="btn">ショウブ</button>
  </form>
	<div>
  <%if(hand != null){ %>
  	<img src="images/<%=hands[Integer.parseInt(request.getParameter("hand"))] %>">
  	<%int index=(int)(Math.random()*3) ;%>
  	<img src="images/<%=hands[index] %>">
  	</div>
  	<% int diff=(Integer.parseInt(request.getParameter("hand")) + 3 - index)%3;%>
  	<p><%=result[diff] %></p>
	<%} %>
</body>
</html>