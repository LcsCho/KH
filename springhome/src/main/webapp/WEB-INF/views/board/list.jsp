<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>게시판 목록</h1>
<h2>
	<a href="write">글쓰기</a>

</h2>
	<form action="/find" method="post" autocomplete="off">
		<select name="type">
			<option value="${boardDto.getBoardTitle}">제목</option>
			<option value="${boardDto.getBoardWriter}">작성자</option>
		</select>
		<input name="keyword">
		<button>검색</button>
	</form>
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
				<c:choose>
					<c:when test="${empty boardDto.boardWriter}">
						<th style="color:red">탈퇴한 회원</th>
					</c:when>
					<c:otherwise>
						<th>${boardDto.boardWriter}</th>
					</c:otherwise>
				</c:choose>
				<td>${boardDto.boardReadcount}</td>
				<td>${boardDto.boardLikecount}</td>
				<td>${boardDto.boardReplycount}</td>
				<td><fmt:formatDate value="${boardDto.boardCtime}" pattern="y년 M월 d일 E a h시 m분 s초"/></td>
				<td><fmt:formatDate value="${boardDto.boardUtime}" pattern="y년 M월 d일 E a h시 m분 s초"/></td>
				<td><a href="detail?boardNo=${boardDto.boardNo}"
					title="해당 게시판으로 이동">이동</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>