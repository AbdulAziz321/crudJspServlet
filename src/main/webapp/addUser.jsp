<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="UserController" method="Post">
		<h3>add User</h3>
		<table>
			<tr>
				<td>username</td>
				<td><input type="text" name="username"></td>
				<td>email</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>mobileNo</td>
				<td><input type="text" name="mobileNo"></td>
				<td>address</td>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<td>PanNo</td>
				<td><input type="text" name="panNo"></td>
				<td>City</td>
				<td><input type="text" name="city"></td>
			</tr>
		</table>
		<input type="submit" value="save"> <br> <a
			href="listUser">Vier User</a>
	</form>
</body>
</html>