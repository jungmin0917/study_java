package day20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SnailTest {
	public static void main(String[] args) throws IOException{
		
		// 달팽이 모양으로 증가하는 2차원 배열 만들기
		// 내가 먼저 풀어보기 (내가 더 잘 푼 듯?)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		System.out.print("input the n, m : ");
		
		String input = br.readLine();

		StringTokenizer st = new StringTokenizer(input);
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];

		int count = 1; // 이게 n * m이 될 때까지 하면 될 듯
		
		// 일단 오른쪽으로 가고, 끝까지 갔거나 이미 값이 있는 상태면 아래로.
		// 아래 방향으로 가고, 끝까지 갔거나 이미 값이 있는 상태면 왼쪽으로.
		// 왼쪽으로 가고, 끝까지 갔거나 이미 값이 있는 상태면 위쪽으로.
		// 위쪽으로 가고, 끝까지 갔거나 이미 값이 있는 상태면 오른쪽으로.
		// 다 채울 때까지 반복
		// 다 채웠는지의 여부는 count로 하면 될 듯
		
		// 방향은 배열로 미리 정해놓기
		int[] dx = {0, -1, 0, 1};
		int[] dy = {1, 0, -1, 0};
		
		// 왼쪽 상단을 1로 해서 시작한다

		int limit = n * m;
		
		// 0, 0에서 시작
		int i = 0;
		int j = 0;
		int d = 0; // 처음 방향은 0으로 시작, 어딘가에 닿을 때마다 1씩 올리고 4가 되면 다시 0으로 가기
		
		arr[0][0] = 1;
		
		while(true) {
			
			if(count >= n * m) {
				break;
			}
			
			int temp_i = i + dx[d];
			int temp_j = j + dy[d];
			
			if((temp_i < 0 || temp_i >= n) || (temp_j < 0 || temp_j >= m) || (arr[temp_i][temp_j] > 0)) { // 범위를 벗어났을 경우 또는 이미 값이 있을 경우
				d++; // 방향만 바꾸기
				if(d >= 4) {
					d = 0;
				}
			}else { // 범위 벗어나지도 않고 아직 값이 없을 경우
				i = temp_i;
				j = temp_j;
				
				count++;
				arr[i][j] = count;
			}
		}
		
		for (int k = 0; k < n; k++) {
			for (int l = 0; l < m; l++) {
				String str = String.format(" %2d ", arr[k][l]);
				bw.write(str);
			}

			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}
}
