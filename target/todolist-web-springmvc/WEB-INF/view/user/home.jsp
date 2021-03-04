<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<h1>My Todo list</h1>
	<a href="/todolist-web-springmvc/user/logout">Logout</a>
	<table border="1">
		<thead>
			<tr>
				<td>ID</td>
				<td>Title</td>
				<td>Status</td>
				<td>Due date</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todolist}" var="todo">
				<tr>
					<td>${todo.id}</td>
					<td>${todo.title}</td>
					<c:set var="done" value="todo.done"></c:set>
					<%if(pageContext.getAttribute("done").equals("true")){ %>
					<td>Done</td>
					<%}else{ %>
					<td>Todo</td>
					<%} %>
					<td>${todo.dueDate}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="/todolist-web-springmvc/user/todos/new">Create a todo</a>
</body>
</html>