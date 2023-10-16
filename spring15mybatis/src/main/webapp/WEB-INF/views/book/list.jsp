<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form>
	<div>
		도서번호: <input type="text" name="bookId" value="${vo.bookId}">
	</div>
	<div>
		도서명: <input type="text" name="bookTitle" value="${vo.bookTitle}">
	</div>
	<div>
		저자<input type="text" name="bookAuthor" value="${vo.bookAuthor}">
	</div>
	<div>
		출판사<input type="text" name="bookPublisher" value="${vo.bookPublisher}">
	</div>
	<div>
		출간일 <input type="date" name="bookPublicationBegin"
			value="${vo.bookPublicationBegin}"> ~ <input type="date"
			name="bookPublicationEnd" value="${vo.bookPublicationEnd}">
	</div>
	<div>
		판매가 <input type="number" name="bookPriceMin"
			value="${vo.bookPriceMin}">부터 <input type="number"
			name="bookPriceMax" value="${vo.bookPriceMax}">까지
	</div>
	<div>
		페이지 <input type="number" name="bookPageMin" value="${vo.bookPageMin}">이상
		<input type="number" name="bookPageMax" value="${vo.bookPageMax}">이하
	</div>
	<div>
		장르
		<c:choose>
			<c:when test="${vo.bookGenreList.contains('Fiction')}">
				<input type="checkbox" name="bookGenreList" value="Fiction"> 픽션
			</c:when>
			<c:otherwise>
				<input type="checkbox" name="bookGenreList" value="Fantasy"> 판타지
<!-- 			<input type="checkbox" name="bookGenreList" value="Classic"> 교양 -->
				<!-- 			<input type="checkbox" name="bookGenreList" value="Fiction"> 픽션 -->
			</c:otherwise>
		</c:choose>
	</div>
	
	<!-- 정렬 -->
	1차 정렬
	<div>
		<select name="orderList">
			<option value="">선택하세요</option>
			<option value="book_id asc">번호순</option>
			<option value="book_price desc">최고가순</option>
			<option value="book_price asc">최저가순</option>
			<option value="book_publication_date desc">최근 출간 순</option>
		</select>
	</div>
	2차 정렬
	<div>
		<select name="orderList">
			<option value="">선택하세요</option>
			<option value="book_id asc">번호순</option>
			<option value="book_price desc">최고가순</option>
			<option value="book_price asc">최저가순</option>
			<option value="book_publication_date desc">최근 출간 순</option>
		</select>
	</div>
	<button type="submit">검색</button>
</form>

<hr>

<table border="1">
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>저자</th>
			<th>출판사</th>
			<th>출간일</th>
			<th>가격</th>
			<th>페이지</th>
			<th>장르</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="bookDto" items="${list}">
			<tr>
				<td>${bookDto.bookId}</td>
				<td>${bookDto.bookTitle}</td>
				<td>${bookDto.bookAuthor}</td>
				<td>${bookDto.bookPublisher}</td>
				<td>${bookDto.bookPublicationDate}</td>
				<td>${bookDto.bookPrice}</td>
				<td>${bookDto.bookPageCount}</td>
				<td>${bookDto.bookGenre}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

