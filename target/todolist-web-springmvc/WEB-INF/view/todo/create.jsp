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
	<h1>Create a new todo</h1>
	<form:form action="/todolist-web-springmvc/user/todos/new.do" method="post" modelAttribute="todo">
		<div>
			<label for="title">Title:</label>
			<form:input path="title" id="title" placeholder="todo" required="required"/>
			<form:errors path="title"/>
		</div>
		<div>
			<label for="dueDate">Due date:</label>
			<form:input type="date" path="dueDate" id="dueDat" required="required" />
			<form:errors path="dueDate"/>
		</div>
		<div>
			<button type="submit">Create</button>
		</div>
	</form:form>
</body>
</html>