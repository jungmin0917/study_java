package work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class UserMain {
	public static void main(String[] args) {
		// ���� ���̵�� �н����� ���� �� �ִ� UserInfo Ŭ���� �����,
		// main Ŭ�������� ������ ���̵�� ��й�ȣ�� Ű���忡�� �Է¹޾� ��ü�� �����ϰ�
		// ArrayList�� �߰��Ͽ� ����ϱ�
		
		// ���
		
		// ���̵� ���� : aaa
		// �н����� ���� : 1234
		
		// aaa
		// 1234
		// -----------------

		// ���̵� ���� : bbb
		// �н����� ���� : 5678

		// aaa
		// 1234
		// ------
		// bbb
		// 5678
		// -----------------
		
		// 3�� �Է¹����� �����ϱ�
		
		List<UserInfo> list = new ArrayList<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String id;
		String pw;
		
		while(true) {
			try {
				if(list.size() >= 3) {
					System.out.println("���α׷� ����");
					break;
				}
				
				System.out.print("���̵� �Է��ϼ��� : ");
				id = br.readLine();
				
				// ���̵� �ߺ��˻�
				if(duplicate(list, id)) {
					continue;
				}
				
				System.out.print("��й�ȣ�� �Է��ϼ��� : ");
				pw = br.readLine();
				
				UserInfo ui = new UserInfo(id, pw);
				
				list.add(ui);
				
				for (UserInfo userinfo : list) {
					System.out.println("-----");
					System.out.println(userinfo.getId());
					System.out.println(userinfo.getPw());

				}
				
				System.out.println("-------------------");
				
				
			} catch (IOException e) {
				System.out.println("�Է� ����");
			}
		}
		
	}

	private static boolean duplicate(List<UserInfo> list, String id) {
		boolean duplication = false;
		
		for (UserInfo v : list) {
			if(v.getId().equals(id)) {
				System.out.println("�ߺ��� ���̵��Դϴ�");
				duplication = true;
			}
		}
		
		return duplication;
	}
}









