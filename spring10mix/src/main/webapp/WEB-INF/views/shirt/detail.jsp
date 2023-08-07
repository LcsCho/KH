<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${dto.shirtNo}번 티셔츠 정보</title>
</head>
<body>
	<c:choose>
		<c:when test="${dto != null}">
			<h1>${dto.shirtNo}번 티셔츠정보</h1>
			<img src="https://d1oro1067kxrgx.cloudfront.net/kirinco/images/2022/01/24/smfiojsdiofjiosdmoaf.png">
			<h2>상품제목: ${dto.shirtName}</h2>
			<h2>상품색상: ${dto.shirtColor}</h2>
			<h2>판매가: ${dto.shirtPrice}</h2>
			<h2>상품종류: ${dto.shirtKind}</h2>
			<h2>유형: ${dto.shirtType}</h2>
			<h2>재질: ${dto.shirtMaterial}</h2>
			<h2>판매수량: ${dto.shirtStock}</h2>
			<a href="list">목록으로</a><br><br>
			<a href="edit?shirtNo=${dto.shirtNo}">정보수정</a><br><br>
			<a href="delete?shirtNo=${dto.shirtNo}">삭제하기</a>
		</c:when>
		<c:otherwise>
			<h1>상품이 없어요!</h1>
		</c:otherwise>
	</c:choose>
</body>
</html>