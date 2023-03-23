package com.jspex.beans;

import java.sql.Connection; // sql 관련된 자바 내장 클래스
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	// DB와의 연결을 생성하고 Connection 객체를 반환화는 메소드 getConnection(). JDBC 드라이버를 로드해준다.
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			// localhost: 주소, 1521: 접속포트, XE: DB 인스턴스명
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "hr";
			String pw = "hr";
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 항상 ClassNotFoundException을 걸어줘야 함
			conn = DriverManager.getConnection(url, user, pw);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
		} catch (Exception e) {
			System.out.println("알 수 없는 오류" + e);
		}
		
		return conn;
	}
}
