<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h2>회원 탈퇴를 위해 비밀번호를 입력하세요.</h2>
<form action="exit" method="post">
	비밀번호 입력 <input type="password" name="memberPw" required> <br><br>
	<button>탈퇴하기</button>
</form>

<c:if test="${param.error != null}">
	<h3 style="color:blue">비밀번호가 일치하지 않습니다.</h3>
</c:if>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>