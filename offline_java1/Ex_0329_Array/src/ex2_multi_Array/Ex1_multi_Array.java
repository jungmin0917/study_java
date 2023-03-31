package ex2_multi_Array;

import java.util.Arrays;

public class Ex1_multi_Array {
	public static void main(String[] args) {
		// 기존 Array에는 key값을 숫자밖에 못 씀
		// 키값에 다른 자료형 넣고 싶으면 해시맵 써야 함
		
		// 다차원 배열 : 2차원 이상의 배열을 의미
		// 2차원 배열은 1차원 배열을 요소로 가짐
		
//		1차원 배열
//		자료형[] 배열명 = new 자료형[길이]
		
//		2차원 배열
//		자료형[][] 배열명 = new 자료형[1차원 배열의 개수][각각의 1차원 배열의 요소의 개수]
//		
//		int[][] arr = new int[2][3];
//		
//		arr[0][0] = 100;
//		arr[0][1] = 200;
//		arr[0][2] = 300;
//		arr[1][0] = 400;
//		arr[1][1] = 500;
//		arr[1][2] = 600;
		
//		System.out.println(Arrays.deepToString(arr));

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.printf("arr[%d][%d] : %d, ", i, j, arr[i][j]);
//			}
//			System.out.println();
//		}
//		
//		char[][] ch = {{'A', 'B'},{'C', 'D', 'E'},{'F'}}; // 이런 식으로 1차원 배열의 길이가 전부 다를 수 있음
//		
//		System.out.println(Arrays.deepToString(ch));
		
//		아래와 같이 하위 차원 배열의 길이를 각각 지정해줄 수 있다.
//		int[][] num = new int[2][];
//		num[0] = new int[3];
//		num[1] = new int[2];
//		
//		int n = 0;
//		
//		for (int i = 0; i < num.length; i++) {
//			for (int j = 0; j < num[i].length; j++) {
//				System.out.println((num[i][j] = (n += 100)) + " ");
//			}
//		}
		
		// 배열 arr에 담긴 모든 값의 합과 평균을 구하는 프로그램 작성

		int arr[][] = new int[4][5];
		int n = 1;
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = n;
				n++;
				count++; // 전체 갯수 세기
			}
		}
		
		int sum = 0;
		double avg;
		
		for (int i = 0; i < arr.length; i++) {
			sum += Arrays.stream(arr[i]).sum();
		}
		
		avg = (double)sum / count;
		
		System.out.printf("총합 : %d, 평균 : %.2f", sum, avg);
		
	}
}
