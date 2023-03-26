package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	// DAO Ŭ������ ��� �޼ҵ忡�� ����� DB���� ������ �̸� �޼ҵ忡 ������ ���´�
	public static Connection getConnection() { // DB ������ ���ִ� getConnection �޼ҵ� ����
		Connection conn = null; // Connection ��ü ����
		
		try {
			// DB ������ ���� ������ �Է��Ѵ� (url, username, password)
			String url = "jdbc:oracle:thin:@localhost:1521:XE"; // ����ó�� localhost, ��Ʈ��ȣ 1521, DB�� XE
			String user = "hr";
			String pw = "hr";
			
			// JDBC ����̹��� �޸𸮿� �Ҵ��Ѵ�
			Class.forName("oracle.jdbc.driver.OracleDriver"); // ����̹��� �ε��ؼ� �޸𸮿� �÷���
			
			// �Է��� ������ �����Ͽ� ����̹��� ���� ���� ��ü�� �����´�.
			conn = DriverManager.getConnection(url, user, pw); // �޸𸮿� �ε�� ����̹��� ���� Connection ��ü�� �����Ѵ�
			
		// ���� ���� ó��
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// ���������� ����� Connection ��ü ��ȯ 
		return conn;
	}
}
