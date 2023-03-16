package boj_1271;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 관련
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력 관련
		
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		
		BigInteger a = new BigInteger(st.nextToken());
		BigInteger b = new BigInteger(st.nextToken());
		
		BigInteger[] result = a.divideAndRemainder(b);
		
		System.out.println(result[0]);
		System.out.println(result[1]);
		
		bw.flush();
		bw.close();
	}
}