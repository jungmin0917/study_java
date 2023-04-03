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
//		클래스로 계산기 만들어보기

//		두 숫자, 연산 기호를 입력 후 계산해주기

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			System.out.print("정수 연산기호 정수 형식으로 입력해주세요 : ");
			
			String input = br.readLine();
			
			StringTokenizer st = new StringTokenizer(input);
			
			int a = Integer.parseInt(st.nextToken());
			char op = st.nextToken().charAt(0);
			int b = Integer.parseInt(st.nextToken());

			Pattern pattern = Pattern.compile("[^\\+\\-\\*\\/]");
			Matcher matcher = pattern.matcher(op + "");
			
			if(matcher.find()) {
				throw new Exception("연산기호는 +, -, *, / 중 입력해주세요");
			}
			
			Cal cal = new Cal();
			
			String res = "";
			
			res = String.format("%d %c %d = %.2f", a, op, b, cal.calc(a, op, b));
			
			bw.write(res);
			
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			System.out.println("제대로 입력해주세요");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
