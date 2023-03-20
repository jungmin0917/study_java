package ex1_If;

public class Ex3_if_elseif_else {
	public static void main(String[] args) {
		
//		if - elseif - else문
		
		int i = 20;
		
//		기본형
//		if(조건식1) {
//			
//		}else if(조건식2) {
//			
//		}else {
//			
//		}
		
//		int score = 75;
//		
//		String str = "";
//		
//		if(score <= 100 && score >= 90) {
//			str = "성적은 A입니다";
//		}else if(score >= 80) {
//			str = "성적은 B입니다";
//		}else if(score >= 70) {
//			str = "성적은 C입니다";
//		}else if(score >= 60) {
//			str = "성적은 D입니다";
//		}else {
//			str = "낙제입니다";
//		}
//		
//		System.out.println(str);
		
//		if문은 중첩도 가능하다
		
		
		// 정수형 변수 num에 임의의 값을 초기화
		// num이 5의 배수이면서 짝수이면 "x는 짝수입니다" 라고 출력하기
		
		int num = 8;
		if(num % 5 == 0 && num % 2 == 0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("짝수가 아닙니다");
		}
		
		
	}
}
