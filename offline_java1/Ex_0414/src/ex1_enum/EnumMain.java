package ex1_enum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class EnumMain {
	
//	ENUM : 열거형
//	상수들의 묶음

	public enum Item{
//		사용자가 지정한 이름에 순차적으로 index가 부여된다
//		아래와 같은 경우 START는 0, PAUSE는 1, EXIT은 2가 부여될 것이다
//		하나하나를 상수형 객체라고 생각하자
		START, PAUSE, EXIT
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			System.out.println("0: 게임시작");
			System.out.println("1: 일시정지");
			System.out.println("2: 게임종료");
			
			System.out.print("번호를 입력해주세요 : ");
			
			int n = Integer.parseInt(br.readLine());
			
			Item start = Item.START;
			Item pause = Item.PAUSE;
			Item exit = Item.EXIT;

			if(n == start.ordinal()) {
				System.out.println("게임이 시작됨");
			}else if(n == pause.ordinal()) {
				System.out.println("게임이 일시정지됨");
			}else {
				System.out.println("게임 종료");
				break;
			}
		}
		
	}
}








