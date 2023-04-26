package ex2_FileInput;

import java.io.IOException;
import java.util.Scanner;

public class Ex4_FileInput {
	public static void main(String[] args) {
		
		byte[] keyboard = new byte[100];
		
		// 키보드에서 값을 입력받기 위한 표준입력장치 스트림
//		try {
//			System.out.print("값: ");
//			
//			System.in.read(keyboard);
//			
//			String str = new String(keyboard).trim();
//			
//			System.out.println(str);
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		System.in을 이용해 표준 입력 스트림을 연다
		Scanner sc = new Scanner(System.in); // 표준 입력 스트림을 여는 것임
//		System.in은 static이기 때문에 메모리에 한 번만 올라가고 close로 닫게 되면 다른 클래스에서도 닫아진다.
//		그래서 한 번 닫으면 다른 곳에서 사용할 수 없기 때문에 함부로 닫지 않는다.
//		이건 JVM에서 자동으로 닫지 않는다고 한다.
		
	}
}
