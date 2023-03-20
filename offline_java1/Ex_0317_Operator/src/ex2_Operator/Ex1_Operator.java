package ex2_Operator;

public class Ex1_Operator {
	
	public static void main(String[] args){
		// 1. 최고 우선순위 연산자 : . ()
		// 2. 증감 연산자 : ++, --
		// 3. 산술 연산자 : +, -, *, /, %
		// 4. 시프트 연산자 : >>, <<
		// 5. 비교 연산자 : >, <, >=, <=, ==, !=
		// 6. 비트 연산자 : &, |, ^, ~
		// 7. 논리 연산자 : &&, ||, !
		// 8. 삼항 연산자 : ?, :
		// 9. 대입 연산자 : =, +=, -=, *=, /=, %=
		
		// 시프트 연산자, 비트 연산자는 주로 정보보안에 이용됨
		
		// 산술 연산자
		int n1, n2, n3;
		
		n1 = 20;
		n2 = 7;
		
		n3 = n1 + n2;
		System.out.println(n3);
		
		n3 = n1 - n2;
		System.out.println(n3);
		
		n3 = n1 / n2;
		System.out.println(n3);
		
		n3 = n1 % n2;
		System.out.println(n3);
		
		
		// 짝수, 홀수 구할 때 또는 배수인지 확인할 때
		
		// 대입 연산자
		// 첫날부터 가장 많이 사용했던 연산자. 항상 우변의 값을 좌변에 대입한다고 생각
		// 산술연산자 + 대입연산자 = 복합대입연산자
		// +=, -=, *=, /=, %=
		
		n1 = 10;
		n2 = 7;
		
		System.out.println("+= 연산자 : n1 + n2 = " + (n1 += n2));
		System.out.println("-= 연산자 : n1 - n2 = " + (n1 -= n2));
		System.out.println("*= 연산자 : n1 * n2 = " + (n1 *= n2));
		System.out.println("%= 연산자 : n1 % n2 = " + (n1 %= n2));
	}
	
	
}
