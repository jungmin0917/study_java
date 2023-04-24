package ex1_File;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		String path = "D:\\JAVA19_hjm";
		// ���� �������� ���͸����, ���� ��ϵ��� �̸��� ������ ���� ����.
		
		File file = new File(path);
		
		// isDirectory() : ���� Ŭ������ ������ ���� �������� ���丮 ������ ��� true, �ƴϸ� false
		if(file.isDirectory()) {
			// list() : �ش� �����̳� ���丮�� ���Ե� ���� �� ���丮�� �̸��� ���ڿ� �迭�� ��ȯ�� 
			// ���� �ش� �����̳� ���丮�� ���� ���, NullPointerException�� �߻���.
			String[] names = file.list();
			
			for (String name : names) {
				System.out.println(name);
			}
			
		}
	}
}
