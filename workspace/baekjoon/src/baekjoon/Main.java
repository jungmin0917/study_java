package baekjoon;

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

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int res = n - 1946;
		
		System.out.println(res);
		
		bw.flush();
		bw.close();
	}
}