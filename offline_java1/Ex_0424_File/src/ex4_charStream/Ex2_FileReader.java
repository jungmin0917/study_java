package ex4_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex2_FileReader {
	public static void main(String[] args) {
		
		// test.txt 내용을 읽어서
		// 내용에 알파벳 대문자와 소문자 개수를 출력하기
		
		// 대문자 : X개
		// 소문자 : X개
		
		// 한글과 특수문자는 세지 않음
		
		String path = "D:\\JAVA19_hjm\\test.txt";
		
		int lower = 0;
		int upper = 0;
		
		try {
			FileReader fr = new FileReader(path);
			
			int input = 0;
			
			while((input = fr.read()) != -1) {
				if(input >= 65 && input <= 90) {
					upper++;
				}else if(input >= 97 && input <= 122) {
					lower++;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.printf(String.format("대문자 : %d개\n소문자 : %d개", upper, lower));
	}
}
