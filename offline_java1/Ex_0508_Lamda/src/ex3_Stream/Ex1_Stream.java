package ex3_Stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex1_Stream {
	public static void main(String[] args) {
		
		String[] strArray = {"홍길동", "김자바", "박람다"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(item -> System.out.print(item + " "));
		
		System.out.println(); 
		
		int[] intArray = {1, 2, 3, 4, 5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		System.out.println("----------------");
		
		// 스트림의 연산
		// 중간연산 : 연산의 결과가 스트림, 스트림에 연속해서 연산을 할 수 있다.
		// 최종연산 : 연산의 결과가 스트림이 아닌 연산, 스트림의 요소를 소모하므로 단 한 번만 가능함
		
		int[] nums = {1, 44, 33, 21, 35, 44, 33, 2, 4, 2};
		
		// distinct() : 중복 제거
		Arrays.stream(nums).distinct().sorted().limit(5).forEach(System.out::println);
		// 위에서 limit은 몇 개까지만 가져올지이다.
	}
}
