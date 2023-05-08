package ex3_chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer extends Thread{

	ServerSocket ss; // 서버 소켓
	ArrayList<CopyClient> list; // 복사본 클라이언트를 담을 리스트를 준비
	
	public ChatServer() {
		try {
			
			list = new ArrayList<>(); // 리스트 생성
			
			ss = new ServerSocket(3200); // 3200번 포트
			
			// 서버 소켓을 생성함으로써 서버의 기능을 한다
			
			System.out.println("서버 시작");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		// start() 하면 Thread 객체가 하는 일
		
		while (true) {
			try {
				Socket s = ss.accept(); // 클라이언트로부터의 연결을 받아들이고 Socket 객체로 리턴함

				String ip = s.getInetAddress().getHostAddress(); // 접속자 IP 정보
				System.out.println(ip + "님 접속");

				// 클라이언트와 연결이 됐으면 리스트에 추가
				CopyClient cc = new CopyClient(s, this);
				list.add(cc);
				
				cc.start(); // 클라이언트 복사본의 스레드를 구동

			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}
	
	// 접속자들에게 메시지를 보내기 위한 메소드
	public void sendMessage(String msg) {
		// 접속자들의 정보는 CopyClient로 받아서 ArrayList에 저장해두었다.
		
		try {
			// 모든 접속자들의 객체를 순회하면서 출력함 (전송함) 
			for(CopyClient cc : list) {
				cc.out.println(msg); // 서버의 접속자들에게 메세지를 전달
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 나가면 해당 클라이언트를 list에서 지우는 메소드
	public void removeClient(CopyClient cc) {
		list.remove(cc); // 인자로 전달된 CopyClient 객체를 ArrayList에서 삭제
		sendMessage("----" + cc.ip + "님 퇴장----");
	}
	
	public static void main(String[] args) {
		new ChatServer().start(); // 서버 시작
	}
}










