<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
 <title>${boardDto.boardNo}번 게시글정보</title>
</head>
<body>
	<c:choose>
		<c:when test="${boardDto != null}">
			<h1>${boardDto.boardNo}번게시글(조회수: ${boardDto.boardReadcount})</h1>

			<table border="1" width="400">
				<tr>
					<th>제목</th>
					<td>${boardDto.boardTitle}</td>
				</tr>
				<tr>
					<th>작성자</th>
					<td>${boardDto.boardWriter}</td>
				</tr>
				<tr>
					<th>내용</th>
					<td>${boardDto.boardContent}</td>
				</tr>
				<tr>
					<th>좋아요</th>
					<td>${boardDto.boardLikecount}</td>
				</tr>
				<tr>
					<th>댓글수</th>
					<td>${boardDto.boardReplycount}</td>
				</tr>
				<tr>
					<th>등록시간</th>
					<td>${boardDto.boardCtime}</td>
				</tr>
				<tr>
					<th>수정시간</th>
					<td>${boardDto.boardUtime}</td>
				</tr>
			</table>
			
			<>좋아요</a>
			<>싫어요</a><br>
			<a href="edit?boardNo=${boardDto.boardNo}">정보수정</a><br>
			<a href="delete?boardNo=${boardDto.boardNo}">삭제하기</a><br>
		</c:when>
		<c:otherwise>
			<h1>해당 번호의 게시글이 없어요~</h1>
		</c:otherwise>
	</c:choose>
	
	<a href="list">목록으로</a>
 
 
 
 
 
 
 
 
 
 
 
 
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>