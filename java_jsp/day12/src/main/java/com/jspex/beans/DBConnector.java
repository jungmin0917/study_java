package com.jspex.beans;

import java.sql.Connection; // sql 관련된 자바 내장 클래스
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	public static Connection getConnection() {
		Connection conn = null; // 커넥션 객체 넘
		
		try {
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
