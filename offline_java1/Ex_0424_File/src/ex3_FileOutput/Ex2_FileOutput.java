package ex3_FileOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2_FileOutput {
	public static void main(String[] args) {
		
		String path = "D:\\JAVA19_hjm\\fileOut.txt";
//		String path = "D:\\JAVA19_hjm\\fileOut.html"; // �̷��� html ���Ϸε� ���� �� �ִ�
//		String path = "D:\\JAVA19_hjm\\fileOut.docx"; // �̷��� docx�ε� ������ �� ������ ����� ������ �� �� ���� ���� �ִ�
		
		try {
//			FileOutputStream output = new FileOutputStream(path); // path�� ������ ����⸦ �ϰ� �ȴ�
			FileOutputStream output = new FileOutputStream(path, true); // append �ɼǿ� true�� �ָ� ���� ���ϳ��� �ڿ� ���̰� �ȴ�.
			
			output.write('F');
			output.write('I');
			output.write('L');
			output.write('E');
			
			String msg = "fileOutput �����Դϴ�.\n";
			String msg2 = "���� �ٵ� ����";
			
			// String.getBytes(����Ʈ �迭) �޼ҵ�� ���ڿ����� ����Ʈ �迭�� ��ȯ�� �� ����
			output.write(msg.getBytes());
			output.write(msg2.getBytes());

			output.flush();
			output.close();
			
			System.out.println("���� ���� �Ϸ�");
			
		} catch (FileNotFoundException e) { // ������ ���� ��� ���
			e.printStackTrace();
		} catch (IOException e) { // ����� ����
			e.printStackTrace();
		}
		
	}
}
