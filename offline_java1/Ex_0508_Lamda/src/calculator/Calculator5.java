package calculator;

import java.util.ArrayList;

public class Calculator5 {
	public static void main(String[] args) {
		
		// �÷��� �����ӿ�ũ (List, Set, Map)�� �Լ��� �������̽�
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("�̸�1");
		list.add("�̸�2");
		list.add("�̸�3");
		list.add("�̸�4");
		list.add("�̸�5");
		
		list.forEach(x -> System.out.println(x));
		
		list.forEach(System.out::println);
	}
}
