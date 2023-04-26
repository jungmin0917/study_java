package ex4_charStream;

import java.io.FileWriter;
import java.io.IOException;

public class Ex3_FileWriter {
	public static void main(String[] args) {
		
		String path = "D:\\JAVA19_hjm\\fileWriter예제.txt";
		
		try {
			FileWriter fw = new FileWriter(path);
			
			fw.write("첫번째 줄 작성");
			fw.write("\n");
			fw.write("두번째 줄 작성");
			
			fw.flush();
			fw.close();
			
			System.out.println("파일 작성 완료");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
