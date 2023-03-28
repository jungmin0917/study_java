package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import config.MyBatisConfig;
import vo.MemberVO;

// ���⿡ ���� SQL ����� �ϴ� �޼ҵ���� ���������� ���´� (CRUD)
// ���⼭ MyBatisConfig���� ���� SqlSessionFactory�� ���� SqlSession�� ����� ����� ���̴�

public class MemberDAO {
	SqlSessionFactory sqlSession_f = MyBatisConfig.getSqlsession_f(); // SqlSessionFactory ��ü ����
	// ������ �� ���ø����̼� ��� �� �ڵ����� ù 1ȸ SqlSessionFactory ��ü�� ������ ���̴�
	SqlSession sqlSession; // SqlSession ��ü ����
	
	// �⺻ ������
	public MemberDAO() {
		sqlSession = sqlSession_f.openSession(true); // SqlSession ��ü�� ������ �� openSession(true)�� ���� ȣ���ϸ� INSERT, UPDATE, DELETE�� ���� �� auto commit�� �����ϴ� SqlSession ��ü�� ���� �� �ִ�. (�ʼ��� �ƴϴ�)
		// ���� openSession �޼ҵ�� ��� �Ǵ� �κ��� �� (�Ź� commit�� �Ÿ�)
	}
	
	// ȸ������, �α���, ���̵� ��ȸ, ���� ��ȸ ���� �غ� ���̴�.
	
	// ���� �ٸ� ���������� MemberDAO.join() �̷������� ������ �� ���̴�.
	// �׷��� �⺻ �������� MemberDAO() �����ڰ� sqlSession_f��� �̸��� SqlSessionFactory ��ü�� �����ؼ� MyBatis �ʱ� ������ �̿��� Factory ��ü�� ���� ���̴�.
	// �� ���� sqlSession ��ü�� �����Ͽ���, �� sqlSession Ŭ������ �޼ҵ�� member.xml�� ���� sql������ �̿��� MyBatis�� �̿��� DB �̿��� ������ ���̴�.
	
	// ���̵� �ߺ� �˻�
	public boolean checkId(String id) { // ���ϰ��� �־�� �ϴ� boolean (����, ����)
		// ����� �ϳ��� ������ selectOne() �޼ҵ�, ����� ���� ���� selectList() �޼ҵ带 ����Ѵ�.
		int result = Integer.parseInt(sqlSession.selectOne("Member.checkId", id));
		
		return result == 1 ? true : false;
	}
	
	// ȸ�����Ժ��� ���������� ������
	public void join(MemberVO member) { // �Ű������� MemberVO ��ü�� ���� ���̴�
		sqlSession.insert("Member.join", member); // insert(������ id, �Ķ���ͷ� ����� ��ü)
		// sqlSession.insert() �޼ҵ��� �⺻ ��ȯ���� [������� ���ڵ��� ����]�̴�
	}
}
