package ex3_while;

import java.util.stream.IntStream;

public class Ex1_while {
	public static void main(String[] args) {
		// for문보다 간편한 구성을 가진 반복문 (선비교 후처리)
		
//		기본형
//		while(조건식) {
//			//
//		}
	
//		int i = 1; // 초기식 (while문에 쓸 변수)
//		while(i <= 100) {
//			System.out.println(i);
//			i++; // 증감식이라든지 while문을 끝내야 하니까 뭔가 변경은 돼야 함
//			
//		}
		
		int sum = IntStream.rangeClosed(1, 10).reduce(0, (acc, val) -> acc + val);
		
		System.out.println(sum);
		
		// 1 ~ 10까지의 합 구하기
//		int sum = 0;
//		int i = 1;
		
//		while(i <= 10) {
//			sum += i;
//			i++;
//		}
//		
//		System.out.println(sum);
		
//		do-while
//		while문은 선비교 후처리를 하지만
//		do-while문은 선처리 후비교를 하기 때문에 무조건 do 안쪽의 소스는 한 번 실행한다
//		제어문 중 유일하게 뒤에 세미콜론을 붙여야 한다.
//		
		
//		기본형
//		do {
//			
//		}while(조건식); // 여기의 세미콜론 말하는 것임
		
		
		
	}
}
