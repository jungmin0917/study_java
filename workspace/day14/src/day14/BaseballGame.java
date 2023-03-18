package day14;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class BaseballGame {
	public static void main(String[] args) throws IOException{
		
		// 숫자야구 게임 만들기
		int[] ball = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		Random rand = new Random();
		for (int i = 0; i < 1000; i++) {
			int r = rand.nextInt(10);
			
			// 섞기
			int temp = ball[0];
			ball[0] = ball[r];
			ball[r] = temp;
			
		}
		
		// 레벨에 따라 맞출 숫자 갯수 정하기 (최대 10까지)
		System.out.print("input the level : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int level = Integer.parseInt(br.readLine());
		String cpu = "";
		
//		System.out.println("CPU : ");
		for (int i = 0; i < level; i++) {
//			System.out.print(ball[i]);
			cpu += ball[i];
		}
		System.out.println();
		
		int count = 0;
		// System.currentTimeMillis() : 1970년 1월 1일부터 현재 시간까지 지난 시간을 1/1000초 단위로 얻어옴
		long start = System.currentTimeMillis(); // 게임 시작 시간
		
		// 맞출 때까지 반복한다
		while(true) {
			System.out.println("User : ");
			String user = br.readLine();
			
			int s = 0;
			int b = 0;
			
			// 스트라이크와 볼의 개수를 센다
			for (int i = 0; i < level; i++) {
				if(ball[i] == (int)(user.charAt(i)) - 48) { // 숫자 0~9까지는 아스키코드로 48~57을 점유한다
					s++;
				}else if(user.indexOf(ball[i] + "") != -1) { // 맞추진 못했지만 존재는 할 때
					b++;
				}
				
				// indexOf() : 문자열에 쓸 수 있는 메소드로서 문자열에서 괄호 안의 문자나 문자열이 최초로 나타나는 위치를 반환한다. 없으면 -1을 반환한다
				// 주의!! indexOf()의 매개변수로는 문자열 또는 char를 받는다. int값은 매개변수로 사용할 수 없다.
//				System.out.println(user.indexOf(ball[i]));
				
			}
			
			System.out.printf("strike : %d, ball : %d\n", s, b);
			
			// 
			
			if(user.equals(cpu)) {
				break;
			}
			
			count++;
		}
		
		long end = System.currentTimeMillis(); // 게임 종료 시간
		System.out.println("Correct!");
		System.out.printf("%d second consumed. number of challenges : %d\n", (end - start) / 1000, count);
		
	}
}
