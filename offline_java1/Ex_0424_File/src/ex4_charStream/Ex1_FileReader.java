package ex4_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex1_FileReader {
	public static void main(String[] args) {
		
		// char 기반의 스트림은 Reader, Writer의 자식 클래스들을 사용
		// 기본적으로 2byte를 지원하기 때문에 2byte 언어로 구성된 파일도 쉽게 입출력이 가능하다
		// 기존의 바이트 기반 스트림은 1바이트씩이어서 불편한 점이 있었다.
		
		String path = "D:\\JAVA19_hjm\\test.txt";
		
		try {
			FileReader fr = new FileReader(path);
			
			int code = 0;
			
			// FileReader.read()도 파일 끝에 도달하면 -1을 반환함
			while((code = fr.read()) != -1) { // char 하나를 읽어서 저장한다
				System.out.print((char)code); // 2바이트 단위로 저장되기에 웬만한 언어는 깨지지 않음
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
