package ex2_function;

import java.util.HashMap;

public class Ex2_Function {
	public static void main(String[] args) {
		
		// 컬렉션과 함수형 인터페이스 - Map 관련
		
		HashMap<String, String> map = new HashMap<>();
		
		for (int i = 1; i <= 10; i++) {
			map.put("id" + i, "이름" + i);
		}
		
		// map은 순서가 보장되지 않는다.
		
		map.forEach((key, value) -> {
			
			// Map.compute() : Map에 들어있는 요소의 value값을 수정할 때 사용
			map.compute(key, (k, v) -> v + "**");
			
		});
		
		map.forEach((key, value) -> {
			System.out.printf("key = %s, value = %s\n", key, value);
		});
		
	}

}
