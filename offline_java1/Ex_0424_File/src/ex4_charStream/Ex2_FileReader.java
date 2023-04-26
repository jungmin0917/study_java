package ex4_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex2_FileReader {
	public static void main(String[] args) {
		
		// test.txt ������ �о
		// ���뿡 ���ĺ� �빮�ڿ� �ҹ��� ������ ����ϱ�
		
		// �빮�� : X��
		// �ҹ��� : X��
		
		// �ѱ۰� Ư�����ڴ� ���� ����
		
		String path = "D:\\JAVA19_hjm\\test.txt";
		
		int lower = 0;
		int upper = 0;
		
		try {
			FileReader fr = new FileReader(path);
			
			int input = 0;
			
			while((input = fr.read()) != -1) {
				if(input >= 65 && input <= 90) {
					upper++;
				}else if(input >= 97 && input <= 122) {
					lower++;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.printf(String.format("�빮�� : %d��\n�ҹ��� : %d��", upper, lower));
	}
}
