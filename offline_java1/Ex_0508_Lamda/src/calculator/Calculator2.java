package calculator;

public class Calculator2 {
	public static void main(String[] args) {
		
		// ���� ���� �͸� Ŭ����
		// �͸� Ŭ������ ���� Ŭ����(inner class)�� ��������, �̸��� ���� Ŭ������ ���Ѵ�.
		// ���߿� �ٽ� �ҷ��� �ʿ䰡 ���ٴ� ���� �����ϰ� �ִ�.
		// ���α׷����� �� ���� ���ǰ� �������� ��ü�̴�.
		
		MyCalculator calc = new MyCalculator() {
			@Override
			public int plus(int num1, int num2) {
				return num1 + num2;
			}
		};
		
		System.out.println(calc.plus(20, 30));
	}
}
