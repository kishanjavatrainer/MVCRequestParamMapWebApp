<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/MVCRequestParamMapWebApp/registerSuccess" method="post">
		<table>

			<tr>
				<td>User Name</td>
				<td><input type="text" name="name"></td>
			</tr>

			<tr>
				<td>Email</td>
				<td><input type="text" name="email"></td>
			</tr>


			<tr>
				<td>Age</td>
				<td><input type="text" name="age"></td>
			</tr>

			<tr>
				<td>Country</td>
				<td><select name="country">
						<option value="India">India</option>
						<option value="US">US</option>
						<option value="Other">Other</option>
				</select></td>
			</tr>

			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>


		</table>
	</form>
</body>
</html>