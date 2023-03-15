package day06;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input the year : ");
		
		int n = sc.nextInt();
		
//		아래와 같이 프로그램에서 여러 번 사용되는 값은 변수에 저장시켜 사용하면 편리하다.
//		논리값을 미리 기억해놨다가 나중에 변수로 써먹어도 된다. PHP에서는 그냥 변수에 true, false로 선언했었던 그거다.
//		논리값을 기억하는 변수나 논리값을 리턴하는 메소드의 이름은 is로 시작하는 것이 관행이다
		boolean isYoonnyeon = n % 4 == 0 && (n % 100 != 0 || n % 400 == 0);
		
//		윤년 : 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때
		
//		원래는 아래와 같이 (n % 100 != 0 || n % 400 == 0) 여기가 괄호가 있어야 함
//		근데 괄호를 굳이 안 쳐도 정답이 되긴 하는데, 이런 이유는 연산자 우선순위가 앞에서부터 비교하고 그 둘의 결과를 또 뒤와 비교하기 때문임
//		제대로 하려면 괄호를 치는 게 좋음
		if(n % 4 == 0 && (n % 100 != 0 || n % 400 == 0)) {
			System.out.printf("%d is yoonnyeon\n", n);
		}else {
			System.out.printf("%d is not yoonnyeon\n", n);
		}
		
//		삼항연산자 ( ? : )를 사용하면 편리하다
		System.out.printf("%d is " + (n % 4 == 0 && (n % 100 != 0 || n % 400 == 0) ? "" : "not ") + "yoonnyeon", n);
		
		
		sc.close();
	}
}
