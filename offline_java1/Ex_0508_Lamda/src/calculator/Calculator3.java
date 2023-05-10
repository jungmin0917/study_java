package calculator;

public class Calculator3 {
	public static void main(String[] args) {
		MyCalculator calc = (int num1, int num2) -> {
			return num1 + num2;
		};
		
		// 아래와 같이 자료형도 생략이 가능하다 (어차피 인터페이스에 정의되어 있음)
		MyCalculator calc2 = (num1, num2) -> {
			return num1 + num2;
		};
		
		// 중괄호와 return도 생략이 가능하다
		MyCalculator calc3 = (a, b) -> a + b;		
		
		System.out.println(calc.plus(1, 2));
		System.out.println(calc2.plus(3, 4));
		System.out.println(calc3.plus(5, 6));
		
		MyFunction myFunction = num1 -> System.out.println(num1);
		
		// :: (이중 콜론) : 메서드 참조 연산자
		// 람다식을 보다 간결하게 사용할 수 있게 해준다.
		MyFunction myFunc = System.out::println;
		
		myFunction.method(10);
		myFunc.method(10);
	}
}
