package com.app.mybatis.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//MyBatis의 핵심 객체 SqlSessionFactory를 만들어서 공유
public class MyBatisConfig {
	private static SqlSessionFactory sqlSessionFactory;
//	SqlSession을 만들어주는 공장 역할
	
	static {
		String resource = "com/app/mybatis/config/config.xml";
		
		try {
			Reader reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
//	설정 파일(config.xml)을 Resources.getResourceAsReader로 읽고
//	SqlSessionFactoryBuilder로 SqlSessionFactory 생성
	
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}
