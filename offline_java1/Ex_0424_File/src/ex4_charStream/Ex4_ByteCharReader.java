package ex4_charStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4_ByteCharReader {
	public static void main(String[] args) {
		
		// byte ��Ʈ���� char ��Ʈ���� ����
		
		String path = "D:\\JAVA19_hjm\\work\\Ex_0424_File\\src\\ex2_FileInput\\Ex1_FileInputStream.java";
		
		File file = new File(path);
		
		try {
			FileInputStream fis = new FileInputStream(file); // ��Ʈ���� ����
			
			// byte ����� ��Ʈ���� �� �� ���� ó���� �� �ȴ�.
			// BufferedReader�� �ʿ��ϴ�.
			
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			// InputStreamReader�� InputStream ��ü�� �Ű������� �޴´�.
			
			String str;
			
			// BufferedReader.readLine() : �� �پ� ���۷� �о���� �޼ҵ�
			while((str = br.readLine()) != null) { // BufferedReader.readLine()�� ������ ������ null�� ��ȯ��
				System.out.println(str);
			}
			
			// ������ ������ �ݴ�� �ݴ´�
			if(br != null) {
				br.close();
			}
			
			if(fis != null) {
				fis.close();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
