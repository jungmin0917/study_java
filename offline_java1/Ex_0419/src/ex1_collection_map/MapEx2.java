package ex1_collection_map;

import java.util.HashMap;

public class MapEx2 {
	public static void main(String[] args) {
		
		HashMap<String, Double> map = new HashMap<>();

		map.put("k1", 100.0);
		map.put("k2", 3.14);
		map.put("k3", 4.15);
		
		// containsKey() : 해당 키값인 데이터를 가지고 있는지
		System.out.println(map.containsKey("k3"));
		System.out.println(map.containsKey("k4"));
		
		// containsValue() : 해당 값인 데이터를 가지고 있는지 (이와 같이 값으로도 검색이 가능하다)
		System.out.println(map.containsValue(100.0));
		System.out.println(map.containsValue(100.1));
		
//		System.out.println(map);
	}
}
