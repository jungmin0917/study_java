package ex2_method;

import java.util.stream.IntStream;

public class MethodTest {

	// f(x) = 2x + 1; // x�� �Ű�����
	
	// �Ʒ�ó�� ��ȯ���� �ٸ��� �����ε� �� ��
	public int f(int x) {
		return 2*x + 1;
	}
	
	public void f2(int x) {
		System.out.printf("f(%d) = %d", x, 2*x + 1);
	}
	
	public int sum(int a, int b) {
		return a + b;
	}
	
//	1���� 10���� ����ϴ� oneToTen �Լ� �����
	public String oneToTen() {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= 10; i++) {
			sb.append(i).append("\n"); 
		}

		return sb.toString();
	}
	
//	1���� 10���� ���ؼ� ����ϱ�
	public int getTotal() {
		return IntStream.rangeClosed(1, 10).sum();
	}
	
//	���� �ϳ� �޾Ƽ� ������ ����� (�ٵ� 1000000 ���Ϸθ� �ޱ�. long������ ��ġ ����)
	public String gugudan(int n) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= 9; i++) {
			String str = String.format("%d * %d = %d", n, i, n*i);
			
			sb.append(str).append("\n");
		}
		
		return sb.toString();
	}
	
	public int valueTest(int x) {
		x++;
		return x;
	}
}














