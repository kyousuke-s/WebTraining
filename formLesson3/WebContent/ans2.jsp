<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>九九表</title>
</head>
<body>
<div style="margin:0 auto; text-align:center;">
<h1 style="margin:0 auto;">九九表</h1>
<table style="border:solid 2px #333; margin:0 auto; text-align:left;">
<% for(int i=1;i<=9;i++){%>
<tr style="border:solid 2px #333;">
<%for(int j=1;j<=9;j++){ %>
<td style="border:solid 2px #333;"><%=i*j %></td>
<%} %>
</tr>
<%} %>
</table>
</div>
</body>
</html>