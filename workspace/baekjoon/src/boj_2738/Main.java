package boj_2738;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 관련
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력 관련
		
		String input = br.readLine(); // 입력용으로 사용할 것임

		StringTokenizer st = new StringTokenizer(input);
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] a_arr = new int[n][m];
		int[][] b_arr = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			input = br.readLine();
			String[] str = input.split(" ");
			
			for (int j = 0; j < str.length; j++) {
				a_arr[i][j] = Integer.parseInt(str[j]);
			}
		}

		for (int i = 0; i < n; i++) {
			input = br.readLine();
			String[] str = input.split(" ");
			
			for (int j = 0; j < str.length; j++) {
				b_arr[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int sum = a_arr[i][j] + b_arr[i][j];
				bw.write(sum + " ");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}
}