<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="/ServletLearn/HelloServlet">click me</a>
	
	<form action="/ServletLearn/HelloServlet">
		用户名(get):<input type="text" name="username" /> <br/>
		密码(get):<input type="text" name="upwd" /> <br/>
		<input type="submit" value="提交">
	</form>
	
	<form action="/ServletLearn/SecondServlet" method="post">
		用户名(post):<input type="text" name="username" /> <br/>
		密码(post):<input type="text" name="upwd" /> <br/>
		<input type="submit" value="提交">
	</form>
</body>
</html>