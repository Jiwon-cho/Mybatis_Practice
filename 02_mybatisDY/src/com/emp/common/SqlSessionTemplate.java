package com.emp.common;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionTemplate {

	
	public static SqlSession getSession() {
		SqlSession session=null;
		String resource="/mybatis-config.xml";
		
		try {
			InputStream is=Resources.getResourceAsStream(resource);
			session=new SqlSessionFactoryBuilder().build(is).openSession(false);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return session;
	}
	
}
