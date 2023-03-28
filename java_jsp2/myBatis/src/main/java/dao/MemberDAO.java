package dao;

import java.util.HashMap;

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
	// join���� �и��� ������ ajax ���� �̿��ؼ� ���� ����ϱ� ������
	public boolean checkId(String id) { // ���ϰ��� �־�� �ϴ� boolean (����, ����)
		// ����� �ϳ��� ������ selectOne() �޼ҵ�, ����� ���� ���� selectList() �޼ҵ带 ����Ѵ�.
		int result = sqlSession.selectOne("Member.checkId", id); // resultType�� _int�� ������, MyBatis�� �̰��� �⺻�� int�� �ƴ� ���� ������Ÿ�� Integer�� �����Ѵ�. �̰��� �ٽ� int�� �������༭ �� �ʿ䰡 �ִ�.
		
		return result > 0 ? true : false;
		// returnType �Ӽ��� ���� ���� ����� �����߱� ������ �ش� �Ӽ��� ������ ������ Ÿ������ ����� ��ȯ�ȴ�
	}
	
	// ȸ�����Ժ��� ���������� ������
	public void join(MemberVO member) { // �Ű������� MemberVO ��ü�� ���� ���̴�
		sqlSession.insert("Member.join", member); // insert(������ id, �Ķ���ͷ� ����� ��ü)
		// sqlSession.insert() �޼ҵ��� �⺻ ��ȯ���� [������� ���ڵ��� ����]�̴�
	}
	
	// �α���
	public boolean login(String id, String pw) {
		HashMap<String, String> loginMap = new HashMap<>(); // �ؽø� ��ü ����
		// �ؽø��� key���� �Ķ���Ϳ� ������ ���������� �״�� �����ϱ� ������ �ݵ�� SQL���� ������ ������� ���� �� �ش�.
		loginMap.put("id", id);
		loginMap.put("pw", pw);
		
		int result = sqlSession.selectOne("Member.login", loginMap);
		
		return result > 0 ? true : false;
	}
	
}
