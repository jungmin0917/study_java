package ex2_Operator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex3_Operator {
	public static void main(String[] args) throws IOException{
		try {
			
			// 삼항 연산자
			// 사용 방법 (조건) ? (참일 때 실행할 문장) : (거짓일 때 실행할 문장)
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
//			System.out.print("input a and b : ");
//			
//			String input = br.readLine();
//			
//			StringTokenizer st = new StringTokenizer(input);
//			
//			int a = Integer.parseInt(st.nextToken());
//			int b = Integer.parseInt(st.nextToken());
//			
//			String result = String.format("a: %d, b: %d\n", a, b);
//			
//			result += a > b ? "a is bigger than b" : "a is not bigger than b";
			
			// 과수원이 있다.
			// 배, 사과, 오렌지를 키우고 있는데 하루 생산량이 각각 5, 7, 5개이다.
			// 하루 생산되는 총 개수를 출력하고
			// 시간당 전체 과일의 평균 생산 개수를 출력
			// 평균값을 담는 변수는 float으로 할 것
			
			int a = 5;
			int b = 7;
			int c = 5;
			
			int total = a + b + c;
			float avg = (float)total / 24;
			
			String result = String.format("하루 생산 총 개수: %d, 시간당 전체 과일 평균 생산 갯수 : %f", total, avg);
			
			bw.write(result);

			bw.flush();
			bw.close();
			
		} catch (Exception e) {
			System.out.println("input mismatch");
		}
		
	}
}
