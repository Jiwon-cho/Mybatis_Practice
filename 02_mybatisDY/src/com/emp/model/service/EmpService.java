package com.emp.model.service;

import static com.emp.common.SqlSessionTemplate.getSession;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.emp.model.dao.EmpDao;
import com.emp.model.vo.Board;
import com.emp.model.vo.Employee;
import com.emp.model.vo.Employee2;
public class EmpService {
	private EmpDao dao=new EmpDao();
	
	public List<Employee> selectEmpAll(int cPage,int numPerPage){
		SqlSession session=getSession();
		List<Employee> list=dao.selectEmpAll(session,cPage,numPerPage);
		session.close();
		return list;
	}
	
	public int selectEmpCount() {
		SqlSession session=getSession();
		int count=dao.selectEmpCount(session);
		session.close();
		return count;
		
	}
	
	
	public List<Employee> searchEmp(Map<String,Object> param){
		SqlSession session=getSession();
		List<Employee> list=dao.searchEmp(session,param);
		session.close();
		return list;
	}
	
	
	public Employee2 selectEmpOne(String no) {
		SqlSession session=getSession();
		Employee2 e=dao.selectEmpOne(session,no);
		session.close();
		return e;
	}
	
	public Board selectBoard(int no) {
		SqlSession session=getSession();
		Board b=dao.selectBoard(session,no);
		session.close();
		return b;
	}
	
}
