package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 관련
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력 관련

		String[] array = br.readLine().split(" ");
		long[] nums = new long[array.length];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Long.parseLong(array[i]);
		}
		
		bw.write(Arrays.stream(nums).sum()+"");
		
		bw.flush(); // 버퍼를 비워 출력을 실제로 한다
		bw.close(); // 버퍼를 닫는다
	
	}
}