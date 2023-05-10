package calculator;

// 계산기 인터페이스 선언

// 해당 인터페이스가 람다식을 위한 인터페이스임을 표현하는 어노테이션을 붙여준다
@FunctionalInterface // 람다식 전용 인터페이스 선언
public interface MyCalculator {
	int plus(int num1, int num2); // 두 수를 더하는 추상 메소드 선언
}
