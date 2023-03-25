package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	public static Connection getConnection() { // DB ������ ���ִ� getConnection �޼ҵ� ����
		Connection conn = null; // Connection ��ü ����
		
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:XE"; // ����ó�� localhost, ��Ʈ��ȣ 1521, DB�� XE
			String user = "hr";
			String pw = "hr";
			
			Class.forName("oracle.jdbc.driver.OracleDriver"); // ����̹��� �ε��ؼ� �޸𸮿� �÷���
			
			conn = DriverManager.getConnection(url, user, pw); // �޸𸮿� �ε�� ����̹��� ���� Connection ��ü�� �����Ѵ�
			
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
