package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import config.MyBatisConfig;

// 여기에 이제 SQL 기능을 하는 메소드들을 본격적으로 적는다 (CRUD)
// 여기서 MyBatisConfig에서 만든 SqlSessionFactory를 통해 SqlSession을 만들어 사용할 것이다

public class MemberDAO {
	SqlSessionFactory sqlSession_f = MyBatisConfig.getSqlsession_f(); // SqlSessionFactory 객체 생성
	// 생성할 때 애플리케이션 사용 시 자동으로 첫 1회 SqlSessionFactory 객체가 생성될 것이다
	SqlSession sqlSession; // SqlSession 객체 선언
	
	// 기본 생성자
	public MemberDAO() {
		sqlSession = sqlSession_f.openSession(true); // SqlSession 객체를 생성할 때 openSession(true)와 같이 호출하면 INSERT, UPDATE, DELETE문 실행 시 auto commit을 수행하는 SqlSession 객체를 얻을 수 있다. (필수는 아니다)
	}
	
	// 회원가입, 로그인, 아이디 조회, 나이 조회 등을 해볼 것이다.
	
}
