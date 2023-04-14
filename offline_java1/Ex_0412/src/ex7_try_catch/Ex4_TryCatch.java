package ex7_try_catch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex4_TryCatch {
	public static void main(String[] args) {
		
//		정수 : 100
//		결과 : 100
		
//		정수 : aab
//		aab은(는) 정수가 아닙니다
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {

			System.out.print("정수를 입력해주세요 : ");
			
			String input = br.readLine();			
			
			// 여기서 미리 throw해야 할 듯
			
			Pattern pattern = Pattern.compile("[^0-9]");
			Matcher matcher = pattern.matcher(input);
			
			if(matcher.find()) {
				throw new Exception(String.format("%s은(는) 정수가 아닙니다", input));
			}
			
			bw.write(String.format("정수 : %d\n", Integer.parseInt(input)));
			
		}catch (NumberFormatException e) {
			System.out.println("정수만 입력해주세요");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				bw.flush();
				bw.close();
			} catch (IOException e) {
				System.out.println("입출력 오류입니다");
			}
		}
	}
}








