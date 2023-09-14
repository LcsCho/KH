<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<c:forEach var="pokemonDto" items="${list}">
	<div>
		${pokemonDto.no} / ${pokemonDto.name} / ${pokemonDto.type}
		<hr>
		<c:choose>
			<c:when test="${pokemonDto.image}">
				<img src="image?no=${pokemonDto.no}" width="50" height="50">
			</c:when>
			<c:otherwise>
				<img src="https://dummyimage.com/200x200/000/fff" width="200"
					height="200">
			</c:otherwise>
		</c:choose>
		
		<a href="edit?no=${pokemonDto.no}">수정</a>
		<a href="delete?no=${pokemonDto.no}">삭제</a>
	</div>
</c:forEach>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>