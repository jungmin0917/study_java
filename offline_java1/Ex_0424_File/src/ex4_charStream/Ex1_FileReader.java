package ex4_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex1_FileReader {
	public static void main(String[] args) {
		
		// char ����� ��Ʈ���� Reader, Writer�� �ڽ� Ŭ�������� ���
		// �⺻������ 2byte�� �����ϱ� ������ 2byte ���� ������ ���ϵ� ���� ������� �����ϴ�
		// ������ ����Ʈ ��� ��Ʈ���� 1����Ʈ���̾ ������ ���� �־���.
		
		String path = "D:\\JAVA19_hjm\\test.txt";
		
		try {
			FileReader fr = new FileReader(path);
			
			int code = 0;
			
			// FileReader.read()�� ���� ���� �����ϸ� -1�� ��ȯ��
			while((code = fr.read()) != -1) { // char �ϳ��� �о �����Ѵ�
				System.out.print((char)code); // 2����Ʈ ������ ����Ǳ⿡ ������ ���� ������ ����
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
