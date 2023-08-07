<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>티셔츠 정보 수정</title>
</head>
<body>
	<h1>${shirtDto.shirtNo}번상품정보수정</h1>

	<form action="edit2" method="post">
		<input type="hidden" name="shirtNo" value="${shirtDto.shirtNo}">
		이름<input type="text" name="shirtName" value="${shirtDto.shirtName}"
			required><br>
		<br> 색상<select name="shirtColor">
			<option value="${shirtDto.shirtColor}" selected>현재 값:
				${shirtDto.shirtColor}</option>
			<option value="블랙">블랙</option>
			<option value="화이트">화이트</option>
			<option value="그레이">그레이</option>
			<option value="레드">레드</option>
			<option value="블루">블루</option>
		</select><br>
		<br> 가격<input type="text" name="shirtPrice"
			value="${shirtDto.shirtPrice}" required><br>
		<br> 종류<select name="shirtKind">
			<option value="${shirtDto.shirtKind}" selected>현재 값:
				${shirtDto.shirtKind}</option>
			<option value="라운드">라운드</option>
			<option value="브이넥">브이넥</option>
			<option value="정장">정장</option>
		</select><br>
		<br> 유형<select name="shirtType">
			<option value="${shirtDto.shirtType}" selected>현재 값:
				${shirtDto.shirtType}</option>
			<option value="민소매">민소매</option>
			<option value="반팔">반팔</option>
			<option value="긴팔">긴팔</option>
		</select><br>
		<br> 상품재질<input type="text" name="shirtMaterial"
			value="${shirtDto.shirtMaterial}"><br>
		<br> 판매가능 수량<input type="number" name="shirtStock"
			value="${shirtDto.shirtStock}" required><br>
		<br>
		<hr>

		<input type="checkbox" name="size" value="S"> S <input
			type="checkbox" name="size" value="M"> M <input
			type="checkbox" name="size" value="L"> L <input
			type="checkbox" name="size" value="XL"> XL <input
			type="checkbox" name="size" value="2XL"> 2XL <input
			type="checkbox" name="size" value="3XL"> 3XL

		<hr>
		<button>변경하기</button>
	</form>
	<h2>
		<a href="list">돌아가기</a>
	</h2>
</body>
</html>