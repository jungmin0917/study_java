package ex7_try_catch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex3_TryCatch {
	public static void main(String[] args) {
		// 키보드에서 정수 입력받게 하고, 정수 이외 값이 입력되었으면 "정수만 입력 가능"
		
		// 정수를 입력받은 경우
		// 정수 : 100
		// 입력받은 수 : 100
		
		// 정수를 입력받지 않은 경우
		// 정수만 입력 가능
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			System.out.print("정수를 입력해주세요 : ");
			
			int n = Integer.parseInt(br.readLine());
			
			bw.write(String.format("입력받은 수 : %d\n", n));
			
		} catch(NumberFormatException e) {
			System.out.println("정수만 입력 가능");
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다");
		} finally {
			System.out.println("프로그램 종료");
			
			try {
				bw.flush();
				bw.close();
			} catch (IOException e) {
				System.out.println("출력 에러입니다");
			}
			
		}
	}
}













