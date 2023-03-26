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
	
	Connection conn; // �ܺ� ������� DBMS�� ����̹��� ���� ������ ���� ��ü
	PreparedStatement pstm; // ���ڿ� �ȿ� �ִ� SQL���� ��ü�� ����, ������ �� �ڸ��� �˸´� ���� �־���, SQL�� �����Ŵ
	ResultSet rs; // SELECT�� ����� ��� ��ü (INSERT, DELETE, UPDATE�� ResultSet�� ���� (����� ���� ������ ��ȯ��)
	
	public void join(UserVO user) { // ȸ������ ó�� (id, password �� �Ű������� ���� �ޱ⿡�� �ʹ� �����ϱ� UserVO ��ü Ÿ������ ����)
		// ���� ��ü ���� ������ ����ڰ� �Է��� ���̴�
		// �� ���� �츮�� DB�� INSERT�� ���ָ� �ȴ�
		
		// DB���� SEQUENCE�� �ϳ� CREATE ���ָ�, ���� �ش� ��������.NEXTVAL��, INSERT�� �س��� �� �ִ�)
		// ���⿡���� SEQ_USER.NEXTVAL�� NUM���� �ְڴٴ� ���̴�.
		// SQL�� �ۼ�
		String query = "INSERT INTO TBL_USER VALUES(SEQ_USER.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			conn = DBConnector.getConnection(); // Connection ��ü�� ������ ������.
			pstm = conn.prepareStatement(query); // ������ �ۼ��� ������ prepareStatement ��ü�� ������ �����Ѵ�
			
			// ���� pstm ��ü�� �����߰�, �� ����ǥ�� ä���༭ �����ؾ� �Ѵ�.
			
			// ���� �� ����ǥ ������ŭ set�ڷ���(����ǥ��ġ, ������) �޼ҵ�� set�� ���� ���ش�. 
			// DB ������� �ؼ� �̷� ������ �κе鵵 Spring �����ӿ�ũ�� ���� �ξ� ������ ���̴�.
			pstm.setString(1, user.getId());
			pstm.setString(2, user.getName());
			pstm.setString(3, user.getPassword());
			pstm.setString(4, user.getGender());
			pstm.setString(5, user.getZipcode());
			pstm.setString(6, user.getAddress());
			pstm.setString(7, user.getAddress_detail());
			pstm.setString(8, user.getAddress_etc());
			
//			pstm.executeQuery(); // SELECT���� ������� �� executeQuery(). �� �޼ҵ�� ResultSet ��ü�� ��ȯ��.
			pstm.executeUpdate(); // ������ INSERT, UPDATE, DELETE ���� ���� �� �� �޼ҵ带 ����. ������� ���ڵ� ���� ��ȯ��.
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// ���� �ݴ� ������ �� �Ű澵 ��
			try {
				if(pstm != null) { // pstm ��ü�� �� �������� ���� �ݱ�
					pstm.close();
				}
				if(conn != null) { // conn ��ü�� �� �������� ���� �ݱ�
					conn.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e); // ��Ÿ�� ���� ������
			}
		}
	}
	
	// ���̵� �ߺ� �˻�
	public boolean checkId(String id) {
		String query = "SELECT COUNT(*) FROM TBL_USER WHERE ID = ?"; // �����ϸ� ����ó�� ������ ���� �������� ���� ����, ����ǥ�� ó���Ͽ� prepareStatement ��ü�� ���� execute�� �ϴ� ���� ����
		
		boolean check = false; // ���̵� �̹� ������ true, ������ false
		
		try {
			// DBMS ���� ��ü �����ؼ� Connection ��ü�� �ֱ�
			conn = DBConnector.getConnection();
			
			// String���� ����� ������ PreparedStatement ��ü�� ����
			pstm = conn.prepareStatement(query);
			
			// SQL ������ ?�� �ִٸ� �˸´� ������ �����ϱ�
			pstm.setString(1, id);
			
			// ���� ���� �� ����� ResultSet ��ü�� ���
			rs = pstm.executeQuery(); // ResultSet ��ü ��ȯ
			
			// ���� ���ڵ�� ������ �̵�
			rs.next(); // ������ �̵�
			// ������ �̵��� �÷�(��)�� Ÿ�Կ� ���缭 ��������
			int count = rs.getInt(1); // �ش� ���ڵ��� ù��° �ε����� int������ �������ڴ� ��� ���̴�
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
		// �츮�� �ڹ� �ʿ��� ������ ����Ѵٸ� ���⼭ ������ �����ͼ� ó���� �� ��� ��
		// ������ �츮�� JSP���� ���� ����ϴ� ��1 ������ ����ϰ� �ִ�.
		
		String query = "SELECT COUNT(*) FROM TBL_USER WHERE ID = ? AND PASSWORD = ?";
		
		boolean check = false; // �´� ���̵� ������ true, ������ false
		
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
