package ex2_FileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex3_work {
	public static void main(String[] args) throws IOException {
		// file.txt�� ������ FileInputStream���� �о�� ��
		// �� ���� ȸ������ �ƴ��� �Ǻ��ϱ�
		
		String path = "D:\\JAVA19_hjm\\file.txt";
		
		File file = new File(path);
		
		FileInputStream input = new FileInputStream(file);
		
		byte[] byteArr = new byte[(int)file.length()];
		
		input.read(byteArr);
		
		String str = new String(byteArr);

		int len = str.length();
		int n = len / 2; // �Ҽ� ����
		
		boolean palindrome = true;
		
		System.out.println(str);
		
		for (int i = 0; i < n; i++) {
			if(str.charAt(i) != str.charAt(len - 1 - i)) {
				palindrome = false;
				break;
			}
		}
		
		if(palindrome) {
			System.out.println("ȸ���Դϴ�");
		}else {
			System.out.println("ȸ���� �ƴմϴ�");
		}
	}
}







