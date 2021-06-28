<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<c:set var="path" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<div id="search-container">
		<form action="${path }/searchEmp" method="post">
			<table>
				<tr>
					<td>
						<select name="searchType">
							<option value="검색타입" disabled selected>검색타입</option>
							<option value="emp_id">사번</option>
							<option value="emp_name">사원명</option>
							<option value="phone">전화번호</option>
							<option value="email">이메일</option>	
						</select>
					</td>
					<td>
						<input type="search" name="searchKeyword"/>
					</td>
				</tr>
				<tr>
					<td>성별</td>
					<td>
						<label><input type="radio" value="M" name="gender">남</label>
						<label><input type="radio" value="F" name="gender">여</label>
					</td>
				</tr>
				<tr>
					<td>급여</td>
					<td>
						<input type="number" name="salary" step="100000" min="1000000">
						<label><input type="radio" name="le_ge" value="le">이하</label>
						<label><input type="radio" name="le_ge" value="ge">이상</label>
					</td>
				</tr>
				<tr>
					<td>입사일</td>
					<td>
						<input type="date" name="hiredate">
						<label><input type="radio" name="h_le_ge" value="le">이하</label>
						<label><input type="radio" name="h_le_ge" value="ge">이상</label>
					</td>
				</tr>
				<tr>
				<td>직책별 조회</td>
				<td>
				<label><input type="checkbox" name="jobcode" value="J1">대표이사</label>
				<label><input type="checkbox" name="jobcode" value="J2">부사장</label>
				<label><input type="checkbox" name="jobcode" value="J3">부장</label>
				<label><input type="checkbox" name="jobcode" value="J4">차장</label>
				<label><input type="checkbox" name="jobcode" value="J5">과장</label>
				<label><input type="checkbox" name="jobcode" value="J6">대리</label>
				<label><input type="checkbox" name="jobcode" value="J7">사원</label>
				
				</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="조회"/>
					</td>
				</tr>
			</table>
		</form>
	</div>
	<h3>사원정보조회결과</h3>
	<div id="emp-container">
		<table class="tbl-emp">
			<tr>
				<th>사번</th>
				<th>사원명</th>
				<th>주민번호</th>
				<th>이메일</th>
				<th>전화번호</th>
				<th>부서코드</th>
				<th>직급코드</th>
				<th>급여레벨</th>
				<th>급여</th>
				<th>보너스</th>
				<th>관리자아이디</th>
				<th>입사일</th>
				<th>성별</th>
			</tr>
			<c:forEach var="emp" items='${list }'>
				<tr>
					<td>${emp.emp_Id }</td>
					<td>${emp.emp_Name }</td>
					<td>${emp.emp_No }</td>
					<td>${emp.email }</td>
					<td>${emp.phone }</td>
					<td>${emp.dept_Code }</td>
					<td>${emp.job_Code }</td>
					<td>${emp.sal_Level }</td>
					<td><fmt:formatNumber value="${emp.salary }" type="currency"/></td>
					<td><fmt:formatNumber value="${emp.bonus }" type="percent"/></td>
					<td>${emp.manager_Id }</td>
					<td><fmt:formatDate value="${emp.hire_date }" pattern="yyyy월 MM월 dd일"/></td>
					<td>${emp.gender eq 'M'?"남":"여" }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
		<div id="pagebar-container">
		${pageBar }
	</div>
</body>
</html>





