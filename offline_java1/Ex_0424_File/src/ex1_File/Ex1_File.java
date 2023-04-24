package ex1_File;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		// IO (Input, Output) : 입출력 스트림
		// 스트림이란, 데이터를 입출력하기 위한 통로
		
		// File 객체를 생성할 경로
		String path = "D:\\JAVA19_hjm\\test.txt"; // 파일 경로를 절대경로로 지정함
		// 역슬래시로 사용할 경우 두 개 쓰고, 슬래시로 사용할 경우 1개 쓰면 됨
		
		// 준비된 경로로 File 객체 생성
		File file = new File(path);
		
		// File 클래스가 생성되면서 path 경로까지 스트림을 생성
		
		// isFile() : 파일 클래스가 접근한 최종 목적지가 파일 형식일 경우 true, 아니면 false
		// false라고 해서 전부 디렉토리는 아님. 심볼릭 링크, 소켓, FIFO 파이프 등 다른 유형일 수도 있음.
		if(file.isFile()) {
			System.out.println("파일입니다");
			
			// length() : 파일의 크기를 바이트 단위로 반환함
			// ANSI 파일 기준 한글은 1글자 2바이트, 영어는 1글자 1바이트이다.
			// UTF-8 파일 기준 한글은 1글자 3바이트, 영어는 1글자 1바이트이다.
			System.out.println(file.length());
			
			// UTF-8 파일과 ANSI 인코딩처럼 각기 다른 인코딩으로 된 파일은 내용이 같더라도 크기가 다를 수 있음
		}else {
			System.out.println("파일이 아닙니다");
		}
		
	}
}
