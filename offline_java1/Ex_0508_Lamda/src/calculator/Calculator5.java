package calculator;

import java.util.ArrayList;

public class Calculator5 {
	public static void main(String[] args) {
		
		// 컬렉션 프레임워크 (List, Set, Map)과 함수형 인터페이스
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("이름1");
		list.add("이름2");
		list.add("이름3");
		list.add("이름4");
		list.add("이름5");
		
		list.forEach(x -> System.out.println(x));
		
		list.forEach(System.out::println);
	}
}
