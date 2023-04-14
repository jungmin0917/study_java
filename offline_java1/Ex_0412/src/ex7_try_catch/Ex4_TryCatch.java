package ex7_try_catch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex4_TryCatch {
	public static void main(String[] args) {
		
//		���� : 100
//		��� : 100
		
//		���� : aab
//		aab��(��) ������ �ƴմϴ�
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {

			System.out.print("������ �Է����ּ��� : ");
			
			String input = br.readLine();			
			
			// ���⼭ �̸� throw�ؾ� �� ��
			
			Pattern pattern = Pattern.compile("[^0-9]");
			Matcher matcher = pattern.matcher(input);
			
			if(matcher.find()) {
				throw new Exception(String.format("%s��(��) ������ �ƴմϴ�", input));
			}
			
			bw.write(String.format("���� : %d\n", Integer.parseInt(input)));
			
		}catch (NumberFormatException e) {
			System.out.println("������ �Է����ּ���");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				bw.flush();
				bw.close();
			} catch (IOException e) {
				System.out.println("����� �����Դϴ�");
			}
		}
	}
}








