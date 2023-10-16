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
			<th>아이디</th>
			<th>닉네임</th>
			<th>이메일</th>
			<th>연락처</th>
			<th>생년월일</th>
			<th>우편번호</th>
			<th>도/시</th>
			<th>동/읍/면/리</th>
			<th>등급</th>
			<th>포인트</th>
			<th>가입일</th>
			<th>마지막 로그인</th>
			<th>마지막 정보수정</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="memberDto" items="${list}">
			<tr>
				<td>${memberDto.memberId}</td>
				<td>${memberDto.memberNickname}</td>
				<td>${memberDto.memberEmail}</td>
				<td>${memberDto.memberContact}</td>
				<td>${memberDto.memberBirth}</td>
				<td>${memberDto.memberPost}</td>
				<td>${memberDto.memberAddr1}</td>
				<td>${memberDto.memberAddr2}</td>
				<td>${memberDto.memberLevel}</td>
				<td>${memberDto.memberPoint}</td>
				<td>${memberDto.memberJoin}</td>
				<td>${memberDto.memberLogin}</td>
				<td>${memberDto.memberChange}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>