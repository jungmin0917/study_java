package ex2_message;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
	public static void main(String[] args) throws IOException{
		// 프로그램 시작
		System.out.print("입력 : ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String msg = br.readLine();
		
		if(msg != null && msg.trim().length() > 0) {
			Socket s; // 소켓 객체를 만듦
			
			// 서버의 IP와 포트를 적음
			try {
				// MyServer 클래스에서 연 서버 접속
				s = new Socket("192.168.1.6", 3001);
				
				// 문자열을 서버로 보내기 위한 스트림 준비
				// PrintWriter : 형식이 지정된 개체의 표현을 텍스트 출력 스트림으로 인쇄함.
				PrintWriter out = new PrintWriter(s.getOutputStream());
				
				// 서버로 문자열 보내기
				out.write(msg);
				
				// 스트림 비우기
				out.flush();
				
				// 스트림 닫기
				if(out != null) {
					out.close();
				}
				
				// 소켓 닫기
				if(s != null) {
					s.close();
				}
				
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}











