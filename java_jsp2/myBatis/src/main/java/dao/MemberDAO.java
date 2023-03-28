package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import config.MyBatisConfig;
import vo.MemberVO;

// 여기에 이제 SQL 기능을 하는 메소드들을 본격적으로 적는다 (CRUD)
// 여기서 MyBatisConfig에서 만든 SqlSessionFactory를 통해 SqlSession을 만들어 사용할 것이다

public class MemberDAO {
	SqlSessionFactory sqlSession_f = MyBatisConfig.getSqlsession_f(); // SqlSessionFactory 객체 생성
	// 생성할 때 애플리케이션 사용 시 자동으로 첫 1회 SqlSessionFactory 객체가 생성될 것이다
	SqlSession sqlSession; // SqlSession 객체 선언
	
	// 기본 생성자
	public MemberDAO() {
		sqlSession = sqlSession_f.openSession(true); // SqlSession 객체를 생성할 때 openSession(true)와 같이 호출하면 INSERT, UPDATE, DELETE문 실행 시 auto commit을 수행하는 SqlSession 객체를 얻을 수 있다. (필수는 아니다)
		// 위의 openSession 메소드는 없어도 되는 부분인 듯 (매번 commit할 거면)
	}
	
	// 회원가입, 로그인, 아이디 조회, 나이 조회 등을 해볼 것이다.
	
	// 이제 다른 페이지에서 MemberDAO.join() 이런식으로 접근을 할 것이다.
	// 그러면 기본 생성자인 MemberDAO() 생성자가 sqlSession_f라는 이름의 SqlSessionFactory 객체를 생성해서 MyBatis 초기 설정을 이용해 Factory 객체를 만들 것이다.
	// 그 이후 sqlSession 객체를 선언하였고, 이 sqlSession 클래스의 메소드와 member.xml에 적은 sql문들을 이용해 MyBatis를 이용한 DB 이용이 가능할 것이다.
	
	// 아이디 중복 검사
	public boolean checkId(String id) { // 리턴값이 있어야 하니 boolean (성공, 실패)
		// 결과가 하나만 있으면 selectOne() 메소드, 결과가 여러 개면 selectList() 메소드를 사용한다.
		int result = Integer.parseInt(sqlSession.selectOne("Member.checkId", id));
		
		return result == 1 ? true : false;
	}
	
	// 회원가입부터 순차적으로 만들어보자
	public void join(MemberVO member) { // 매개변수로 MemberVO 객체를 받을 것이다
		sqlSession.insert("Member.join", member); // insert(쿼리문 id, 파라미터로 사용할 객체)
		// sqlSession.insert() 메소드의 기본 반환값은 [영향받은 레코드의 개수]이다
	}
}
