<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이바티스 동적쿼리 이용하기</title>
</head>
<body>
	<h2>전체사원조회하기</h2>
	<a href="${pageContext.request.contextPath }/selectEmpAll">전체 사원 출력</a>
	<a href="${pageContext.request.contextPath }/selectOneEmp?no=200">사원조회</a>
	
</body>
</html>