package ex1_If;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex2_if_else {
	public static void main(String[] args) {
		// if - else문
		
//		기본형
//		if(조건식) {
//			
//		}else {
//			
//		}
		
//		int n = 50;
//		String str;
//		
//		int m;
//		
//		if(n >= 50) {
//			str = "n is more than 50";
//		}else {
//			str = "n is less than 50";
//		}

//		중요 : 선언만 하면 조건문 내에서 그 변수를 쓸 수는 없다
//		중요 : 조건문 내에서 어떤 변수를 쓰려면 해당 변수를 초기화해주어야 한다
		
//		System.out.println(str);
		
		
		// 정수형 변수 age에 나이 초기화
		// 30세 이상이면 드실만큼 드셨네요
		// 그렇지 않으면 더 드세요
		// 감사합니다 문장 출력
		
		while(true) {
			
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
				System.out.print("나이를 입력해주세요 : ");
				
				int age = Integer.parseInt(br.readLine());
				
				String str = age >= 30 ? "드실만큼 드셨네요" : "더 드세요";
				str += "\n감사합니다\n";
				
				bw.write(str);
				
				bw.flush();
				bw.close();
				
				break;
				
			} catch (Exception e) {
				System.out.println("숫자로 다시 입력해주세요\n");
			}
			
		}
	}
}
