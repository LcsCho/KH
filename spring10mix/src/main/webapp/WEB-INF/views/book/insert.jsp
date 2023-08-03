<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 등록</title>
</head>
<body>
	<h1>책 등록</h1>
	
	<form action="insert" method="post">
		제목 <input type="text" name="bookTitle"><br><br>
		작성자 <input type="text" name="bookAuthor"><br><br>
		출판일 <input type="date" name="bookPublicationDate"><br><br>
		가격 <input type="number" step="0.01" name="bookPrice"><br><br>
		출판사 <input type="text" name="bookPublisher"><br><br>
		페이지 수 <input type="number" name="bookPageCount"><br><br>
		장르 <input type="text" name="bookGenre"><br><br>
		<button>등록</button>
	</form>
	
	<h2><a href="list">목록으로</a></h2>
</body>
</html>