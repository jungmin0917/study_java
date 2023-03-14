package day02;

public class PrintTest {
	public static void main(String[] args) {
		System.out.println("hello java");
		System.out.print("hello java");
		System.out.println("\n"); // 빈칸이면 그냥 줄바꿈 (\n과 같음)
		
		System.out.println("5 + 3 = " + 5 + 3); // 결과가 53
		System.out.println("5 + 3 = " + (5 + 3)); // 결과가 8
//		System.out.println("5 + 3 = " + 5 - 3); // 문자열에서 -를 하게 하므로 오류가 난다
		System.out.println("5 - 3 = " + (5 - 3)); // 결과가 2
		System.out.println("5 * 3 = " + 5 * 3);
		System.out.println("5 / 3 = " + 5 / 3); // 자바에서는 기본적으로 정수 나눗셈하면 정수임 (묵시적 형변환)
		System.out.println("5 % 3 = " + 5 % 3);
		
		
//		묵시적 형변환 : 자료형의 크기가 서로 다른 자료의 연산 결과는 크기가 큰 자료형으로 자동 변환됨.
		
//		자바의 기본 자료형
//		boolean : 1바이트 (8비트)
//		char : 2바이트, 문자 1개를 기억
//		short : 2바이트, -32768 ~ 32767 사이의 정수를 기억
//		int : 4바이트, -21억 ~ 21억 사이의 정수를 기억
//		long : 8바이트 : -2의 63승 ~ 2의 63승 - 1 사이의 정수를 기억
//		float : 4바이트, 단정도 실수, 소수점 아래 7자리 정도를 기억
//		double : 8바이트, 배정도 실수, 소수점 아래로 15자리 정도를 기억. 일반적으로 실수는 double을 사용함
		
		System.out.println("5 / 3.0 = " + 5 / 3.0); // 두 수 중 하나라도 실수이면 실수(double 자료형)로 계산이 된다 (묵시적 형변환)
		System.out.println("5.0 / 3 = " + 5.0 / 3);
		
//		작은 따옴표는 두 글자 이상을 적을 수 없음

		System.out.println("A + 32 = " + ('A' + 32)); // 묵시적 형변환에 의해 A가 아스키코드값인 65로 변경되어 계산됨
		
//		명시적 형변환 : 개발자가 그 순간의 자료형을 변경하는 것. casting(형변환)이라고도 한다
		System.out.println("A + 32 = " + (char)('A' + 32));
		System.out.println("a - 32 = " + (char)('a' - 32));
		
//		서식 있는 출력(printf() -> c언어의 printf 사용법과 같음)
//		printf("출력 서식", 출력할 내용);
//		출력 서식 문자 : d(정수), f(실수), c(문자), s(문자열) 정도가 있다
//		출력 서식의 형식 : %[-][0][n][.m]서식문자
//		- : 출력할 전체 자리수가 지정된 경우 왼쪽에 맞춰 출력한다.
//		0 : 출력할 전체 자리수가 지정된 경우 왼쪽의 남는 자리에 0을 채워 출력한다.
//		n : 출력할 전체 자리수
//		.m : 소수점 아래 자리수, 잘리는 자리에서 반올림하여 출력한다. 원래 데이터값은 당연히 변경되지 않는다.
		
//		사용법은 System.out.printf() 메소드를 사용한다
//		따로 단축키는 없으니 sysout으로 println 후 수정하자
		System.out.printf("5 + 3 = %d", 5 + 3); // 이와 같이 사용하면 된다
		System.out.println();
		System.out.printf("%d + %d = %d", 5, 3, 5 + 3);
//		System.out.printf("%d / %d = %d", 5, 3.0, 5 / 3); // 이렇게 쓰면 연산결과가 실수이므로 맞지 않는다
		System.out.printf("%d / %f = %f", 5, 3.0, 5 / 3.0); // 앞과 뒤를 전부 다 맞춰줘야 함 (f로 선언하고 그냥 정수 써도 안 됨)
		
		
	}
}