package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		BigInteger a = new BigInteger(br.readLine());
		BigInteger b = new BigInteger(br.readLine());
		
		BigInteger total = a.multiply(BigInteger.valueOf(8)).add(b.multiply(BigInteger.valueOf(3)));
		BigInteger res = total.subtract(BigInteger.valueOf(28));
		
		bw.write(res + "");
		
		bw.flush();
		bw.close();
	}
}