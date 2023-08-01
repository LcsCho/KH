<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>시간표</title>
</head>
<body>
	<h1>KH대학 시간표</h1>

	<table border="1" width="700">
		<tr>
			<th width="15%"></th>
			<th width="17%" bgcolor="green">월</th>
			<th width="17%" bgcolor="green">화</th>
			<th width="17%" bgcolor="green">수</th>
			<th width="17%" bgcolor="green">목</th>
			<th width="17%" bgcolor="green">금</th>
		</tr>
		<tbody align="center">
			<tr>
				<th bgcolor="yellow">1교시</th>
				<td rowspan="3" bgcolor="red">자바기초</td>
				<td rowspan="6" bgcolor="skyblue">공강</td>
				<td colspan="2" bgcolor="orange">파이썬기초</td>
				<td rowspan="6" bgcolor="skyblue">공강</td>
			</tr>
			<tr>
				<th bgcolor="yellow">2교시</th>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<th bgcolor="yellow">3교시</th>
				<td rowspan="3" bgcolor="blue">웹 개발 기초</td>
				<td></td>
			</tr>
			<tr>
				<th bgcolor="yellow">4교시</th>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<th bgcolor="yellow">5교시</th>
				<td rowspan="2" bgcolor="gray">데이터베이스</td>
				<td></td>
			</tr>
			<tr>
				<th bgcolor="yellow">6교시</th>
				<td></td>
				<td bgcolor="purple" style=>인공지능 심화</td>
			</tr>
		</tbody>
	</table>

</body>
</html>