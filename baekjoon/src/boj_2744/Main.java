package boj_2744;

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
		
		// 아스키 코드 값으로 해결해도 되는데 그냥 메소드로 하겠음
		char c;
		
		String result = "";
		
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			
			if(Character.isUpperCase(c)) {
				c = Character.toLowerCase(c);
			}else {
				c = Character.toUpperCase(c);
			}

			result += c;
		}
		
		bw.write(result);
		
		bw.flush();
		bw.close();
	}
}