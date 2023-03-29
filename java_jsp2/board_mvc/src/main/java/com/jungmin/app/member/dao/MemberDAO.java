package com.jungmin.app.member.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.jungmin.app.member.vo.MemberVO;
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
	
	// ȸ������
	public boolean join(MemberVO member) {
		int result = sqlSession.insert("Member.join", member); // ������ ��ģ ���ڵ��� ���� ��ȯ��
		
		return result > 0 ? true : false;
	}
	
	// �α���
	public boolean login(String memberId, String memberPw) {
		HashMap<String, String> map = new HashMap<>();
		map.put("memberId", memberId); // Ű���� ���� ���̶� �Ȱ��� ���� ��
		map.put("memberPw", memberPw);
		
		int result = sqlSession.selectOne("Member.login", map);
		
		return result > 0 ? true : false;
	}
}
