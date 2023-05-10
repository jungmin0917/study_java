package calculator;

public class Calculator {
	public static void main(String[] args) {
		
		// 해당 함수형 인터페이스는 추상 메소드를 하나만 가지고 있으므로, 해당 추상 메소드를 이용하여 람다식 문법을 통해 간단하게 익명 메소드를 구현하는 것이다.
		MyCalculator calc = (int num1, int num2) -> { return num1 + num2; };
		
		int result = calc.plus(20, 30);
		
		System.out.println(result);
	}
}
