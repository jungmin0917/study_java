package ex2_FileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex2_FileInputStream {
	public static void main(String[] args) {

		String path = "D:\\JAVA19_hjm\\test.txt";
		
		File file = new File(path);
		
		// 파일을 사람이 읽을 수 있는 문자로 인코딩하려면 바이트 배열이 필요하다
//		byte[] byteArr = new byte[1000]; 
		// file.length()를 방의 크기로 넣을 수 있다
		// 다만, 반환값이 Long이기 때문에 int로 변환해서 넣어야 한다.
		byte[] byteArr = new byte[(int)file.length()];
		
		if(file.exists()) {
			try {
				FileInputStream input = new FileInputStream(file);
				
				input.read(byteArr); // 한 번에 읽어서 바이트 배열에 넣어준다.
				
				String str = new String(byteArr);
				
				System.out.println(str);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
