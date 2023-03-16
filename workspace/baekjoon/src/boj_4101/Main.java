package boj_4101;

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
		
		String res;
		
		while(true) {
			String input = br.readLine();
			
//			if(input == "0 0") { // 주의!!! 문자열 비교는 비교 연산자로 하면 안 됨!!
			if(input.equals("0 0")) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(input);
			
			// 여기서 parse는 파싱이라고도 하는, 구문 분석을 의미한다. 명령어를 해석하기 위해 문자열 데이터를 분석하여 프로그래밍 언어의 문법에 따라 구문을 분해해야 함.
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a > b) {
				res = "Yes\n";
			}else {
				res = "No\n";
			}
			
			bw.write(res);
		}
		
		bw.flush(); // 버퍼를 비워 출력을 실제로 한다
		bw.close(); // 버퍼를 닫는다
	
	}
}