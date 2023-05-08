package ex3_chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// 클라이언트 복사본 클래스

public class CopyClient extends Thread{
	Socket s; // ChatClient쪽 소켓
	BufferedReader br; // 읽기
	PrintWriter out; // 쓰기
	ChatServer server; // 서버쪽 클래스
	String ip;

	// 연결된 소켓과 채팅 서버 객체를 받아 출력 및 입력 스트림을 연다.
	public CopyClient(Socket s, ChatServer cs) {
		this.s = s;
		this.server = cs;
		
		try {
			out = new PrintWriter(s.getOutputStream(), true); // 클라이언트에서 서버로 데이터를 보내기 위한 출력 스트림을 생성. 이 출력 스트림은 PrintWriter 클래스를 사용하여 간단하게 문자열을 서버로 전송할 수 있도록 함
			br = new BufferedReader(new InputStreamReader(s.getInputStream())); // 클라이언트에서 서버로부터 데이터를 받기 위한 입력 스트림을 생성. 이 입력 스트림은 BufferedReader 클래스를 사용하여 간단하게 문자열을 서버로부터 읽어올 수 있도록 함
			
			ip = s.getInetAddress().getHostAddress();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				// 입력을 대기함
				String msg = br.readLine();
				
				// 입력을 받았는데 xx:~X이면 나간다
				if(msg.equals("xx:~X")) {
					out.println("xx:~X"); // 누군가 나감
					
					server.removeClient(this); // 현재 클라이언트를 list에서 제거함
					
					break;
				}
				
				if(msg != null) {
					server.sendMessage(ip + " : " + msg);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}







