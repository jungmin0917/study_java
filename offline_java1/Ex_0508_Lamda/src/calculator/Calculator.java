package calculator;

public class Calculator {
	public static void main(String[] args) {
		
		// �ش� �Լ��� �������̽��� �߻� �޼ҵ带 �ϳ��� ������ �����Ƿ�, �ش� �߻� �޼ҵ带 �̿��Ͽ� ���ٽ� ������ ���� �����ϰ� �͸� �޼ҵ带 �����ϴ� ���̴�.
		MyCalculator calc = (int num1, int num2) -> { return num1 + num2; };
		
		int result = calc.plus(20, 30);
		
		System.out.println(result);
	}
}
