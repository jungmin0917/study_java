package ex2_Operator;

public class Ex2_Operator {
	public static void main(String[] args) {
		// 비교 연산자
		// 변수 또는 상수 값을 비교하여 참과 거짓을 판단하는 연산자
		// 연산의 결과가 항상 참, 거짓
		// <, >, <=, >=, ==, !=
		
		int n1 = 10;
		int n2 = 20;
		
		boolean result = (10 < 20);
		
		System.out.println(result);
		
		result = (n1 == n2);
		
		System.out.println(result);
		
		result = (n1 != n2);
		
		System.out.println(result);
		
		// 논리 연산자
		// 비교 연산자를 통한 연산이 2개 이상 필요할 때 사용한다
		// &&, ||, !
		
		// &&는 and(그리고)의 의미를 가짐
		
		int a = 10;
		int b = 7;

		result = (a > b && a == b);
		
		System.out.println(result);
		
		// ||는 or(또는)의 의미를 가짐

		result = (a > b || a == b);
		
		System.out.println(result);
		
		// !는 거짓의 의미를 가짐. 참을 거짓으로, 거짓을 참으로 바꿔줌
		
		result = !result;
		
		System.out.println(result);
		
		// F && T 또는 F일 때, F에서 이미 끝났으므로 T의 코드는 실행되지 않는다
		// T || F 또는 T일 때, T에서 이미 끝났으므로 F의 코드는 실행되지 않는다
		
		
		// 증감 연산자
		// ++, --
		// 1씩 증가시키거나, 1씩 감소시키는 연산자
		
		// 선행 증감연산자, 후행 증감연산자
		int c = 1;
		System.out.println(++c); // 선행 증감 : 먼저 증감한 후 사용함
		System.out.println(c++); // 후행 증감 : 먼저 사용한 후 증감함
		
		System.out.println(c);
		
	}
}
