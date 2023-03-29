package ex4_break;

public class Ex4_label_break {
	public static void main(String[] args) {
		
//		int n = 0;
//		
//		outer: while(true) {
//			if(n > 10) {
//				break;
//			}
//
//			while(true) {
//				n++;
//				if(n % 3 == 0) {
//					System.out.println("continue를 만남");
//					continue outer;
//				}
//				
//				System.out.println(n);
//			}
//		}
		
		// 반복문 안에서 쓰인 스위치의 break는 어떻게 될까
		
		int n = 0;
		
		while(n < 10) {
			n++;
			
			outer: switch(n) {
				case 1:
					System.out.println("switch문 1번 거쳐감");
					break; // 당연하지만, 해당 break는 switch문의 break이다
				case 2:
					System.out.println("switch문 2번 거쳐감");
					// switch문만 단독으로 사용할 때는 continue를 사용할 수 없다.
					continue; // 이 continue는 위 while문에 대한 continue이다;
			}
			
			System.out.println(n);
		}
	}
}
