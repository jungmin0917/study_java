package ex1_collection_map;

import java.util.HashMap;

public class MapEx1 {
	public static void main(String[] args) {
		
		// Map의 구조는 키(Key)값과 값(Value)가 하나의 데이터로 저장됨
		// Map의 구조는 Key를 통해서 Value를 검색해내므로 많은 양의 데이터 안에서
		// 조회하는 데에 있어서 매우 뛰어난 성능을 발휘한다.
		
		// Map을 구현하고 있는 자식 클래스 중 가장 많이 사용하는 클래스가 HashMap이다
		// 아래에 적은 것이 기본 구조이고, 키값과 값의 자료형을 적어주어야 한다. (당연히 래퍼 클래스로)
//		HashMap<K, V> map = new HashMap<>();
		
		HashMap<Integer, Character> map = new HashMap<>();
		
		// Set은 add, remove 등의 메소드가 있었지만 
		// put(key, value), get(key), remove(key), containsKey(key) 등의 메소드가 있다.
		
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(3, 'C');
		
		map.put(4, 'A');
		
		// Map의 키값은 중복이 될 수 없고, Value값은 중복이 가능하다.
		
		// 이미 있는 Key값에 새 값을 넣으면 새 값으로 대체된다
		map.put(1, 'B');
		
		// Map에서 데이터 제거하기
		map.remove(1);
		
		// Map의 크기 확인
		System.out.println("map의 크기 : " + map.size());
		
		// Map에서 하나 꺼내기 (해당 키에 해당하는 값이 없으면 null을 반환)
		System.out.println("키값이 2인 값 : " + map.get(2));
		
		System.out.println(map);
	}
}
