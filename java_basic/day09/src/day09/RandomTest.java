package day09;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
//		System.out.println(Math.random()); // 0.0 ~ 1.0 사이의 무작위 double 값을 반환함
		
//		Math -> 수학 연산 내장 클래스
		
//		아래와 같은 메소드들이 있다.
//		abs(): 절댓값을 반환합니다.
//		ceil(): 인수보다 크거나 같은 가장 작은 정수를 반환합니다.
//		floor(): 인수보다 작거나 같은 가장 큰 정수를 반환합니다.
//		round(): 인수를 반올림한 정수를 반환합니다.
//		max(): 두 인수 중 큰 값을 반환합니다.
//		min(): 두 인수 중 작은 값을 반환합니다.
//		pow(): 첫 번째 인수를 두 번째 인수만큼 거듭제곱한 값을 반환합니다.
//		sqrt(): 인수의 제곱근을 반환합니다.
//		random(): 0.0에서 1.0 사이의 무작위 double 값을 반환합니다.
		
		// 주사위 굴리기
//		for (int i = 0; i < 10; i++) {
//			System.out.println((int)(Math.random() * 6) + 1);
//		}
		
//		최근 자바 버전부터는 Random이라는 클래스가 아예 생겨버렸다.
		Random random = new Random();
		
//		메서드로는 nextInt(), nextDouble() 등등이 있다.
		
//		nextDouble은 기존 Math.random과 비슷하고, nextInt에 매개변수 (최대값)을 정해주면 0에서 (해당 값-1)까지 나온다
		for (int i = 0; i < 6; i++) {
			System.out.println(random.nextInt(45) + 1);
		}
		
		
	}
}
