<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo4 learn Jsp</title>
</head>
<body>
	
	<form action="CartServlet" method="post">
		<table>
			<tr>
				<td>物品</td>
				<td><input type="text" name="goods"/></td>
			</tr>
			<tr>
				<td>数量</td>
				<td><input type="text" name="num"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="放入购物车"/><input type="reset" value="重置"/></td>
			</tr>
		</table>
	</form>
</body>
</html>