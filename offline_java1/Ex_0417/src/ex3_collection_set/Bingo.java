package ex3_collection_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;

public class Bingo {
	public static void main(String[] args) {
		
		// 5 X 5 ������ �����
		// HashSet �̿�
	
		// 1 ~ 50 ������ ���� �� 25���� �̾Ƽ� �������� ��ġ ��Ƽ� 5x5�� ���̰� �ϱ�
		
		HashSet<Integer> set = new HashSet<>();
		
		int[][] board = new int[5][5];
		
		Random rand = new Random();
		
		while(set.size() < 25) {
			set.add(rand.nextInt(1, 50));
		}
		
		// Set ������ Ư�� ������ ������ �Ұ�. ���������� ���������� Iterator ��ü�� ����ؾ� ��.
		Iterator<Integer> iter = set.iterator();
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {				
				board[i][j] = iter.next();
				System.out.printf("%02d ", board[i][j]);
			}
			System.out.println();
		}
		
		// �ٸ� ���� ������δ� set �������� �ؽ� ������ �־ Iterator.next()�� ������ ������ιۿ� ������ �ʰ� �ȴ�.
		
	}
}







