package ex3_FileOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2_FileOutput {
	public static void main(String[] args) {
		
		String path = "D:\\JAVA19_hjm\\fileOut.txt";
//		String path = "D:\\JAVA19_hjm\\fileOut.html"; // 이렇게 html 파일로도 만들 수 있다
//		String path = "D:\\JAVA19_hjm\\fileOut.docx"; // 이렇게 docx로도 저장할 수 있지만 제대로 파일을 열 수 없을 수도 있다
		
		try {
//			FileOutputStream output = new FileOutputStream(path); // path만 넣으면 덮어쓰기를 하게 된다
			FileOutputStream output = new FileOutputStream(path, true); // append 옵션에 true를 주면 기존 파일내용 뒤에 붙이게 된다.
			
			output.write('F');
			output.write('I');
			output.write('L');
			output.write('E');
			
			String msg = "fileOutput 예제입니다.\n";
			String msg2 = "여러 줄도 가능";
			
			// String.getBytes(바이트 배열) 메소드로 문자열에서 바이트 배열로 변환할 수 있음
			output.write(msg.getBytes());
			output.write(msg2.getBytes());

			output.flush();
			output.close();
			
			System.out.println("파일 쓰기 완료");
			
		} catch (FileNotFoundException e) { // 파일이 없을 경우 대비
			e.printStackTrace();
		} catch (IOException e) { // 입출력 에러
			e.printStackTrace();
		}
		
	}
}
