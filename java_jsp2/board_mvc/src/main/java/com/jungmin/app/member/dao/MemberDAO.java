package com.jungmin.app.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.jungmin.app.mybatis.config.MyBatisConfig;

public class MemberDAO {
	// SqlSessionFactory를 초기화하여 factory를 생성
	SqlSessionFactory sqlSessionFactory = MyBatisConfig.getSqlSessionFactory();
	SqlSession sqlSession; // SqlSession 객체 선언
	
	// 기본 생성자
	public MemberDAO() {
		// sqlSessionFactory 객체의 openSession 메소드를 실행하여 해당 설정을 sqlSession 객체에 대입해줌
		sqlSession = sqlSessionFactory.openSession(true);
	}
	
	// 아이디 중복 검사
	public boolean checkId(String id) {
		// 이 상황에서는 어차피 1개만 나오니까 selectOne으로 해도 된다
		int result = sqlSession.selectOne("Member.checkId", id);
		
		return result > 0 ? true : false;
	}
}
