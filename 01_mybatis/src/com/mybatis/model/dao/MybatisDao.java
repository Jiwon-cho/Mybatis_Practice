package com.mybatis.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.vo.Student;

public class MybatisDao {
	
	public int insertStudent(SqlSession session) {
		//쿼리문을 실행하기 위한 구문만 작성함.
		//SqlSession객체가 제공하는 메소드 호출
		//selectOne, selectList,insert,updqate,delete
		int result=session.insert("student.insertStudent");//->namespace명.쿼리태그id값
		return result;
	}

	
	public int insertStudentName(SqlSession session,String name) {
		
		
	return	session.insert("student.insertStudentName",name);
	}
	
	
	public int insertStudentData(SqlSession session, Student s) {
		return session.insert("student.insertStudentData",s);
	}
	
	public int updateStudent(SqlSession session, Student s) {
		return session.update("student.updateStudent",s);
	}
	
	public int deleteStudent(SqlSession session, int no) {
		return session.delete("student.deleteStudent",no);
	}
	
	public int selectCount(SqlSession session) {
		return session.selectOne("student.selectCount");
	}
	
	public Student selectStudentOne(SqlSession session,int no) {
		return session.selectOne("student.selectStudentOne",no);
	}
	
	public List<Student> selectStudentAll(SqlSession session){
		return session.selectList("student.selectAll");
	}
	
	public List<Map> selectStudentMap(SqlSession session){
		return session.selectList("student.selectStudentMap");
	}
	
}
