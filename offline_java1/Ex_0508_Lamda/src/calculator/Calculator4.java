package calculator;

public class Calculator4 {
	
	public static void main(String[] args) {
		MyCalculator calc = (n1, n2) -> n1 + n2;
		int result = myCalc(calc); // static �޼ҵ�� ���
		
		System.out.println(result);
		
		int result2 = myCalc((num1, num2) -> num1 + num2);
		
		System.out.println(result2);
	}
	
	// MyCalculator �������̽��� �Ű������� �޾� static �޼ҵ带 ����
	public static int myCalc(MyCalculator calc) {
		return calc.plus(1, 2);
	}
}
