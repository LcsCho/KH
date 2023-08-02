<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${dto.boardNo}번 게시글정보</title>
</head>
<body>
	<c:choose>
		<c:when test="${dto != null}">
			<h1>${dto.boardNo}번게시글(조회수: ${dto.boardReadcount})</h1>

			<table border="1" width="400">
				<tr>
					<th width="25%">제목</th>
					<td>${dto.boardTitle}</td>
				</tr>
				<tr>
					<th width="75%">작성자</th>
					<td>${dto.boardWriter}</td>
				</tr>
				<tr height="300" width="500">
					<th>내용</th>
					<td>${dto.boardContent}</td>
				</tr>
			</table>
		</c:when>
		<c:otherwise>
			<h1>해당 번호의 게시글이 없어요~</h1>
		</c:otherwise>
	</c:choose>
	
	<a href="list">목록으로</a>
</body>
</html>