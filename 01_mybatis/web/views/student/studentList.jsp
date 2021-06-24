<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원조회결과</title>
</head>
<body>
	<h4>전체학생조회</h4>
	<table>
		<tr>
			<th>학생번호</th>
			<th>학생이름</th>
			<th>학생전화번호</th>
			<th>학생이메일</th>
			<th>학생주소</th>
			<th>등록일</th>
		</tr>
		<c:forEach var="s" items="${list }">
			<tr>
				<td>${s.studentNo }</td>
				<td>${s.studentName }</td>
				<td>${s.studentTel }</td>
				<td>${s.studentEmail }</td>
				<td>${s.studentAddr }</td>
				<td><fmt:formatDate value="${s.reg_date }" pattern="yyyy년 MM월 dd일"/></td>
			</tr>
		</c:forEach>
	</table>
	<h4>Map으로 받아온 데이터 출력하기</h4>
	<table>
		<tr>
			<th>학생번호</th>
			<th>학생이름</th>
			<th>학생전화번호</th>
			<th>학생이메일</th>
			<th>학생주소</th>
			<th>등록일</th>
		</tr>
		<c:forEach var="s" items="${list }">
			<tr>
			<%-- 	<td>${s.STUDENT_NO }</td>
				<td>${s.STUDENT_NAME }</td>
				<td>${s.STUDENT_TEL }</td>
				<td>${s.STUDENT_EMAIL }</td>
				<td>${s.STUDENT_ADDR }</td>
				<td><fmt:formatDate value="${s.REG_DATE }" pattern="yyyy년 MM월 dd일"/></td> --%>
					<td>${s['STUDENT_NO'] }</td>
				<td>${s['STUDENT_NAME'] }</td>
				<td>${s['STUDENT_TEL'] }</td>
				<td>${s['STUDENT_EMAIL'] }</td>
				<td>${s['STUDENT_ADDR'] }</td>
				<td><fmt:formatDate value="${s['REG_DATE'] }" pattern="yyyy년 MM월 dd일"/></td>
			</tr>
		</c:forEach>
	</table>	
</body>
</html>