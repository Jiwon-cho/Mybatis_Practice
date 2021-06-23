<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>셀렉트 결과 확인하기</title>
</head>
<body>
	<h2>학생정보 조회결과</h2>
	<h4>학생수: ${count }</h4>
	
	<h3>조회한 학생</h3>
	<ul>
		<li>학생번호: ${s.studentNo }</li>
		<li>학생이름: ${s.studentName }</li>
		<li>학생전화번호: ${s.studentTel }</li>
		<li>학생이메일: ${s.studentEmail }</li>
		<li>학생주소: ${s.studentAddr }</li>
		<li>학생등록일: ${s.reg_date }</li>
	</ul>
</body>
</html>