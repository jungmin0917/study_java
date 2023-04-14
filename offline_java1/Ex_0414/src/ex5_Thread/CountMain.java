package ex5_Thread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CountMain {
	public static void main(String[] args) {
		
//		숫자를 입력받고
//		숫자가 1씩 감소하다가 0이 되었을 때
//		"종료"라는 메세지와 함께 스레드를 빠져나오도록 만들기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			System.out.print("1 ~ 100 사이의 정수를 입력해주세요 : ");
			
			int n = Integer.parseInt(br.readLine());
			
			if(n < 1 || n > 100) {
				throw new NumberFormatException("1 ~ 100 사이로 입력해주세요");
			}
			
			CountThread ct = new CountThread();
			
			ct.setN(n);
			
			ct.start();
			
		} catch (NumberFormatException e) {
			if(e.getMessage() != null) {
				System.out.println(e.getMessage());
			}else {
				System.out.println("정수만 입력해주세요");
			}
		} catch (Exception e) {
			System.out.println("오류입니다");
		} finally {
			try {
				bw.flush();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}







