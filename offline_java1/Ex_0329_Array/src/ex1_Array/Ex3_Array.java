package ex1_Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Random;

public class Ex3_Array {
	public static void main(String[] args){
		// 배열 arr에 담겨있는 모든 값의 합을 출력
		
//		int[] arr = {10, 20, 30, 40, 50};

		// 순회 방법
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
		
		// Arrays.stream.sum() 메소드 이용
//		int result = Arrays.stream(arr).sum();
		
		// 람다식 누적합 (reduce 이용)
//		int result = Arrays.stream(arr).reduce(0, (acc, x) -> acc + x);
//		
//		System.out.println(result);
		
//		프로그램이 실행되면 문자형 배열 ch의 길이를 키보드에서 입력받아 넣는다
//		입력받은 길이에 따라 알파벳 출력 (ABC 순서대로)
		
//		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//			
//			System.out.print("1 ~ 26 사이의 정수를 입력하세요 : ");
//			
//			int n = Integer.parseInt(br.readLine());
//			
//			if(n < 1 || n > 26) {
//				throw new Exception("1 ~ 26 사이로 입력해주세요");
//			}
//			
//			char[] ch = new char[n];
//			
//			StringBuilder sb = new StringBuilder();
//			
//			for (int i = 0; i < ch.length; i++) {
//				// 이런 방식도 있고
////				sb.append((char)('A' + i));
//				
//				ch[i] = (char)(i + 65);
//			}
//			
////			System.out.println(sb); // 이런 방식도 있다
//			
//			System.out.println(ch);
//			
//		} catch (NumberFormatException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
//		Random rand = new Random();
//		
//		int r = rand.nextInt(1, 20);
//		
//		System.out.println(r);
		
//		변수 money에 10 ~ 5000 사이의 난수를 발생시켜 넣는다
//		단, 1의 자리 숫자는 반드시 0이 되도록 만들어준다
		
//		발생된 난수를 각각의 동전으로 바꾸면 몇 개씩 필요한지 판단하는 코드 작성하기
//		10원, 50원, 100원, 500원
//		가장 적은 동전의 수를 출력하기
		
		Random rand = new Random();
		
		int r = rand.nextInt(1, 501);
		
		r *= 10;
		
		int total = r;

		int m500 = r / 500;		
		r -= 500 * m500;
		int m100 = r / 100;
		r -= 100 * m100;
		int m50 = r / 50;
		r -= 50 * m50;
		int m10 = r / 10;
		
		String res = String.format("총 금액 : %d원\n500원 : %d개\n100원 : %d개\n50원 : %d개\n10원 : %d개", total, m500, m100, m50, m10);
		
		System.out.println(res);
	}
}
