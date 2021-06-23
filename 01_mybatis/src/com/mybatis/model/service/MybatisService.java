package com.mybatis.model.service;

import static com.mybatis.common.SqlSessionTemplate.getSession;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.dao.MybatisDao;
import com.mybatis.model.vo.Student;

public class MybatisService {
	private  MybatisDao dao=new MybatisDao();
	
	public int insertStudent() {
		//Connection을 가져와 전달, 관리
		SqlSession session=getSession();
		int result=dao.insertStudent(session);
		
		if(result>0) session.commit();
		else session.rollback();
		session.close();
		
		return result;
	}
	
	
	public int insertStudentName(String name) {
		SqlSession session=getSession();
		int result=dao.insertStudentName(session,name);
		if(result>0) session.commit();
		else session.rollback();
		session.close();
		
		return result;
	}
	
	public int insertStudentData(Student s) {
		SqlSession session=getSession();
		int result=dao.insertStudentData(session,s);
		if(result>0) session.commit();
		else session.rollback();
		session.close();
		
		return result;
	}
	
	public int updateStudent(Student s) {
		SqlSession session=getSession();
		int result=dao.updateStudent(session,s);
		if(result>0) session.commit();
		else session.rollback();
		session.close();
		
		return result;
	}
	
	public int deleteStudent(int no) {
		SqlSession session=getSession();
		int result=dao.deleteStudent(session,no);
		if(result>0) session.commit();
		else session.rollback();
		session.close();
		return result;
	}
	
	public int selectCount() {
		SqlSession session=getSession();
		int result=dao.selectCount(session);
		if(result>0) session.commit();
		else session.rollback();
		session.close();
		return result;
		
	}
	
	
	public Student selectStudentOne(int no) {
		SqlSession session=getSession();
		Student s=dao.selectStudentOne(session,no);
		session.close();
		return s;
	
	}

}
