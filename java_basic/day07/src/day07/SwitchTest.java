package day07;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input three scores : ");
		
		int java = sc.nextInt();
		int jsp = sc.nextInt();
		int spring = sc.nextInt();

		sc.close();
		
		int total = java + jsp + spring;
		double avg = (double)total / 3;
		
//		key값은 정수를 기억하는 변수 또는 연산 결과가 정수인 수식 또는 문자열이 가능 (실수는 안 됨)
//		switch(key) {
//			// key가 value와 같을 경우
//			case value:
//				// 실행할 문장
//				break;
//			// key가 value2와 같을 경우
//			case value2:
//				// 실행할 문장
//				break;
//			default: // 그 외의 경우
//				// 실행할 문장
//				break;
//		}
		
		System.out.println("average : " + avg);
		
//		같은 작업을 하는 case는 나열할 수 있다
		switch((int)avg / 10) { // 그냥 avg만 하면 정수가 아닌 실수형이라서 안 됨. 정수형으로 캐스팅 해주어야 함
//			case 100:
//				break;
//			case 99:
//				break;
		
//		아래와 같이 나열할 수 있다
//			case 100: case 99: case: ...
//				break;
		
			case 10: 
			case 9:
				System.out.println("A");
				break;
			case 8: 
				System.out.println("B");
				break;
			case 7: 
				System.out.println("C");
				break;
			case 6: 
				System.out.println("D");
				break;
			default:
				System.out.println("F");
				break;
		}
	}
}