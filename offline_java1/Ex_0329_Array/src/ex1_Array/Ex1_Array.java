package ex1_Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex1_Array {
	public static void main(String[] args) {
		
//		Array (배열) : 같은 자료형의 데이터들을 모아놓은 객체
//		데이터의 효율적인 관리를 위해 반드시 필요하다.
//		근데 ArrayList가 더 좋음
		
//		int[] arr; // 선언
		
//		int[] arr = new int[5]; // 크기와 함께 선언 (일반적으로 인덱스 0번부터 채워짐)
//		int[] arr = new int[] {1, 2, 3, 4, 5}; // 할당과 함께 선언
		
//		각각의 방에 데이터 넣기
//		배열명[인덱스] = 데이터;
		
//		하나씩 넣어보기
//		int[] arr = new int[5];
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		
//		배열의 초기화와 동시에 넣을 수도 있다
		int[] arr = {10, 20, 30, 40, 50}; // 배열 초기화와 동시에 넣어주기
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//		당연하지만, 마지막 인덱스 번호는 길이 - 1이다
		
//		System.out.println(Arrays.toString(arr)); // 배열 한 번에 출력하기
		
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			list.add((i+1) * 10);
		}

		
		
		
	}
}
