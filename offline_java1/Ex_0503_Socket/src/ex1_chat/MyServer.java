package ex1_chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// 쓰레드 클래스 상속받아야 함
public class MyServer extends Thread{
	
	// 자바에서는 java.net 패키지에서 소켓 프로그래밍을 위한 클래스들을 제공하고 있다.
	ServerSocket ss;
	
	public MyServer() {
		try {
			// 서버 소켓 생성 시 포트 번호를 지정한다.
			// 포트는 클라이언트가 접속할 때 필요하다.
			ss = new ServerSocket(3000); // 서버 준비 완료
			System.out.println("서버 준비 완료");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 쓰레드를 상속받은 이유는 
	@Override
	public void run() {
		// 무한 반복 속에서 항상 접속자들을 받을 준비를 해야 한다.
		while(true) {
			try {
				Socket s = ss.accept(); // 각 접속자의 정보가 Socket에 담김
				
				// 위에서 지정한 포트로 접속한 클라이언트의 IP 주소를 가져온다.
				String ip = s.getInetAddress().getHostAddress();
				
				System.out.println(ip + "님 왔다 감");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		MyServer ms = new MyServer();
		ms.start(); // 해당 클래스 내의 run() 메소드 호출
	}
	
}
