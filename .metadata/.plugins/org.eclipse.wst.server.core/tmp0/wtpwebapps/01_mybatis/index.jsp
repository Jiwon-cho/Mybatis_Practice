<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>    
<c:set var="path" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이바티스 사용하기</title>
</head>
<body>
	<h3>마이 바티스 체험하기</h3>
	<h4>학생정보 등록하기</h4>
	<a href="${path }/insertStudent">학생입력</a>
	<h4>학생이름을 변경해서 등록하기</h4>
	<form action="${path }/insertStudentName" method="post">
	<input type="text" name="name">
	<input type="submit" value="저장">
	</form>
	<h4>다중 값 입력</h4>
	<form action="${path }/insertStudentData" method="post">
	이름<input type="text" name="name"><br>
	전화번호<input type="text" name="phone"><br>
	주소<input type="text" name="addr"><br>
	<input type="submit" value="저장">
	</form>
	
	<h4>다중값 입력 받아 수정하기</h4>
	<form action="${path }/updateStudent" method="post">
	학생번호<input type="number" name="no"><br>
	이메일<input type="text" name="email"><br>
	전화번호<input type="text" name="phone"><br>
	주소<input type="text" name="addr"><br>
	<input type="submit" value="저장">
	</form>
	<h4>학생번호 입력받아 삭제하기</h4>
	<form action="${path }/deleteStudent" method="post">
		삭제할 학생번호 <input type="number" name="no"><br>
		<input type="submit" value="삭제">
	</form>
	
	<h2>DB저장된 데이터 조회하기</h2>
	<P>Select문 활용하기</P>
	<ul>
		<li>한개의 row만 가져오는 select문</li>
		<li>여러개의 row들을 가져오는 select문</li>
		<li>여러개의 row들을 부분별로 가져오는 select 문 -> paging처리</li>
		
	
	</ul>
	
		<h2>한개의row를 가져오는 select문 실행하기</h2>
	<h4>student테이블의 학생 수 조회하기</h4>
	<a href="${path }/selectCount">학생수 조회하기</a>
	<h4>학생1명에 대한 정보가져오기</h4>
	<form action="${path }/selectStudentOne">
	<input type="number" name="no">
	<input type="submit" value="검색">
	</form>
	
</body>
</html>