<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login page</h1>
	<form:form method="post" action="login.do" modelAttribute="loginForm">
		<div>
			<label for="email">Email:</label>
			<div>
				<form:input path="email" id="email" placeholder="your@email.com" required="required"/>
				<form:errors path="email"/>
			</div>
		</div>
		<div>
			<label for="password">Password:</label>
			<div>
				<form:password path="password" id="password" placeholder="min 6 characters" required="required"/>
				<form:errors path="password"/>
			</div>
		</div>
		<div>
			<button type="submit">Sign in</button>
		</div>
	</form:form>
</body>
</html>