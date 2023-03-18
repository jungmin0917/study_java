package day11;

public class WhileTest {
	public static void main(String[] args) {

//		while(조건식) {
//			// 조건이 참인 동안 실행할 문장
//		}
		
//		do~while문은 무조건 do 안에 있는 거 한 번은 실행한다
//		하지만 while문은 최초 진입 조건이 거짓일 경우 {} 블록을 한 번도 실행하지 않는다
		
//		do {
//			// 조건이 참인 동안 실행할 문장
//		}while(조건식);
		
		int sum = 0;
		int i = 1;
		
		while(i <= 100) {
			sum += i;
			i++;
		}
		
		sum = i = 0; // 이미 선언된 변수에 한해서 왼쪽과 같이 할 수 있음
	
		do {
			sum += i++;
		} while (i <= 100);
		
		System.out.println(sum);
		
	}
}
