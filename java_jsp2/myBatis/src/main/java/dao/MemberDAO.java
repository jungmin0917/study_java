package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import config.MyBatisConfig;

// ���⿡ ���� SQL ����� �ϴ� �޼ҵ���� ���������� ���´� (CRUD)
// ���⼭ MyBatisConfig���� ���� SqlSessionFactory�� ���� SqlSession�� ����� ����� ���̴�

public class MemberDAO {
	SqlSessionFactory sqlSession_f = MyBatisConfig.getSqlsession_f(); // SqlSessionFactory ��ü ����
	// ������ �� ���ø����̼� ��� �� �ڵ����� ù 1ȸ SqlSessionFactory ��ü�� ������ ���̴�
	SqlSession sqlSession; // SqlSession ��ü ����
	
	// �⺻ ������
	public MemberDAO() {
		sqlSession = sqlSession_f.openSession(true); // SqlSession ��ü�� ������ �� openSession(true)�� ���� ȣ���ϸ� INSERT, UPDATE, DELETE�� ���� �� auto commit�� �����ϴ� SqlSession ��ü�� ���� �� �ִ�. (�ʼ��� �ƴϴ�)
	}
	
	// ȸ������, �α���, ���̵� ��ȸ, ���� ��ȸ ���� �غ� ���̴�.
	
}
