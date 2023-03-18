package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();
		
		String[] inputs = input.split(" ");
		int[] array = new int[inputs.length];
		
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			sum += Integer.parseInt(inputs[i]);
		}
		
		int res = sum * 5;
		
		bw.write(res + "");
		
		bw.flush();
		bw.close();
	}
}