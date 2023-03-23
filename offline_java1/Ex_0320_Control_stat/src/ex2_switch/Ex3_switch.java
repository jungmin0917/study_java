package ex2_switch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex3_switch {
	public static void main(String[] args) throws IOException{
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			System.out.print("원하는 달을 입력해주세요 : ");
			
			int n = Integer.parseInt(br.readLine());
			
			int m = 0;
			
			if(n < 1 || n > 12) {
				throw new Exception();
			}
			
			switch(n) {
				case 4:
				case 6:
				case 9:
				case 11:
					m = 30;
					break;
				case 2:
					m = 28;
					break;
				default:
					m = 31;
					break;
			}
			
			String str = String.format("해당 월은 %d일까지 있습니다", m);
			
			bw.write(str);
			
			bw.flush();
			bw.close();
			
		} catch (Exception e) {
			System.out.println("1 ~ 12 사이의 정수로 입력해주세요");
		}
	}
}
