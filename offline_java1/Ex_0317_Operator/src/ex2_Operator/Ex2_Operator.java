package ex2_Operator;

public class Ex2_Operator {
	public static void main(String[] args) {
		// �� ������
		// ���� �Ǵ� ��� ���� ���Ͽ� ���� ������ �Ǵ��ϴ� ������
		// ������ ����� �׻� ��, ����
		// <, >, <=, >=, ==, !=
		
		int n1 = 10;
		int n2 = 20;
		
		boolean result = (10 < 20);
		
		System.out.println(result);
		
		result = (n1 == n2);
		
		System.out.println(result);
		
		result = (n1 != n2);
		
		System.out.println(result);
		
		// �� ������
		// �� �����ڸ� ���� ������ 2�� �̻� �ʿ��� �� ����Ѵ�
		// &&, ||, !
		
		// &&�� and(�׸���)�� �ǹ̸� ����
		
		int a = 10;
		int b = 7;

		result = (a > b && a == b);
		
		System.out.println(result);
		
		// ||�� or(�Ǵ�)�� �ǹ̸� ����

		result = (a > b || a == b);
		
		System.out.println(result);
		
		// !�� ������ �ǹ̸� ����. ���� ��������, ������ ������ �ٲ���
		
		result = !result;
		
		System.out.println(result);
		
		// F && T �Ǵ� F�� ��, F���� �̹� �������Ƿ� T�� �ڵ�� ������� �ʴ´�
		// T || F �Ǵ� T�� ��, T���� �̹� �������Ƿ� F�� �ڵ�� ������� �ʴ´�
		
		
		// ���� ������
		// ++, --
		// 1�� ������Ű�ų�, 1�� ���ҽ�Ű�� ������
		
		// ���� ����������, ���� ����������
		int c = 1;
		System.out.println(++c); // ���� ���� : ���� ������ �� �����
		System.out.println(c++); // ���� ���� : ���� ����� �� ������
		
		System.out.println(c);
		
	}
}
