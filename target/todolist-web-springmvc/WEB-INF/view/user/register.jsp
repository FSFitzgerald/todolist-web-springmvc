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
	<h1>Register for Todolist</h1>
	<form:form action="register.do" method="post" modelAttribute="registrationForm">
		<div>
			<label for="email">Email: </label>
			<form:input path="email" id="email" placeholder="your@mail.com" required="required"/>
			<form:errors path="email" />
		</div>
		<div>
			<label for="password">Password: </label>
			<form:password path="password" id="password" placeholder="at least 6 character" required="required"/>
			<form:errors path="password" />
		</div>
		<div>
			<label for="confirmationPassword">Confirm password: </label>
			<form:password path="confirmationPassword" id="confirmationPassword" placeholder="exactly your password" required="required"/>
			<form:errors path="confirmationPassword" />
		</div>
		<div>
			<button type="submit">Sign up</button>
		</div>
	</form:form>
</body>
</html>