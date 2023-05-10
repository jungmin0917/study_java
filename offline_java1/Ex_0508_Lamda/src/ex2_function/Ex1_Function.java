package ex2_function;

import java.util.ArrayList;

public class Ex1_Function {
	public static void main(String[] args) {
		
		// 컬렉션과 함수형 인터페이스 - List 관련
		ArrayList<Integer> list = new ArrayList<>();
		
		// list에 1부터 10까지 넣음
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		
		list.removeIf(x -> x % 2 == 0); // 짝수 지움
		
		System.out.println(list.toString());
		
	}
}
