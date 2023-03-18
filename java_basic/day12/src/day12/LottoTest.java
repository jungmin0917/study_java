package day12;

import java.util.Arrays;
import java.util.Random;

public class LottoTest {
	public static void main(String[] args) {
		
		// 추첨기 준비
		int[] lotto = new int[45]; // 1부터 45까지 들어갈 추첨기
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i+1;
		}

		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("%2d ", lotto[i]);
			if(i % 10 == 9) {
				System.out.println();
			}
		}
		
		System.out.println("\n============before rand============");
		
		// 추첨기의 공을 섞는다.
		// lotto[0]에 저장된 값과 lotto[1]~lotto[44] 사이의 랜덤한 위치의 값을 교환하는 식으로 한다
		
		Random rand = new Random();
		
		for (int i = 0; i < 1000000; i++) {
			int r = rand.nextInt(45);

			swap(lotto, 0, r);
		}
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("%2d ", lotto[i]);
			if(i % 10 == 9) {
				System.out.println();
			}
		}
		
		System.out.println("\n============after rand============");
	
		for (int i = 0; i < 6; i++) {
			System.out.println(lotto[i]);
			
			try {
				Thread.sleep(1000); // 괄호 안에 지정된 시간(1/1000초 단위)만큼 프로그램을 멈춘다.
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("bonus num %d\n", lotto[6]);
		System.out.println("\n============lotto num============");
	}
	
	public static void swap(int[] arr, int a, int b) { // 이 때 넘기는 배열은 참조변수 (참조값)을 넘긴다. 그러면 그 참조값을 실제로 바꾸므로, 결국 실제 값을 바꾸게 되는 것과 같다.
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
