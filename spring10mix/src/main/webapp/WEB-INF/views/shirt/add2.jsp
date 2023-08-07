<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>상품등록</h1>

<form action="add2" method="post">
상품명    <input type="text" name="shirtName" required> <br><br>
<!--  option에 value를 주면 표시되는 값과 다르게 전송을 한다 -->

색상       <select name="shirtColor" required>
         <option value="">=====선택=====</option>
         <option value="블랙">블랙</option>
         <option value="화이트">화이트</option>
         <option value="그레이">그레이</option>
         <option value="레드">레드</option>
         <option value="블루">블루</option>
         </select> <br><br>
         
판매가    <input type="number" name="shirtPrice"> <br><br>
종류       <select name="shirtKind"> 
   <option value="">=====선택=====</option>
         <option>라운드</option>
         <option>브이넥</option>
         <option>정장</option>
         </select><br><br>
         
유형       <select name="shirtType"> 
   <option value="">=====선택=====</option>
         <option>민소매</option>
         <option>반팔</option>
         <option>긴팔</option>
</select><br><br>
재질       <input type="text" name="shirtMaterial"> <br><br>
재고수량 <input type="number" name="shirtStock"> <br><br>

<hr>

<input type = "checkbox" name = "size" value ="S">
<input type = "checkbox" name = "size" value ="M">
<input type = "checkbox" name = "size" value ="L">
<input type = "checkbox" name = "size" value ="XL">
<input type = "checkbox" name = "size" value ="2XL">
<input type = "checkbox" name = "size" value ="3XL">
<button>등록</button>

</form>


   
</body>
</html>