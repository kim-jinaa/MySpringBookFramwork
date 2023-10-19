<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Info</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">
		<h2 class="text-center">도서 상세정보</h2>
		<table class="table table-bordered table table-hover">
			<tr><td>제목 </td><td>${book.title}</td></tr>
			<tr><td>작가 </td><td>${book.author}</td></tr>
			<tr><td>도서번호 </td><td>${book.isbn}</td></tr>
			<tr><td>장르 </td><td>${book.genre}</td></tr>
			<tr><td>등록일 </td><td>${book.created_at}</td></tr>
		</table>
	</div>
</body>
</html>