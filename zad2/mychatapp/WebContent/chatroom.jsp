<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" import="mychatapppack.Post"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<style>
#header {
	text-align: left;
	padding: 5px;
}

#postArea {
	line-height: 30px;
	height: 400px;
	width: 75%;
	padding: 5px;
	float: right;
	overflow-y:scroll;
}

#post {
	position: relative;
	padding: 20px;
}

.tooltip {
	background: rgb(255, 255, 255);
	border-radius: 5px;
	padding: 5px;
	position: relative;
	font-size: 15px;
	width: 300px;
	line-height: 15px;
	padding: 10px;
	text-align: justify;
	color: rgb(0, 0, 0);
	border: 2px solid rgb(0, 0, 0);
}

.tooltip:after {
	content: "";
	position: absolute;
	width: 0;
	height: 0;
	border-width: 10px;
	border-style: solid;
	border-color: transparent transparent black transparent;
	top: -22px;
	left: 5px;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Chatroom</title>
</head>

<body>

	<div id="header">
		<h1>My Chat APP !</h1>
	</div>

	<div id="postArea">
		<%
			ArrayList<Post> posts = (ArrayList<Post>) application.getAttribute("posts");
			if (posts != null) {
				for (int i = 0; i < posts.size(); i++) {
		%>
		<div id="cell">
			<%=posts.get(i).getUser()%>
			<div class="tooltip">
				<%=posts.get(i).getMsg()%>
				<br>
			</div>
		</div>
		<%
			}
			}
		%>
		<br>
	</div>

	<div id="post">
		<br>
		<center>
			<form action="MessageServlet" method="post">
				<textarea name="message" cols="50" rows="5"> </textarea>
				<input type="submit" value="Send"> <input type="button"
					onClick="history.go (0)" value="Refresh">
			</form>
		</center>
	</div>
</body>
</html>