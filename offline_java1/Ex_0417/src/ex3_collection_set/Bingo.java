package ex3_collection_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;

public class Bingo {
	public static void main(String[] args) {
		
		// 5 X 5 빙고판 만들기
		// HashSet 이용
	
		// 1 ~ 50 까지의 숫자 중 25개를 뽑아서 랜덤으로 위치 잡아서 5x5로 보이게 하기
		
		HashSet<Integer> set = new HashSet<>();
		
		int[][] board = new int[5][5];
		
		Random rand = new Random();
		
		while(set.size() < 25) {
			set.add(rand.nextInt(1, 50));
		}
		
		// Set 구조는 특정 값으로 접근이 불가. 순차적으로 가져오려면 Iterator 객체를 사용해야 함.
		Iterator<Integer> iter = set.iterator();
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {				
				board[i][j] = iter.next();
				System.out.printf("%02d ", board[i][j]);
			}
			System.out.println();
		}
		
		// 다만 위의 방법으로는 set 내부적인 해시 순서가 있어서 Iterator.next()로 꺼내면 순서대로밖에 나오지 않게 된다.
		
	}
}







