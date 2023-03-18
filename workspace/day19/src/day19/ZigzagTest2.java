package day19;

public class ZigzagTest2 {
	public static void main(String[] args) {
		int[][] a = new int[4][5];
		
		int count = 0, start = 0, end = 4, sw = 1;
		
		for (int i = 0; i < 4; i++) {
			for (int j = start; j != end + sw; j += sw) {
				a[i][j] = ++count;
			}
			
			int temp = start;
			start = end;
			end = temp;
			sw *= -1;
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ", a[i][j]);
			}
			System.out.println();
		}
		
	}
}
