package ex2_switch;

public class Ex2_switch {
	public static void main(String[] args) {
		
//		char c = 'A';
//		
//		switch(c) {
//			case 'A':
//				// 쏼라쏼라
//				break;
//			case 'B':
//				break;
//			case 'C':
//				break;
//			case 'D':
//				break;
//			default:
//				break;
//		}
//		
//		String str = "홍";
//		switch(str) {
//			case "김":
//				System.out.println("김길동");
//				break;
//			case "이":
//				System.out.println("이길동");
//				break;
//			case "박":
//				System.out.println("박길동");
//				break;
//			case "홍":
//				System.out.println("홍길동");
//				break;
//			default:
//				break;
//		}
		
		// 의도적으로 break; 생략 가능
		int num = 5;
		
		switch(num) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 9:
				System.out.println("홀수");
				break;
			case 2:
			case 4:
			case 6:
			case 8:
			case 10:
				System.out.println("짝수");
				break;
			default:
				break;
		}
		
	}
}
