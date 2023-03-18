package day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MagicSquareTest {
	public static void main(String[] args) throws IOException{
		
		// 마방진 : 가로, 세로, 대각선으로 더해도 값이 같은 것
		// 마방진 놓는 원리 : 해당 수가 3의 배수이면 아래로, 아니면 오른쪽 위로 가면 됨
		// 1은 무조건 첫번째 줄 가운데에 와야 한다
		
		// 그럼 홀수여야만 될 듯? (n, m이)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()); // n행 n열
		
		int[][] arr = new int[n][n];
		// n은 홀수만
		
		int limit = n * n;
		int count = 1;
		
		int i = 0;
		int j = n / 2; // 초기값
		arr[0][j] = 1;
		
		while(true) {
			if(count >= limit) {
				break;
			}
			
			if(count % n == 0) { // n의 배수이면 아래로
				int temp_i = i + 1;
				int temp_j = j;
				
				if(temp_i >= n) {
					i = 0;
				}else {
					i = temp_i;
				}
				
				count++;
				arr[i][j] = count;
			}else { // 아니면 오른쪽 위로
				int temp_i = i - 1;
				int temp_j = j + 1;
				
				if(temp_i < 0) {
					i = n - 1;
				}else {
					i = temp_i;
				}
				
				if(temp_j >= n) {
					j = 0;
				}else {
					j = temp_j;
				}

				count++;
				arr[i][j] = count;
			}
		}
		
		for (int k = 0; k < n; k++) {
			for (int l = 0; l < n; l++) {
				String str = String.format(" %2d ", arr[k][l]);
				bw.write(str);
			}
			
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}
}
