<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.Inch"%>
   <%
   Inch inch=(Inch)request.getAttribute("inch");
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>inch変換</title>
</head>
<body>
<p>
<%= inch.getInch() %>
inchは
<%= inch.getCm() %>
cmです。
</p>
<a href="/inchapp/Main">戻る</a>
</body>
</html>