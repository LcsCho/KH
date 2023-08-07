<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>티셔츠 등록</title>
</head>
<body>
	<h1>티셔츠 등록 </h1>

	<form action="add" method="post">
		셔츠 이름<input name="shirtName" required><br> <br> 셔츠
		색상<select name="shirtColor" required>
			<option value="">=====선택=====</option>
			<option value="블랙">블랙</option>
			<option value="화이트">화이트</option>
			<option value="그레이">그레이</option>
			<option value="레드">레드</option>
			<option value="블루">블루</option>
		</select><br> <br> 셔츠 가격<input name="shirtPrice" required><br>
		<br> 셔츠 종류<select name="shirtKind" required>
			<option value="">=====선택=====</option>
			<option value="라운드">라운드</option>
			<option value="브이넥">브이넥</option>
			<option value="정장">정장</option>
		</select><br> <br> 셔츠 유형<select name="shirtType" required>
			<option value="">=====선택=====</option>
			<option value="민소매">민소매</option>
			<option value="반팔">반팔</option>
			<option value="긴팔">긴팔</option>
		</select><br> <br> 셔츠 재질<input name="shirtMaterial"><br>
		<br> 판매가능 수량<input name="shirtStock" required><br> <br>
		<button>셔츠 등록</button>
	</form>
	<h2>
		<a href="list">목록으로</a>
	</h2>
</body>
</html>