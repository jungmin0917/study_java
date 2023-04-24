package ex1_File;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		String path = "D:\\JAVA19_hjm";
		// 최종 목적지가 디렉터리라면, 하위 목록들의 이름을 가져올 수도 있음.
		
		File file = new File(path);
		
		// isDirectory() : 파일 클래스가 접근한 최종 목적지가 디렉토리 형식일 경우 true, 아니면 false
		if(file.isDirectory()) {
			// list() : 해당 파일이나 디렉토리에 포함된 파일 및 디렉토리의 이름을 문자열 배열로 반환함 
			// 만약 해당 파일이나 디렉토리가 없을 경우, NullPointerException이 발생됨.
			String[] names = file.list();
			
			for (String name : names) {
				System.out.println(name);
			}
			
		}
	}
}
