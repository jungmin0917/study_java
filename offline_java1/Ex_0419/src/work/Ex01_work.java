package work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex01_work {
	public static void main(String[] args) {
		// ���̵� ���� : abc
		// abc ���
		
		// ���̵� ���� : abc2
		// abc abc2 ���
		
		// ���̵� ���� : abc3
		// abc abc2 abc3 ���
		
		// ���̵� ���� : ...
		
		// 5�� ���� �� ������
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<String> list = new ArrayList<>();
		
		String id;
		
		while(true) {
			try {
				if(list.size() >= 5) {
					System.out.println("���̵� 5�� �����Ǿ����ϴ�");
					System.out.println("���α׷� ����");
					break;
				}
				
				System.out.println("���̵� �Է����ּ���");
				id = br.readLine();

				if(duplicate(list, id)) {
					continue;
				}
				
				list.add(id);
				
				for (String v : list) {
					System.out.print(v + " ");
				}
				System.out.println();
				
			} catch (IOException e) {
				System.out.println("�Է� ����");
			}
		}
		
		// �� �ڵ忡�� �ߺ��� ���̵� �˻��ϴ� ���� �߰�
		// �ߺ��Ǹ� �ߺ��� ���̵� ��� �ϰ� �ٽ� �Է��ϰ� �����
		
		
	}

	private static boolean duplicate(List<String> list, String id) {
		boolean duplication = false;
		
		for (String v : list) {
			if(v.equals(id)) {
				System.out.println("�ߺ��� ���̵��Դϴ�");
				duplication = true;
			}
		}
		
		return duplication;
	}
}
