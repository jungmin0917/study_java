package boj_2754;

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
		
		String str = br.readLine();
		
		double score = 0;
		
		if(str.length() == 1) {
			
		}else {
			char main = str.charAt(0);
			char sub = str.charAt(1);
			
			switch(main) {
				case 'A':
					score += 4;
					break;
				case 'B':
					score += 3;
					break;
				case 'C':
					score += 2;
					break;
				case 'D':
					score += 1;
					break;
				default:
					break;
			}
			
			switch(sub) {
				case '+':
					score += 0.3;
					break;
				case '0':
					break;
				case '-':
					score -= 0.3;
					break;
				default:
					break;
			}
		}
		
		String result = String.format("%.1f", score);
		
		bw.write(result);
		
		bw.flush();
		bw.close();
	}
}