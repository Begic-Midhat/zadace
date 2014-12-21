<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>

	<table width=100%>
		<tr height=30%>
			<td COLSPAN=3 height=100%><h1>My Chat APP!</h1></td>
		</tr>
		<tr height=70%>
			<td height=500 width=38%></td>
			<td valign=middle>
				<form action="LoginServlet" method="post">
					Username:<br>
					<br> <input type="text" name="userName" /> &nbsp <input type="submit" value="Login" />
				</form>
			</td>
			<td></td>
		</tr>
	</table>

</body>
</html>