package day09;

import java.util.Arrays;
import java.util.Random;

public class CountTest {
	public static void main(String[] args) {
		
		// 주사위를 10번 굴리기
		
		Random random = new Random();
		
		int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;
//		배열이란, 같은 이름으로 여러 개의 기억장소를 만들어 사용할 경우 쓴다
//		배열을 선언하면 기본값이 숫자는 0, 문자는 공백, boolean은 false, 클래스로 만든 배열은 null로 자동으로 초기화 된다
//		인덱스는 당연히 0부터 시작이다
//		자료형[] 배열명 = new 자료형[배열의 크기]; // 1차원 배열
//		자료형[][] 배열명 = new 자료형[배열의 크기][배열의 크기]; // 2차원 배열
		
		int[] count = new int[6];
		
		for (int i = 0; i < 10; i++) {
			int r = random.nextInt(6);
			
			count[r]++;
		}
		
//		for (int i = 0; i < 10; i++) {
//			int r = random.nextInt(6) + 1; // 항상 0부터 나옴에 주의
//			
//			switch(r) {
//				case 1:
//					n1++;
//					break;
//				case 2:
//					n2++;
//					break;
//				case 3:
//					n3++;
//					break;
//				case 4:
//					n4++;
//					break;
//				case 5:
//					n5++;
//					break;
//				case 6:
//					n6++;
//					break;
//				default:
//					break;
//			}
//		}
//		System.out.printf("%d %d %d %d %d %d", n1, n2, n3, n4, n5, n6);

//		System.out.println(Arrays.toString(count)); // Arrays.toString() 메소드로 array를 한 번에 출력
		
//		아래와 같이 배열을 쓰면 더욱 간단하게 표현할 수 있다
		for (int i = 0; i < count.length; i++) {
			System.out.printf("count of %d : %d\n", i+1, count[i]);
		}
	}
}
