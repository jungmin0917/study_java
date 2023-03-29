package com.jungmin.app.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.jungmin.app.mybatis.config.MyBatisConfig;

public class MemberDAO {
	// SqlSessionFactory�� �ʱ�ȭ�Ͽ� factory�� ����
	SqlSessionFactory sqlSessionFactory = MyBatisConfig.getSqlSessionFactory();
	SqlSession sqlSession; // SqlSession ��ü ����
	
	// �⺻ ������
	public MemberDAO() {
		// sqlSessionFactory ��ü�� openSession �޼ҵ带 �����Ͽ� �ش� ������ sqlSession ��ü�� ��������
		sqlSession = sqlSessionFactory.openSession(true);
	}
	
	// ���̵� �ߺ� �˻�
	public boolean checkId(String id) {
		// �� ��Ȳ������ ������ 1���� �����ϱ� selectOne���� �ص� �ȴ�
		int result = sqlSession.selectOne("Member.checkId", id);
		
		return result > 0 ? true : false;
	}
}
