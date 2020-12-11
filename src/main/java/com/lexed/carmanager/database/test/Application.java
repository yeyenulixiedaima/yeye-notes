package com.lexed.carmanager.database.test;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Application {
	
	private static SqlSessionFactory sqlSessionFactory;
	
	static{
		InputStream is = Application.class.getClassLoader().getResourceAsStream("config.xml");
		
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
	}

	public static SqlSession openSession(){
		return sqlSessionFactory.openSession(true);
	}

}
