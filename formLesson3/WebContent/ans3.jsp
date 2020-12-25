<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/formLesson3/AnsServlet" method="post">
スペイン語で月曜はLunesである。
<label><input type="radio" name="choose" value="0">はい</label>
<label><input type="radio" name="choose" value="1">いいえ</label>
<input type="submit" value="送信">
</form>
</body>
</html>