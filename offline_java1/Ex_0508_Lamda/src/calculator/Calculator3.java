package calculator;

public class Calculator3 {
	public static void main(String[] args) {
		MyCalculator calc = (int num1, int num2) -> {
			return num1 + num2;
		};
		
		// �Ʒ��� ���� �ڷ����� ������ �����ϴ� (������ �������̽��� ���ǵǾ� ����)
		MyCalculator calc2 = (num1, num2) -> {
			return num1 + num2;
		};
		
		// �߰�ȣ�� return�� ������ �����ϴ�
		MyCalculator calc3 = (a, b) -> a + b;		
		
		System.out.println(calc.plus(1, 2));
		System.out.println(calc2.plus(3, 4));
		System.out.println(calc3.plus(5, 6));
		
		MyFunction myFunction = num1 -> System.out.println(num1);
		
		// :: (���� �ݷ�) : �޼��� ���� ������
		// ���ٽ��� ���� �����ϰ� ����� �� �ְ� ���ش�.
		MyFunction myFunc = System.out::println;
		
		myFunction.method(10);
		myFunc.method(10);
	}
}
