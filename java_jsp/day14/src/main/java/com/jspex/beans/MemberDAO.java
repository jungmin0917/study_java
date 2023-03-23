package com.jspex.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

// DAO는 Data Access Object로서, 데이터베이스와 관련된 작업을 수행하는 객체이다
public class MemberDAO {
	Connection conn; // connection 객체
	PreparedStatement pstm; // prepare문 (SQL Injection 방지용)
	ResultSet rs; // 쿼리문에 대한 결과를 담을 객체 (ResultSet이라는 객체가 내장되어 있음)
	
	// 외부에서 이름을 받아와서 해당 이름을 가진 데이터의 전체 데이터를 가져오기
	// MemberVO 객체를 저장할 건데, 동명이인이 있을 수 있고 몇 개가 될지 모르니까 ArrayList 자료구조에 담자
	public ArrayList<MemberVO> select(String name) {
		// SELECT문인데 name은 매개변수로 받아와서 조회하겠다
		String query = "SELECT * FROM TBL_MEMBER WHERE NAME = ?";
		ArrayList<MemberVO> members = new ArrayList<>();
		// 검색한 결과를 MemberVO 객체에 담고, 그걸 ArrayList에 담아야 한다
		MemberVO member = null; // MemberVO 객체 member 초기화
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		
		try {
			conn = DBConnector.getConnection(); // Connection 객체가 담김
			pstm = conn.prepareStatement(query); // 문자열로 쿼리를 작성하여 preparedStatement 객체로 저장한다
			pstm.setString(1, name); // 이게 바로 sql 인젝션 방지!!!
			// 문법은 pstm.setString(몇번째 물음표, 그 물음표 부분을 채울 값)
			
			rs = pstm.executeQuery(); // executeQuery() 메소드를 사용하면 해당 쿼리문에 대한 결과값이 반환된다. 그걸 미리 만들어놨던 ResultSet 객체인 rs에 저장한다.
			
			// 이제 ResultSet.next() 메소드로 값을 하나하나 가져올 건데, next() 메소드의 반환값은 boolean 형이다.
			// rs.next()가 true일 동안 반복하면서 값을 가져온다
			while(rs.next()) {
				member = new MemberVO();
				// rs.next() 메소드로 행을 옮긴다고 생각하면 된다.
				// 현재 행의 어떤 걸 가져올지 정한다.
				member.setNum(rs.getInt(1)); // 우리의 테이블은 첫번째 컬럼이 NUMBER 형이기 때문에 int로 가져온다
//				rs.getInt("NUM"); // 이렇게 컬럼명으로도 가져올 수 있다
				member.setName(rs.getString(2));
				member.setBirthday(sdf.format(rs.getDate(3))); // getDate로 가져와야 한다 (DB에서 DATE 자료형으로 저장되어 있기 때문)
				members.add(member);
			}
			
		} catch (SQLException e) {
			// 잘못된 쿼리문이거나 쿼리할 때 뭔가가 잘못됐을 때
			System.out.println("select(String) 쿼리 오류 " + e);
		} catch (Exception e) {
			System.out.println("select(String) 알 수 없는 오류 + " + e);
		} finally { // 예외 발생 여부와 관계 없이 실행하는 부분
			try {
				// 연결을 하고 나서 안 끊어주면 메모리에 남아있기 때문에 메모리 누수가 되거나 서버 성능이 떨어질 수 있다.
				// 한 마디로 메모리 자원을 쓸데없이 차지하고 있기 때문
				if(rs != null) { // 반환값이 있었으면
					rs.close();
				}
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
		
		return members;
	}
	
}
