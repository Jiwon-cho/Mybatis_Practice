<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li>게시글번호 : ${board.boardNo }</li>
		<li>게시글제목 : ${board.boardTitle }</li>
		<li>게시글작성자 : ${board.boardWriter }</li>
		<li>게시글내용 : ${board.boardContent }</li>
		<li>게시글작성일 : ${board.boardDate }</li>
		<ul>
			<c:forEach var="c" items="${board.comments }">
				<li>대글내용 : ${c.commentContent }<sub>${c.commentWriter}</sub></li>
			</c:forEach>
		</ul>
	</ul>
<%-- <table>
<tr>
<th>게시판 번호</th>
<th>게시판 제목</th>
<th>게시판 작성자</th>
<th>게시판 내용</th>
<th>게시판 등록일</th>
<th>댓글</th>
</tr>
<tr>
<td>${board.boardNo }</td>
<td>${board.boardTitle}</td>
<td>${board.boardWriter }</td>
<td>${board.boardContent }</td>
<td>${board.boardDate }</td>
<td>${board.boardNo }</td>
<td>
<c:forEach var="c" items="${board.comments }">
<td>댓글내용: ${c.commentContent }<sub>${c.commentWriter }</sub></td>
</c:forEach></td>

</tr>
</table> --%>

</body>
</html>