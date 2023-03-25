package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	// DAO 클래스의 모든 메소드에서 사용할 DB연결 문법을 미리 메소드에 선언해 놓는다
	public static Connection getConnection() { // DB 연결을 해주는 getConnection 메소드 생성
		Connection conn = null; // Connection 객체 생성
		
		try {
			// DB 연결을 위한 정보를 입력한다 (url, username, password)
			String url = "jdbc:oracle:thin:@localhost:1521:XE"; // 접속처가 localhost, 포트번호 1521, DB명 XE
			String user = "hr";
			String pw = "hr";
			
			// JDBC 드라이버를 메모리에 할당한다
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버를 로드해서 메모리에 올려둠
			
			// 입력한 정보를 전달하여 드라이버를 통해 연결 객체를 가져온다.
			conn = DriverManager.getConnection(url, user, pw); // 메모리에 로드된 드라이버를 통해 Connection 객체를 생성한다
			
		// 각종 예외 처리
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 정상적으로 연결된 Connection 객체 반환 
		return conn;
	}
}
