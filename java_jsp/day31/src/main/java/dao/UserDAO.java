package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import vo.UserVO;

//NUM NUMBER PRIMARY KEY,
//ID VARCHAR2(1000),
//NAME VARCHAR2(1000),
//PASSWORD VARCHAR2(1000),
//GENDER VARCHAR2(100),
//ZIPCODE VARCHAR2(100),
//ADDRESS VARCHAR2(1000),
//ADDRESS_DETAIL VARCHAR2(1000),
//ADDRESS_ETC VARCHAR2(1000)

public class UserDAO {
	
	Connection conn; // 외부 저장소인 DBMS를 드라이버를 통해 가져온 연결 객체
	PreparedStatement pstm; // 문자열 안에 있는 SQL문을 객체로 저장, 변수가 들어갈 자리에 알맞는 값을 넣어줌, SQL문 실행시킴
	ResultSet rs; // SELECT의 결과를 담는 객체 (INSERT, DELETE, UPDATE는 ResultSet이 없다 (적용된 행의 개수만 반환함)
	
	public void join(UserVO user) { // 회원가입 처리 (id, password 등 매개변수를 전부 받기에는 너무 많으니까 UserVO 객체 타입으로 받자)
		// 받은 객체 안의 값들이 사용자가 입력한 값이다
		// 이 값을 우리가 DB에 INSERT를 해주면 된다
		
		// DB에서 SEQUENCE를 하나 CREATE 해주면, 이제 해당 시퀀스명.NEXTVAL로, INSERT를 해나갈 수 있다)
		// 여기에서는 SEQ_USER.NEXTVAL을 NUM에다 넣겠다는 것이다.
		// SQL문 작성
		String query = "INSERT INTO TBL_USER VALUES(SEQ_USER.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			conn = DBConnector.getConnection(); // Connection 객체를 생성해 가져옴.
			pstm = conn.prepareStatement(query); // 위에서 작성한 쿼리로 prepareStatement 객체를 생성해 전달한다
			
			// 이제 pstm 객체를 생성했고, 그 물음표를 채워줘서 쿼리해야 한다.
			
			// 이제 그 물음표 개수만큼 set자료형(물음표위치, 넣을값) 메소드로 set을 전부 해준다. 
			// DB 연결부터 해서 이런 귀찮은 부분들도 Spring 프레임워크를 배우면 훨씬 편해질 것이다.
			pstm.setString(1, user.getId());
			pstm.setString(2, user.getName());
			pstm.setString(3, user.getPassword());
			pstm.setString(4, user.getGender());
			pstm.setString(5, user.getZipcode());
			pstm.setString(6, user.getAddress());
			pstm.setString(7, user.getAddress_detail());
			pstm.setString(8, user.getAddress_etc());
			
//			pstm.executeQuery(); // SELECT문을 사용했을 땐 executeQuery(). 이 메소드는 ResultSet 객체를 반환함.
			pstm.executeUpdate(); // 나머지 INSERT, UPDATE, DELETE 문을 썼을 땐 이 메소드를 쓴다. 영향받은 레코드 수를 반환함.
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 열고 닫는 순서도 잘 신경쓸 것
			try {
				if(pstm != null) { // pstm 객체가 잘 생성됐을 때만 닫기
					pstm.close();
				}
				if(conn != null) { // conn 객체가 잘 생성됐을 때만 닫기
					conn.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e); // 런타임 예외 던지기
			}
		}
	}
	
	// 아이디 중복 검사
	public boolean checkId(String id) {
		String query = "SELECT COUNT(*) FROM TBL_USER WHERE ID = ?"; // 웬만하면 왼쪽처럼 변수를 직접 쿼리문에 담지 말고, 물음표로 처리하여 prepareStatement 객체로 만들어서 execute를 하는 것이 좋다
		
		boolean check = false; // 아이디가 이미 있으면 true, 없으면 false
		
		try {
			// DBMS 연결 객체 생성해서 Connection 객체에 넣기
			conn = DBConnector.getConnection();
			
			// String으로 선언된 쿼리를 PreparedStatement 객체에 전달
			pstm = conn.prepareStatement(query);
			
			// SQL 쿼리에 ?가 있다면 알맞는 값으로 매핑하기
			pstm.setString(1, id);
			
			// 쿼리 실행 후 결과를 ResultSet 객체에 담기
			rs = pstm.executeQuery(); // ResultSet 객체 반환
			
			// 다음 레코드로 포인터 이동
			rs.next(); // 포인터 이동
			// 위에서 이동한 컬럼(열)을 타입에 맞춰서 가져오기
			int count = rs.getInt(1); // 해당 레코드의 첫번째 인덱스를 int형으로 가져오겠다 라는 뜻이다
			if(count > 0) {
				check = true;
			}else {
				check = false;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		
		return check;
	}
	
	public boolean login(String id, String pw) {
		// 우리가 자바 쪽에서 서블릿을 사용한다면 여기서 세션을 가져와서 처리를 해 줘야 함
		// 지금은 우리가 JSP에서 모델을 사용하는 모델1 패턴을 사용하고 있다.
		
		String query = "SELECT COUNT(*) FROM TBL_USER WHERE ID = ? AND PASSWORD = ?";
		
		boolean check = false; // 맞는 아이디가 있으면 true, 없으면 false
		
		try {
			conn = DBConnector.getConnection();
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, id);
			pstm.setString(2, pw);
			
			rs = pstm.executeQuery();
			
			rs.next();
			
			check = rs.getInt(1) > 0 ? true : false;

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	
		return check;
	}
}
