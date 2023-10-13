<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form>
	<div>
		멤버
	</div>


</form>

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