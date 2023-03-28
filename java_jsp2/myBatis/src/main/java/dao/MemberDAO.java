package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
	// join에서 분리한 이유는 ajax 등을 이용해서 따로 사용하기 위함임
	public boolean checkId(String id) { // 리턴값이 있어야 하니 boolean (성공, 실패)
		// 결과가 하나만 있으면 selectOne() 메소드, 결과가 여러 개면 selectList() 메소드를 사용한다.
		int result = sqlSession.selectOne("Member.checkId", id); // resultType을 _int로 적으면, MyBatis는 이것을 기본형 int가 아닌 참조 데이터타입 Integer로 매핑한다. 이것은 다시 int로 선언해줘서 쓸 필요가 있다.
		
		return result > 0 ? true : false;
		// returnType 속성을 통해 쿼리 결과를 매핑했기 때문에 해당 속성에 지정된 데이터 타입으로 결과가 반환된다
	}
	
	// 회원가입부터 순차적으로 만들어보자
	public void join(MemberVO member) { // 매개변수로 MemberVO 객체를 받을 것이다
		sqlSession.insert("Member.join", member); // insert(쿼리문 id, 파라미터로 사용할 객체)
		// sqlSession.insert() 메소드의 기본 반환값은 [영향받은 레코드의 개수]이다
	}
	
	// 로그인
	public boolean login(String id, String pw) {
		HashMap<String, String> loginMap = new HashMap<>(); // 해시맵 객체 생성
		// 해시맵의 key값을 파라미터에 설정한 변수명으로 그대로 매핑하기 때문에 반드시 SQL문에 적었던 변수명과 같게 해 준다.
		loginMap.put("id", id);
		loginMap.put("pw", pw);
		
		int result = sqlSession.selectOne("Member.login", loginMap);
		
		return result > 0 ? true : false;
	}
	
	// 이름, 나이 수정
	public boolean update(MemberVO member) {
		return sqlSession.update("Member.modify", member) == 1; // SqlSession.update() 메소드는 영향받은 레코드 수를 반환한다
	}
	
	// 회원탈퇴
	public boolean remove(String id) {
		return sqlSession.delete("Member.remove", id) == 1; // SqlSession.delete() 메소드 역시 영향받은 레코드 수를 반환한다.
	}
	
	// 아이디 조회하기 (이름, 비밀번호로)
	public String searchId(String name, String pw) {
		HashMap<String, String> searchMap = new HashMap<>();
		
		searchMap.put("name", name);
		searchMap.put("pw", pw);
		
		String result = sqlSession.selectOne("Member.searchId", searchMap); // 반환값 없으면 null이 나온다고 함
		
		return result;
	}
	
	// 나이 조회하기 (20대인 사람)
	public List<MemberVO> searchMember() {
		List<MemberVO> memberList = new ArrayList<>();
		memberList = sqlSession.selectList("Member.searchMember"); // 반환값이 여러개가 될 수 있으므로 selectList를 사용한다. selectList의 반환값 타입은 List이므로 미리 선언했다가 담아놓자.
		// Member.searchMember 쿼리문의 반환타입을 MemberVO 객체로 설정했다.
		// selectList 메소드를 사용하면, 해당 반환타입을 하나하나씩 List에 추가하면서 담는다.
		
		return memberList; // arraylist 반환
	}
}
