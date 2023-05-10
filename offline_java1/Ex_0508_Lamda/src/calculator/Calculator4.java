package calculator;

public class Calculator4 {
	
	public static void main(String[] args) {
		MyCalculator calc = (n1, n2) -> n1 + n2;
		int result = myCalc(calc); // static 메소드로 계산
		
		System.out.println(result);
		
		int result2 = myCalc((num1, num2) -> num1 + num2);
		
		System.out.println(result2);
	}
	
	// MyCalculator 인터페이스를 매개변수로 받아 static 메소드를 구현
	public static int myCalc(MyCalculator calc) {
		return calc.plus(1, 2);
	}
}
