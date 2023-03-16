package boj_9086;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 관련
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력 관련

		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < 3; i++) {
			String str = br.readLine();
			
			String res = str.charAt(0) + "" + str.charAt(str.length() - 1);
			
			bw.write(res + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}