<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book List</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">
		<h2 class="text-center">도서 목록</h2>
		<table class="table table-bordered table table-hover">
			<thead>
				<tr>
					<th>제목</th>
					<th>작가</th>
					<th>도서번호</th>
					<th>장르</th>
					<th>등록일</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="book" items="${bookList}">
					<tr>
						<td>${book.title}</td>
						<td>${book.author}</td>
						<td><a href="getBookIsbn.do?isbn=${book.isbn}">${book.isbn}</a>
						</td>
						<td>${book.genre}</td>
						<td>${book.created_at}</td>
					</tr>
				</c:forEach>

			</tbody>

		</table>
	</div>
</body>
</html>