package baekjoon;

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		String result = "";
		
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
		
//		sc.close();
		
		// BufferedReader, BufferedWriter를 사용하면 더욱 빠르게 입출력이 가능함
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); // 이거 쓰려면 exception handle을 해야 한다고 함

		for (int i = 1; i <= n; i++) {
			bw.write(i + "\n"); // 버퍼에 모아 둠
		}
		
		bw.flush(); // 버퍼에 모아둔 것을 출력함
        br.close();
        bw.close();
		
//		System.out.println(result);
	}
}