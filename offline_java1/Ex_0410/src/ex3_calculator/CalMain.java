package ex3_calculator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CalMain {
	public static void main(String[] args) {
		try {
			// Calculator 클래스를 만들고
			// getResult() 메소드 정의
			// 반환형은 정수, 인자는 정수 n1, n2을 받고 리턴값은 -1
			
			// CalPlus 클래스 만들어 Calculator 클래스 상속받음
			// 오버라이딩 이용하여 getResult() 함수를 재정의하여
			// 인자로 받은 n1 + n2를 반환하는 함수를 만든다
			
			// CalMinus도 마찬가지
			
			CalPlus calPlus = new CalPlus();
			CalMinus calMinus = new CalMinus();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			System.out.print("두 정수를 입력하세요 : ");
			
			String input = br.readLine();
			
			StringTokenizer st = new StringTokenizer(input);
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			String res = String.format("%d + %d = %d\n%d - %d = %d", a, b, calPlus.getResult(a, b), a, b, calMinus.getResult(a, b));
			
			bw.write(res);
			
			bw.flush();
			bw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
