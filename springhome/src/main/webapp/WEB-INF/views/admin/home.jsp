<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<div class="container w-500">
	<div class="row">
		<h1>관리자 페이지</h1>
	</div>
	<div class="row">
		<h3><a href="/admin/member/list?size=20">회원 관리</a></h3>
<!-- <h3><a href="member/list">회원 관리</a></h3> -->
	</div>
	<div class="row">
		<h3><a href="#">회원 통계</a></h3>
	</div>
	<div class="row">
		<h3><a href="#">게시글 통계</a></h3>
	</div>
</div>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>