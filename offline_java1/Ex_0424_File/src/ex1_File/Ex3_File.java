package ex1_File;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
		
		String path = "D:\\JAVA19_hjm\\aaa\\bbb";
		
		File file = new File(path);
		
		// exists() : �ش� ��ġ�� �����̳� ���͸� �����ϴ��� ����
		if(!file.exists()) {
			// mkdir(), mkdirs() �ش� ��ġ�� ���͸� ����� �޼ҵ�
			// �ش� ��ġ�� ����� ���� �ʿ��� ���͸��� �� �� �̻��̸� mkdirs()�� ����ؾ� �Ѵ�
			// mkdir()�� �ϳ��� ���� ����
			file.mkdir();
			System.out.println("���� ����!");
			
			// �ش� ��ġ�� ����� ���� �� �� �̻��� ���͸��� �ʿ��� �� mkdir() �޼ҵ带 ����ϸ� �ƿ� ������ �� ��
		}
	}
}