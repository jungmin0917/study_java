package ex4_charStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4_ByteCharReader {
	public static void main(String[] args) {
		
		// byte 스트림과 char 스트림의 연결
		
		String path = "D:\\JAVA19_hjm\\work\\Ex_0424_File\\src\\ex2_FileInput\\Ex1_FileInputStream.java";
		
		File file = new File(path);
		
		try {
			FileInputStream fis = new FileInputStream(file); // 스트림을 연다
			
			// byte 기반의 스트림은 한 줄 단위 처리가 안 된다.
			// BufferedReader가 필요하다.
			
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			// InputStreamReader는 InputStream 객체를 매개변수로 받는다.
			
			String str;
			
			// BufferedReader.readLine() : 한 줄씩 버퍼로 읽어오는 메소드
			while((str = br.readLine()) != null) { // BufferedReader.readLine()은 파일이 끝나면 null을 반환함
				System.out.println(str);
			}
			
			// 열었던 순서의 반대로 닫는다
			if(br != null) {
				br.close();
			}
			
			if(fis != null) {
				fis.close();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
