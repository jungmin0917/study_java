package ex2_function;

import java.util.ArrayList;

public class Ex1_Function {
	public static void main(String[] args) {
		
		// �÷��ǰ� �Լ��� �������̽� - List ����
		ArrayList<Integer> list = new ArrayList<>();
		
		// list�� 1���� 10���� ����
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		
		list.removeIf(x -> x % 2 == 0); // ¦�� ����
		
		System.out.println(list.toString());
		
	}
}
