package day13;

import java.util.Random;

public class CardTest {
	public static void main(String[] args) {
		
		// 카드 배열부터 만든다
		String card[] = new String[52];
		char symbol[] = {'♠', '◇', '♥', '♧'};
		
		String number[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		for (int i = 0; i < card.length; i++) {
			int j = i / 13;
			card[i] = symbol[j] + number[i % 13]; // 0부터 51까지
		}
		
		for (int i = 0; i < card.length; i++) {
			System.out.printf("%2s ", card[i]); // 여기서 %2s는 최소 2글자로 하겠다는 거지, 2글자로 통일하겠다는 게 아님
			if((i + 1) % 13 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("===========Before Rand===========");
		
		Random rand = new Random();
		
		for (int i = 0; i < 100; i++) {
			int r = rand.nextInt(card.length);
			swap(card, 0, r);
		}
		
		for (int i = 0; i < card.length; i++) {
			System.out.printf("%2s ", card[i]);
			if((i + 1) % 13 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("===========After Rand===========");
	}
	
	public static void swap(String[] arr, int a, int b) {
		String temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
