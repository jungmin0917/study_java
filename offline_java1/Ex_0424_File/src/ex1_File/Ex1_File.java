package ex1_File;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		// IO (Input, Output) : ����� ��Ʈ��
		// ��Ʈ���̶�, �����͸� ������ϱ� ���� ���
		
		// File ��ü�� ������ ���
		String path = "D:\\JAVA19_hjm\\test.txt"; // ���� ��θ� �����η� ������
		// �������÷� ����� ��� �� �� ����, �����÷� ����� ��� 1�� ���� ��
		
		// �غ�� ��η� File ��ü ����
		File file = new File(path);
		
		// File Ŭ������ �����Ǹ鼭 path ��α��� ��Ʈ���� ����
		
		// isFile() : ���� Ŭ������ ������ ���� �������� ���� ������ ��� true, �ƴϸ� false
		// false��� �ؼ� ���� ���丮�� �ƴ�. �ɺ��� ��ũ, ����, FIFO ������ �� �ٸ� ������ ���� ����.
		if(file.isFile()) {
			System.out.println("�����Դϴ�");
			
			// length() : ������ ũ�⸦ ����Ʈ ������ ��ȯ��
			// ANSI ���� ���� �ѱ��� 1���� 2����Ʈ, ����� 1���� 1����Ʈ�̴�.
			// UTF-8 ���� ���� �ѱ��� 1���� 3����Ʈ, ����� 1���� 1����Ʈ�̴�.
			System.out.println(file.length());
			
			// UTF-8 ���ϰ� ANSI ���ڵ�ó�� ���� �ٸ� ���ڵ����� �� ������ ������ ������ ũ�Ⱑ �ٸ� �� ����
		}else {
			System.out.println("������ �ƴմϴ�");
		}
		
	}
}
