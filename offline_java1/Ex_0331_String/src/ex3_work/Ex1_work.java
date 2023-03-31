package ex3_work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1_work {
	public static void main(String[] args) {
//		키보드에서 알파벳을 무작위로 입력받는다
//		입력받은 문자열에 소문자 a가 몇 개 들어있는지 판별하는 코드를 작성하자.
		
//		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//			
//			System.out.println("알파벳 대소문자로 구성된 문자열을 입력해주세요");
//			String str = br.readLine();
//			
//			String patt = "[^A-Za-z]";
//			
//			Pattern pattern = Pattern.compile(patt);
//			Matcher matcher = pattern.matcher(str);
//			
//			if(matcher.find()) { // 알파벳을 제외한 문자가 있다면
//				throw new Exception("알파벳 대소문자만 입력해주세요");
//			}
//			
//			int count = 0;
//			
//			for (int i = 0; i < str.length(); i++) {
//				if(str.charAt(i) == 'a') {
//					count++;
//				}
//			}
//			
//			bw.write(String.format("입력한 문자열에서 a의 개수는 %d개입니다.", count));
//			
//			bw.flush();
//			bw.close();
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		
//		회문 구하기
//		문자열을 입력받아 회문인지 아닌지 판별하는 코드 작성
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			System.out.println("문자열을 아무거나 입력하세요");
			String str = br.readLine();
			
			StringBuilder sb = new StringBuilder(str);
			
			String rev = sb.reverse().toString();
			
			String res = "";
			
			if(str.equals(rev)) {
				res = "회문입니다";
			}else {
				res = "회문이 아닙니다";
			}
			
			bw.write(res);
			
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
