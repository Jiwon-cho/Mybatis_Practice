package com.emp.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.emp.model.vo.Employee;
import com.emp.model.vo.Employee2;

public class EmpDao {

	public List<Employee> selectEmpAll(SqlSession session,int cPage, int numPerpage){
		//RowBound 클래스는 생성할 때 매개변수 있는 생성자를 이용
		//매개변수는 데이터의 구역을 구분 할 수 있는 숫자로 대입
		//2개의 매개변수를 받음
		//1. offset -> 시작 -> (cPage-1)*numPerPage
		//2. limit -> 범위 -> numPerpage
		RowBounds row=new RowBounds((cPage-1)*numPerpage,numPerpage);
		return session.selectList("emp.selectEmpAll",null,row);
	}
	

	public int selectEmpCount(SqlSession session) {
		return session.selectOne("emp.selectEmpCount");
	}
	
	
	
	public List<Employee> searchEmp(SqlSession session, Map<String,Object> param){
		return session.selectList("emp.searchEmp",param);
	}
	
	
	public Employee2 selectEmpOne(SqlSession session, String no) {
		return session.selectOne("emp.selectEmpOne",no);
	}
}
