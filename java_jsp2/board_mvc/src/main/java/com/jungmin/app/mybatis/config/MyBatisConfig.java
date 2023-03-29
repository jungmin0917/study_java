package com.jungmin.app.mybatis.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConfig {
	private static SqlSessionFactory sqlSession_f;
	
	// �� ó�� SqlSessionFactory ��ü�� ������ �� ������ �͵�
	static {
		try {
			// config.xml�� �ҷ��ͼ� �����ϱ� ������ �� ��θ� ������� ��
			String resource = "./com/jungmin/app/mybatis/config/config.xml";
			// Reader ��ü�� ibatos.io.Resources ��ü�� getResourceAsReader �޼ҵ带 �̿��� ���� ������ ������ ��´�
			Reader reader = Resources.getResourceAsReader(resource);
			// �����س��Ҵ� SqlSessionFactory ��ü�� SqlSessionFactoryBuilder ��ü�� build �޼ҵ�� ���� ������ �̿��� �� SqlSessionFactory ��ü�� �����ؼ� �̸� ��´�.
			sqlSession_f = new SqlSessionFactoryBuilder().build(reader);
			reader.close(); // reader�� �������� �ݾƾ� ��
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("�ʱ�ȭ ���� �߻�, MyBatisConfig.java���� �߻���");
		}
	}

	// SqlSessionFactory ��ü�� private�̱� ������ getter�� �������ش�.
	public static SqlSessionFactory getSqlSession_f() {
		return sqlSession_f;
	}
	
}
