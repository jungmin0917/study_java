package ex1_collection_map;

import java.util.HashMap;

public class MapEx2 {
	public static void main(String[] args) {
		
		HashMap<String, Double> map = new HashMap<>();

		map.put("k1", 100.0);
		map.put("k2", 3.14);
		map.put("k3", 4.15);
		
		// containsKey() : �ش� Ű���� �����͸� ������ �ִ���
		System.out.println(map.containsKey("k3"));
		System.out.println(map.containsKey("k4"));
		
		// containsValue() : �ش� ���� �����͸� ������ �ִ��� (�̿� ���� �����ε� �˻��� �����ϴ�)
		System.out.println(map.containsValue(100.0));
		System.out.println(map.containsValue(100.1));
		
//		System.out.println(map);
	}
}
