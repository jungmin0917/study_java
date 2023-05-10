package ex2_function;

import java.util.function.Function;

public class Ex4_Function {
	
	public static void main(String[] args) {
		// Function의 합성
		
		// String을 16진수로 바꿔줌
											// Integer.parseInt(값, 진수);
		Function<String, Integer> f = s -> Integer.parseInt(s, 16);
		
		// 16진수를 이진수로 바꿔줌
											// 이진수로 값을 바꿔줌
		Function<Integer, String> g = i -> Integer.toBinaryString(i);
		
		// f.andThen(g) : f 함수를 먼저 적용하고 그 다음에 g를 적용한다
		Function<String, String> h = f.andThen(g);
		
		// f.compose(g) : g 함수를 먼저 적용하고 그 다음에 f를 적용한다
		Function<Integer, Integer> h2 = f.compose(g);
		
		System.out.println(h.apply("FF")); // FF -> 255 -> 11111111
		System.out.println(h2.apply(2)); // 2 -> 10 -> 16
	}

}
