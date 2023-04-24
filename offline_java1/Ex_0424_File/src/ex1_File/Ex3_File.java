package ex1_File;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
		
		String path = "D:\\JAVA19_hjm\\aaa\\bbb";
		
		File file = new File(path);
		
		// exists() : 해당 위치에 파일이나 디렉터리 존재하는지 여부
		if(!file.exists()) {
			// mkdir(), mkdirs() 해당 위치에 디렉터리 만드는 메소드
			// 해당 위치를 만드는 데에 필요한 디렉터리가 두 개 이상이면 mkdirs()를 사용해야 한다
			// mkdir()은 하나만 생성 가능
			file.mkdir();
			System.out.println("폴더 생성!");
			
			// 해당 위치를 만드는 데에 두 개 이상의 디렉터리가 필요할 때 mkdir() 메소드를 사용하면 아예 생성이 안 됨
		}
	}
}