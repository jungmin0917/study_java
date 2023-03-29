package com.jungmin.app.mybatis.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConfig {
	private static SqlSessionFactory sqlSession_f;
	
	// 맨 처음 SqlSessionFactory 객체가 생성될 때 실행할 것들
	static {
		try {
			// config.xml을 불러와서 빌드하기 때문에 그 경로를 적어줘야 함
			String resource = "./com/jungmin/app/mybatis/config/config.xml";
			// Reader 객체에 ibatos.io.Resources 객체의 getResourceAsReader 메소드를 이용해 설정 파일의 내용을 담는다
			Reader reader = Resources.getResourceAsReader(resource);
			// 선언해놓았던 SqlSessionFactory 객체에 SqlSessionFactoryBuilder 객체의 build 메소드와 설정 파일을 이용해 새 SqlSessionFactory 객체를 생성해서 이를 담는다.
			sqlSession_f = new SqlSessionFactoryBuilder().build(reader);
			reader.close(); // reader를 열었으면 닫아야 함
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("초기화 문제 발생, MyBatisConfig.java에서 발생함");
		}
	}

	// SqlSessionFactory 객체가 private이기 때문에 getter를 설정해준다.
	public static SqlSessionFactory getSqlSession_f() {
		return sqlSession_f;
	}
	
}
