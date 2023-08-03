<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 정보 수정</title>
</head>
<body>
	<h1>${dto.boardNo}번 게시글 수정</h1>
	
	<form action="edit" method="post">
		<input type="hidden" name="boardNo" value="${dto.boardNo}">
		제목 <input type="text" name="boardTitle" value="${dto.boardTitle}"><br><br>
		내용 <textarea name="boardContent">"${dto.boardContent}"</textarea><br><br>
		<button>수정하기</button>
	</form>
</body>
</html>