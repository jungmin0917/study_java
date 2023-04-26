package ex2_FileInput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex5_BufferedInputEx {
	public static void main(String[] args) {
		
		// 앞서 FileInputStream을 써봤다.
		// BufferedInputStream이 따로 있다.
		
		// 스트림에 파일을 읽어올 때 버퍼 공간을 만들어서,
		// 해당 버퍼가 찰 때마다 버퍼를 비우면서 읽는 것이다.
		// 버퍼 크기는 스트림 생성 시 설정이 가능하며, 일반적으로 파일을 한 번에 읽어오는 것보다 빠르다.
		// 메모리도 적게 사용한다.
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		byte _byte[] = new byte[100];
		byte result[] = new byte[100];
		
		try {
			System.out.println("경로 입력 : ");
			System.in.read(_byte); // 바이트 배열로 입력을 저장함
			
			String path = new String(_byte).trim(); // 바이트 배열을 String으로 변환하여 저장함
			
			fis = new FileInputStream(path);
			bis = new BufferedInputStream(fis); // BufferedInputStream의 매개변수로는 InputStream이 필요하다
			
			bis.read(result); // 파일로부터 읽어 바이트 배열에 저장한다

			String res = new String(result); // 바이트 배열을 String으로 변환한다
		
			System.out.println(res);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 체크하는 이유는, 이미 닫겼는데 또 닫으면 안되니까
				if(bis != null) { // 아직 닫히지 않았다면
					bis.close();
				}
				if(fis != null) { // 아직 닫히지 않았다면
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}





