<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo4 learn Jsp</title>
</head>
<body>
	
	<form action="/ServletLearn/Jump2" method="post">
		<table>
			<tr>
				<td>用户名</td>
				<td><input type="text" name="uname"/></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="upwd"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="登录"/><input type="reset" value="重置"/></td>
			</tr>
		</table>
	</form>
</body>
</html>