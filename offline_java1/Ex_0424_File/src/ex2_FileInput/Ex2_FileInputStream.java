package ex2_FileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex2_FileInputStream {
	public static void main(String[] args) {

		String path = "D:\\JAVA19_hjm\\test.txt";
		
		File file = new File(path);
		
		// ������ ����� ���� �� �ִ� ���ڷ� ���ڵ��Ϸ��� ����Ʈ �迭�� �ʿ��ϴ�
//		byte[] byteArr = new byte[1000]; 
		// file.length()�� ���� ũ��� ���� �� �ִ�
		// �ٸ�, ��ȯ���� Long�̱� ������ int�� ��ȯ�ؼ� �־�� �Ѵ�.
		byte[] byteArr = new byte[(int)file.length()];
		
		if(file.exists()) {
			try {
				FileInputStream input = new FileInputStream(file);
				
				input.read(byteArr); // �� ���� �о ����Ʈ �迭�� �־��ش�.
				
				String str = new String(byteArr);
				
				System.out.println(str);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
