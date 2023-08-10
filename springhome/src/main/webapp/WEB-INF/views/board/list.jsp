<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>게시판 목록</h1>
<h2><a href="write">글쓰기</a></h2>
<table border="1">
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>좋아요</th>
			<th>댓글수</th>
			<th>작성일</th>
			<th>수정일</th>
			<th>상세보기</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="boardDto" items="${list}">
			<tr>
				<td>${boardDto.boardNo}</td>
				<td>${boardDto.boardTitle}</td>
				<td>${boardDto.boardWriter}</td>
				<td>${boardDto.boardReadcount}</td>
				<td>${boardDto.boardLikecount}</td>
				<td>${boardDto.boardReplycount}</td>
				<td>${boardDto.boardCtime}</td>
				<td>${boardDto.boardUtime}</td>
				<td><a href="detail?boardNo=${boardDto.boardNo}" title="해당 게시판으로 이동">이동</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>