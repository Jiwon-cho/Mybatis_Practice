package com.mybatis.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionTemplate {
	
	//마이바티스가 제공하는 SqlSession 객체를 생성하자
	//SqlSession을 생성하는 방법
	//1. SqlSessionFactoryBuiler 클래스를 생성하자.
	//2. 생성된 SqlSessionFactoryBuiler 객체의 build(mybatis-config.xml내용)이용
	//3. SqlSessionFactory클래스를 생성
	//4. 생성된 SqlSessionFactory 객체의 openSession()매소드 이용
	//5. SqlSession 객체를 생성함
	
	public static SqlSession getSession() {
		SqlSession session=null;
		String resource="/mybatis-config.xml";
		try {
			//1.환경 설정 파일을 스트림으로 가져옴
			InputStream is=Resources.getResourceAsStream(resource);
			SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
			SqlSessionFactory factory=builder.build(is);
			session=factory.openSession(false);//true: 자동 커밋/ false: 직접사용
			
		}catch(IOException e){
			e.printStackTrace();
		}
		return session;
	}
}
