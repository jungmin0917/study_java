package ex2_function;

import java.util.HashMap;

public class Ex2_Function {
	public static void main(String[] args) {
		
		// �÷��ǰ� �Լ��� �������̽� - Map ����
		
		HashMap<String, String> map = new HashMap<>();
		
		for (int i = 1; i <= 10; i++) {
			map.put("id" + i, "�̸�" + i);
		}
		
		// map�� ������ ������� �ʴ´�.
		
		map.forEach((key, value) -> {
			
			// Map.compute() : Map�� ����ִ� ����� value���� ������ �� ���
			map.compute(key, (k, v) -> v + "**");
			
		});
		
		map.forEach((key, value) -> {
			System.out.printf("key = %s, value = %s\n", key, value);
		});
		
	}

}
