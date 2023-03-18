package day19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ZigzagTest1 {
	public static void main(String[] args) throws IOException{
//		2차원 배열 만드는 법
//		자료형[][] 배열명 = new 자료형[행 크기][열 크기];
//		
//		내 맘대로 풀었음 (고차원적)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("input the row and column : ");
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m]; // n행 m열
		
		String result = "";
		
		int num;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if(i % 2 == 1) {
					num = (i - 1) * m + j;
				}else {
					num = (i - 1) * m + (m - j + 1);
				}
				
				String format = String.format(" %2d ", num);
				bw.write(format);
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}
}
