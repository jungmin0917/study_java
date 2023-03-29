package ex5_continue;

public class Ex1_continue {
	public static void main(String[] args) {
		
//		반복문 내에서 continue를 만나면 가장 가까이 있는 반복문의 다음 스텝으로 넘어간다
//		continue문 : 반복문 내에서 특정 문장을 건너뛰고자 할 때 사용
		
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 5; j++) {
				
				if(j % 2 == 0) {
					continue;
				}
				
				System.out.print(j + " ");				
			}
			
			System.out.println();
		}
		
//		기타제어문의 특징
//		반복문 안에서 사용이 된다.
//		break, continue문 밑에는 어떠한 코드도 올 수 없다.
		
		
	}
}
