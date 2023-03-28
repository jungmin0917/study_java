package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
	
	// �̸�, ���� ����
	public boolean update(MemberVO member) {
		return sqlSession.update("Member.modify", member) == 1; // SqlSession.update() �޼ҵ�� ������� ���ڵ� ���� ��ȯ�Ѵ�
	}
	
	// ȸ��Ż��
	public boolean remove(String id) {
		return sqlSession.delete("Member.remove", id) == 1; // SqlSession.delete() �޼ҵ� ���� ������� ���ڵ� ���� ��ȯ�Ѵ�.
	}
	
	// ���̵� ��ȸ�ϱ� (�̸�, ��й�ȣ��)
	public String searchId(String name, String pw) {
		HashMap<String, String> searchMap = new HashMap<>();
		
		searchMap.put("name", name);
		searchMap.put("pw", pw);
		
		String result = sqlSession.selectOne("Member.searchId", searchMap); // ��ȯ�� ������ null�� ���´ٰ� ��
		
		return result;
	}
	
	// ���� ��ȸ�ϱ� (20���� ���)
	public List<MemberVO> searchMember() {
		List<MemberVO> memberList = new ArrayList<>();
		memberList = sqlSession.selectList("Member.searchMember"); // ��ȯ���� �������� �� �� �����Ƿ� selectList�� ����Ѵ�. selectList�� ��ȯ�� Ÿ���� List�̹Ƿ� �̸� �����ߴٰ� ��Ƴ���.
		// Member.searchMember �������� ��ȯŸ���� MemberVO ��ü�� �����ߴ�.
		// selectList �޼ҵ带 ����ϸ�, �ش� ��ȯŸ���� �ϳ��ϳ��� List�� �߰��ϸ鼭 ��´�.
		
		return memberList; // arraylist ��ȯ
	}
}
