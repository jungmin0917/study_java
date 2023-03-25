package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	public static Connection getConnection() { // DB 연결을 해주는 getConnection 메소드 생성
		Connection conn = null; // Connection 객체 생성
		
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:XE"; // 접속처가 localhost, 포트번호 1521, DB명 XE
			String user = "hr";
			String pw = "hr";
			
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버를 로드해서 메모리에 올려둠
			
			conn = DriverManager.getConnection(url, user, pw); // 메모리에 로드된 드라이버를 통해 Connection 객체를 생성한다
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
