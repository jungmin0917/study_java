package ex1_single_for;

import java.util.stream.IntStream;

public class Ex1_single_for {
	public static void main(String[] args) {
		
		// 반복문
		// 특정 명령을 원하는 만큼 반복 실행하는 제어문
		// for, while
		
		// 기본형
		
//		for(초기식; 조건식; 증감식) {
//			조건식이 참일 때 반복할 명령 
//		}
		
		// 초기식 : 반복을 하기 위한 시작값
		// 초기식에 사용할 변수를 하나 초기화한다.
		// 조건식 : 반복을 하기 위한 종료값. 비교연산자를 많이 사용한다.
		// 증감식 : 변수의 값을 증감시켜주는 역할을 한다. 증감연산자를 많이 사용한다.
		
//		for(int i=0; i<3; i++) {
//			System.out.println(i);
//		}
		
		// 1 ~ 10까지 콘솔에 출력
		
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
		
		// 아래는 람다식을 이용한 코드이다
//		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		// IntStream
		
		// Stream API를 쓰는 이유는, 가독성과 유지 보수성, 병렬 처리가 가능해서 성능 향상이 가능하다.
		
		// Stream은 iterable한 데이터 자료구조 (컬렉션, 배열 등)의 자료들을 함수형 프로그래밍으로 처리하는 기능을 제공한다
		// 그 중 IntStream은 int형의 자료들을 Stream으로 처리할 수 있다

//		for (int i = 10; i > 0; i--) {
//			System.out.println(i);
//		}
		
//		IntStream.rangeClosed(1, 10).forEach(num -> {
//			if(num % 3 == 0) {
//				System.out.println(num);
//			}
//		});
		
		// 아래와 같이는 안 된다. 람다식 안에서는 람다식 밖의 변수를 읽을 수는 있지만, 변경하는 것은 불가능하다.
//		String res = "";
//		IntStream.rangeClosed(1, 10).forEach(v -> {
//			res += v % 3 == 0?v+"":"";
//		});
		
//		IntStream.rangeClosed(1, 20).forEach(v -> {
//			if(v % 2 == 1) {
//				System.out.println(v);
//			}
//		});
		
		// 1 ~ 10까지 총합 구하기
//		int n = 10;
//		System.out.println((n * (n+1)) / 2);
//		
//		int sum = 0;
//		
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		
//		System.out.println(sum);
		
		int n = 4;
		
		IntStream.rangeClosed(1, 9).forEach(v -> {
			System.out.println(String.format("%d * %d = %d", n, v, n * v));
		});
		
		
	}
}
