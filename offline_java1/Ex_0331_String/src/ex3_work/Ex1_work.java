package ex3_work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1_work {
	public static void main(String[] args) {
//		Ű���忡�� ���ĺ��� �������� �Է¹޴´�
//		�Է¹��� ���ڿ��� �ҹ��� a�� �� �� ����ִ��� �Ǻ��ϴ� �ڵ带 �ۼ�����.
		
//		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//			
//			System.out.println("���ĺ� ��ҹ��ڷ� ������ ���ڿ��� �Է����ּ���");
//			String str = br.readLine();
//			
//			String patt = "[^A-Za-z]";
//			
//			Pattern pattern = Pattern.compile(patt);
//			Matcher matcher = pattern.matcher(str);
//			
//			if(matcher.find()) { // ���ĺ��� ������ ���ڰ� �ִٸ�
//				throw new Exception("���ĺ� ��ҹ��ڸ� �Է����ּ���");
//			}
//			
//			int count = 0;
//			
//			for (int i = 0; i < str.length(); i++) {
//				if(str.charAt(i) == 'a') {
//					count++;
//				}
//			}
//			
//			bw.write(String.format("�Է��� ���ڿ����� a�� ������ %d���Դϴ�.", count));
//			
//			bw.flush();
//			bw.close();
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		
//		ȸ�� ���ϱ�
//		���ڿ��� �Է¹޾� ȸ������ �ƴ��� �Ǻ��ϴ� �ڵ� �ۼ�
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			System.out.println("���ڿ��� �ƹ��ų� �Է��ϼ���");
			String str = br.readLine();
			
			StringBuilder sb = new StringBuilder(str);
			
			String rev = sb.reverse().toString();
			
			String res = "";
			
			if(str.equals(rev)) {
				res = "ȸ���Դϴ�";
			}else {
				res = "ȸ���� �ƴմϴ�";
			}
			
			bw.write(res);
			
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
