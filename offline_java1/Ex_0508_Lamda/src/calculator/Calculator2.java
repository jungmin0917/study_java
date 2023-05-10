package calculator;

public class Calculator2 {
	public static void main(String[] args) {
		
		// 지역 내부 익명 클래스
		// 익명 클래스는 내부 클래스(inner class)의 일종으로, 이름이 없는 클래스를 말한다.
		// 나중에 다시 불러질 필요가 없다는 뜻을 내포하고 있다.
		// 프로그램에서 한 번만 사용되고 버려지는 객체이다.
		
		MyCalculator calc = new MyCalculator() {
			@Override
			public int plus(int num1, int num2) {
				return num1 + num2;
			}
		};
		
		System.out.println(calc.plus(20, 30));
	}
}
