package ex2_switch;

public class Ex1_switch {
	public static void main(String[] args) {
		
//		기본형
//		switch(비교값) {
//			case 조건값:
//				실행할 코드
//				break; // 열거할 거면 없애도 됨
//			case 조건값1:
//				실행할 코드
//				break;
//			default: // 그 외의 조건
//				break;
//		}
		
		
		int n = 1;
		
		switch(n) {
			case 1:
				System.out.println("1. 게임하기");
				break; // 현재 switch문을 빠져나오는 키워드
			case 2:
				System.out.println("2. 게임소개");
				break;
			case 3:
				System.out.println("3. 종료");
				break;
			default:
				System.out.println("없는 메뉴입니다");
				break;
		}
		
		// 일반적으로 switch문이 if문에 비해 빠름
		// 다만 switch문은 비교값이 상수인 경우에만 편함
		
	}
}
