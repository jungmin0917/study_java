package ex2_FileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1_FileInputStream {
	public static void main(String[] args) {
		// 파일 안의 내용을 읽어오기 위해서는, Stream 인터페이스의 FileInputStream 클래스를 사용해야 한다
		
		// ...Stream : 바이트 기반의 스트림이며, 항상 1byte씩 읽어온다.
		// ...Reader, ...Writer : Char 기반의 스트림이며 항상 2byte씩 읽어온다.		
		
		String path = "D:\\JAVA19_hjm\\test.txt";
		
		File file = new File(path);
		
		if(file.exists()) { // 파일이 있을 때만 실행
			try {
				FileInputStream input = new FileInputStream(file); // 파일 객체(경로)를 매개변수로 담음
				
				int code = 0;
				
				// read() 메소드는, 한 번에 1byte씩 읽는다
				// 더 이상 읽을 내용이 없다면, 문장의 끝(End Of File; EOF)인 -1을 가져온다
				// 아스키코드, 유니코드에도 -1에 해당하는 글자가 없기 때문에 -1로 정했다.
				
				while((code = input.read()) != -1) { // 1바이트씩 읽고 code에 담음
					System.out.println(code);
				}
				
				input.close(); // 항상 스트림을 다 쓰면 닫아줘야 함 (안 닫으면 메모리에 상주해있음)
				
			} catch (FileNotFoundException e) { // 해당 파일이 없을 경우 FileNotFoundException 발생
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
