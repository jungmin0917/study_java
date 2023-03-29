package ex7_Scanner;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Ex2_Scanner {
	public static void main(String[] args) throws IOException{
		// 키보드에서 값을 입력받고 구구단을 출력하기
		// 2~9 이외의 숫자를 입력하면 2~9사이의 숫자만 입력하세요 라는 메시지 출력
		
//		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			
//			StringBuilder sb = new StringBuilder();
//			
//			System.out.println("2~9 사이의 숫자를 입력해주세요");
//			int n = Integer.parseInt(br.readLine());
//			
//			if(n < 2 || n > 9) {
//				throw new Exception("2~9 사이의 숫자로 입력해주세요");
//			}
//			
//			for (int i = 1; i <= 9; i++) {
//				sb.append(String.format("%d * %d = %d", n, i, n * i)).append("\n");
//			}
//			
//			System.out.println(sb);
//			
//		} catch (NumberFormatException e) {
//			System.out.println("숫자만 입력해주세요");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
//		for vs while
//		for문은 내가 정확히 몇번을 반복해야 하는지 아는 경우에 주로 사용
//		while문은 내가 정확히 몇번을 반복해야 하는지 몰라도 사용
//		
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//
//		while(num != -1) {
//			System.out.print("정수를 입력해주세요 : ");
//			num = sc.nextInt();
//
//			System.out.printf("입력한 정수 : %d\n", num);
//		}
//		
//		System.out.println("-1을 입력하여 빠져나감");
		
//		키보드에서 숫자 입력받기
//		1 ~ n 까지의 합을 계산하여 결과 출력
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			System.out.print("a, b를 입력해주세요 (음이 아닌 정수로) : ");
		
			String input = br.readLine();
			
			StringTokenizer st = new StringTokenizer(input);
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a < 0 || b < 0 || a > 1000000 || b > 1000000) {
				throw new Exception("1부터 1000000까지의 양의 정수를 입력해주세요");
			}
			
			int min = Math.min(a, b);
			int max = Math.max(a, b);
			
			int sum = 0;
			
			for (int i = min; i <= max; i++) {
				sum += i;
			}
			
			bw.write(String.format("%d ~ %d까지의 합은 %d입니다", a, b, sum));
			
			bw.flush();
			bw.close();
			
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력하세요");
		} catch (IOException e) {
			System.out.println("입력 오류");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
}
