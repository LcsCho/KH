<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h1>게시판 목록</h1>

<table border="1">
	<thead>
		<tr>
			<th>책 번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>출판일</th>
			<th>가격</th>
			<th>출판사</th>
			<th>페이지 수</th>
			<th>장르</th>
			<th>상세정보</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="dto" items="${list}">
			<tr>
				<td>${dto.bookId}</td>
				<td>${dto.bookTitle}</td>
				<td>${dto.bookAuthor}</td>
				<td>${dto.bookPublicationDate}</td>
				<td>${dto.bookPrice}</td>
				<td>${dto.bookPublisher}</td>
				<td>${dto.bookPageCount}</td>
				<td>${dto.bookGenre}</td>
				<td><a href="detail?bookId=${dto.bookId}" title="해당 책 상세정보로 이동">이동</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>