<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 정보 수정</title>
</head>
<body>
	<h1>${dto.bookId}번 책 정보 수정</h1>
	
	<form action="edit" method="post">
		제목 <input type="text" name="bookTitle" value="${dto.bookTitle}" required><br><br>
		저자 <input type="text" name="bookAuthor" value="${dto.bookAuthor}" required><br><br>
		출판일 <input type="date" name="bookPublicationDate" value="${dto.bookPublicationDate}" required><br><br>
		가격 <input type="number" step="0.01" name="bookPrice" value="${dto.bookPrice}" required><br><br>
		출판사 <input type="text" name="bookPublisher" value="${dto.bookPublisher}" required><br><br>
		페이지 수 <input type="number" name="bookPageCount" value="${dto.bookPageCount}" required><br><br>
		장르 <input type="text" name="bookGenre" value="${dto.bookGenre}"><br><br>
		<input type="hidden" name="bookId" value="${dto.bookId}" required>
		<button>수정하기</button>
	</form>

</body>
</html>