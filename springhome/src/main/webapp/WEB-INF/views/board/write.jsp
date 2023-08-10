<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
 	<h1>게시글 작성</h1>
	
	<form action="write" method="post" autocomplete="off">
		<input type="hidden" name="boardWriter" value="${boardDto.boardWriter}">
		제목 <input name="boardTitle"><br><br>
		내용 <textarea name="boardContent"></textarea><br><br>
		<button>글쓰기</button>
	</form>
 
 
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>