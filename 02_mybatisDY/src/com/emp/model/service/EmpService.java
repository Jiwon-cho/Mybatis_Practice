package com.emp.model.service;

import static com.emp.common.SqlSessionTemplate.getSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.emp.model.dao.EmpDao;
import com.emp.model.vo.Employee;
public class EmpService {
	private EmpDao dao=new EmpDao();
	
	public List<Employee> selectEmpAll(){
		SqlSession session=getSession();
		List<Employee> list=dao.selectEmpAll(session);
		session.close();
		return list;
	}
	
}
