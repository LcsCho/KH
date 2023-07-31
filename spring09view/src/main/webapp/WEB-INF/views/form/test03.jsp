<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 등록</title>
</head>
<body>
	<h1>도서 등록</h1>
	<form action="http://localhost:8080/save">
		제목: <input type="text" name="bookTitle"> <br><br> 
		작가: <input type="text" name="bookAuthor"> <br><br> 
		출판일: <input type="date" name="bookPublicationDate"> <br><br>
		가격: <input type="number" name="bookPrice"> <br><br>
		출판사: <input type="text" name="bookPublisher"> <br><br>
		페이지 수: <input type="number" name="bookPageCount" min="1" max="1000" step="1" value="1"> <br><br>
		
		<!-- 
			select를 이용하여 선택 가능한 입력창을 만들 수 있다. 
			- option 태그를 안에 넣어서 그 중에 고를 수 있도록 만든다.
		-->
		장르<select name="bookGenre">
			<option>자기계발</option>
			<option>수험서</option>
			<option>무협지</option>
			<option>IT</option>
			<option>판타지</option>
			<option>공포</option>
			<option>추리</option>
		</select>
		<button>등록</button>
	</form>
</body>
</html>