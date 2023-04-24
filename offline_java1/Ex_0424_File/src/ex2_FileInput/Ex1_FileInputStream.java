package ex2_FileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1_FileInputStream {
	public static void main(String[] args) {
		// ���� ���� ������ �о���� ���ؼ���, Stream �������̽��� FileInputStream Ŭ������ ����ؾ� �Ѵ�
		
		// ...Stream : ����Ʈ ����� ��Ʈ���̸�, �׻� 1byte�� �о�´�.
		// ...Reader, ...Writer : Char ����� ��Ʈ���̸� �׻� 2byte�� �о�´�.		
		
		String path = "D:\\JAVA19_hjm\\test.txt";
		
		File file = new File(path);
		
		if(file.exists()) { // ������ ���� ���� ����
			try {
				FileInputStream input = new FileInputStream(file); // ���� ��ü(���)�� �Ű������� ����
				
				int code = 0;
				
				// read() �޼ҵ��, �� ���� 1byte�� �д´�
				// �� �̻� ���� ������ ���ٸ�, ������ ��(End Of File; EOF)�� -1�� �����´�
				// �ƽ�Ű�ڵ�, �����ڵ忡�� -1�� �ش��ϴ� ���ڰ� ���� ������ -1�� ���ߴ�.
				
				while((code = input.read()) != -1) { // 1����Ʈ�� �а� code�� ����
					System.out.println(code);
				}
				
				input.close(); // �׻� ��Ʈ���� �� ���� �ݾ���� �� (�� ������ �޸𸮿� ����������)
				
			} catch (FileNotFoundException e) { // �ش� ������ ���� ��� FileNotFoundException �߻�
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
