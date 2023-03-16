package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StreamTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 관련
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력 관련
		
		String str = br.readLine();
		
		bw.write(str.length() + ""); // 문자열을 출력하는 메소드이므로 문자열로 변환해줘야 함
		
		bw.flush(); // 버퍼를 비워 출력을 실제로 한다
		bw.close(); // 버퍼를 닫는다
	
	}
}