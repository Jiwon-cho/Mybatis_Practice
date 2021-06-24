package com.emp.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.emp.model.vo.Employee;

public class EmpDao {

	public List<Employee> selectEmpAll(SqlSession session){
		return session.selectList("emp.selectEmpAll");
	}
	
}
