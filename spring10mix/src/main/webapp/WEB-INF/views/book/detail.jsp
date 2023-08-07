<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${dto.bookId}번도서 정보</title>
</head>
<body>
	<h1>도서 상세정보</h1>
	<c:choose>
		<c:when test="${dto != null}">
			<!-- 
				리스트 태그
				- 외부에 <ul> 또는 <ol>을 사용
					- ul은 순서가 없는 리스트(unorder list)
					- ol은 순서가 있는 리스트(order list)
				- 내부 항목에 <li>를 사용(list item)
			 -->

<%-- 			<ul>
				<li>${dto.bookId}</li>
				<li>${dto.bookTitle}</li>
				<li>${dto.bookAuthor}</li>
				<li>${dto.bookPublicationDate}</li>
				<li>${dto.bookPrice}</li>
				<li>${dto.bookPublisher}</li>
				<li>${dto.bookPageCount}</li>
				<li>${dto.bookGenre}</li>
			</ul> --%>
			<ol>
				<li>${dto.bookId}</li>
				<li>${dto.bookTitle}</li>
				<li>${dto.bookAuthor}</li>
				<li>${dto.bookPublicationDate}</li>
				<li>${dto.bookPrice}</li>
				<li>${dto.bookPublisher}</li>
				<li>${dto.bookPageCount}</li>
				<li>${dto.bookGenre}</li>
			</ol>
			<a href="edit?bookId=${dto.bookId}">정보수정</a><br><br>
			<a href="delete/${dto.bookId}">삭제하기</a><br><br>
			<%-- 			<table border="1" width="400">
				<tbody align="center">
					<tr>
						<th width="25%">제목</th>
						<td>${dto.bookTitle}</td>
					</tr>
					<tr>
						<th>작성자</th>
						<td>${dto.bookAuthor}</td>
					</tr>
					<tr height="50">
						<th>출판일</th>
						<td>${dto.bookPublicationDate}</td>
					</tr>
					<tr height="50">
						<th>가격</th>
						<td>${dto.bookPrice}</td>
					</tr>
					<tr height="50">
						<th>출판사</th>
						<td>${dto.bookPublisher}</td>
					</tr>
					<tr height="50">
						<th>페이지</th>
						<td>${dto.bookPageCount}</td>
					</tr>
					<tr height="50">
						<th>장르</th>
						<td>${dto.bookGenre}</td>
					</tr>
				</tbody>
			</table> --%>
		</c:when>
		<c:otherwise>
			<h1>해당 번호의 책이 없어요~</h1>
		</c:otherwise>
	</c:choose>
	<a href="list">목록으로</a>
</body>
</html>