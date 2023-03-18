package day03;

import java.util.Scanner; // scanner 내장 클래스를 import 해야 함

public class ScannerTest1 {
	public static void main(String[] args) {
//		키보드를 통해서 데이터를 입력받는 Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		String addr = ""; // 문자열 String 객체 생성 (자바에서는 이렇게 해주어야 함)
		System.out.print("주소를 입력해주세요 : ");
		
		addr = sc.nextLine(); // 한 줄을 입력받아서 변수에 넣음
		
		String name = "";
		System.out.print("이름을 입력해주세요 : ");
		
		name = sc.nextLine();
		
//		System.out.println("주소 : " + addr + "\n이름 : " + name); // 여기서 +는 문자열 연결 연산자
		System.out.printf("주소 : %s, 이름 : %s", addr, name);
	
//		next() : 문자열을 입력받는다. 띄어쓰기 전까지 입력받는다.
//		nextLine() : 문자열을 입력받는다. 한 줄 전체를 입력받는다.
		
//		위와 같이 실행하는 경우, 주소에서 맨 앞의 단어를 빼면 키보드 버퍼에 들어가있어서 이름을 입력받지 않고 나머지 주소를 이름으로 입력받게 된다
		
//		nextLine() 메소드는 키보드 버퍼가 비어있을 경우 입력을 요구하며 대기한다. 키보드 버퍼가 비어있지 않으면 키보드 버퍼 전체의 내용을 읽어들인다
		
		
		sc.close(); // 입력을 다 받은 후엔 닫아줘야 함
		
	}
}
