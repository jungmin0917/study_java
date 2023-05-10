package ex2_function;

import java.util.function.Function;

public class Ex4_Function {
	
	public static void main(String[] args) {
		// Function�� �ռ�
		
		// String�� 16������ �ٲ���
											// Integer.parseInt(��, ����);
		Function<String, Integer> f = s -> Integer.parseInt(s, 16);
		
		// 16������ �������� �ٲ���
											// �������� ���� �ٲ���
		Function<Integer, String> g = i -> Integer.toBinaryString(i);
		
		// f.andThen(g) : f �Լ��� ���� �����ϰ� �� ������ g�� �����Ѵ�
		Function<String, String> h = f.andThen(g);
		
		// f.compose(g) : g �Լ��� ���� �����ϰ� �� ������ f�� �����Ѵ�
		Function<Integer, Integer> h2 = f.compose(g);
		
		System.out.println(h.apply("FF")); // FF -> 255 -> 11111111
		System.out.println(h2.apply(2)); // 2 -> 10 -> 16
	}

}
