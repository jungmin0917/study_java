package ex5_work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalMain {
	public static void main(String[] args) {
//		Ŭ������ ���� ������

//		�� ����, ���� ��ȣ�� �Է� �� ������ֱ�

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			System.out.print("���� �����ȣ ���� �������� �Է����ּ��� : ");
			
			String input = br.readLine();
			
			StringTokenizer st = new StringTokenizer(input);
			
			int a = Integer.parseInt(st.nextToken());
			char op = st.nextToken().charAt(0);
			int b = Integer.parseInt(st.nextToken());

			Pattern pattern = Pattern.compile("[^\\+\\-\\*\\/]");
			Matcher matcher = pattern.matcher(op + "");
			
			if(matcher.find()) {
				throw new Exception("�����ȣ�� +, -, *, / �� �Է����ּ���");
			}
			
			Cal cal = new Cal();
			
			String res = "";
			
			res = String.format("%d %c %d = %.2f", a, op, b, cal.calc(a, op, b));
			
			bw.write(res);
			
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			System.out.println("����� �Է����ּ���");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
