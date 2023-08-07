<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h1>티셔츠 목록</h1>

<h2><a href="add">신규등록</a></h2>

<table border="1">
	<thead>
		<tr>
			<th>고유번호</th>
			<th>상품제목</th>
			<th>상품색상</th>
			<th>판매가</th>
			<th>상품종류</th>
			<th>상품유형</th>
			<th>재질</th>
			<th>판매수량</th>
			<th>상세 조회</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="dto" items="${list}">
			<tr>
				<td>${dto.shirtNo}</td>
				<td>${dto.shirtName}</td>
				<td>${dto.shirtColor}</td>
				<td>${dto.shirtPrice}원</td>
				<td>${dto.shirtKind}</td>
				<td>${dto.shirtType}</td>
				<td>${dto.shirtMaterial}</td>
				<td>${dto.shirtStock}개</td>
				<td><a href="detail2?shirtNo=${dto.shirtNo}" title="해당 상품으로 이동">Go</a></td>
		</c:forEach>
	</tbody>
</table>