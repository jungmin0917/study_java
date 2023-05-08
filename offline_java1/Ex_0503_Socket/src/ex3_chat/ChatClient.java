package ex3_chat;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// JFrame을 상속하므로 ChatClient 클래스가 하나의 프레임이 됨
public class ChatClient extends JFrame implements Runnable{
	
	// 이번엔 채팅방 화면을 구현해보자
	// 클라이언트에서 값을 보내고 받는 걸 쉽게 확인하기 위해 GUI를 통해 확인해보자
	
	JTextField input; // 메세지를 입력하는 공간
	JButton send_bt; // 입력한 메세지를 전송하는 버튼
	JTextArea area; // 메세지를 화면에 출력하는 공간
	JPanel south_p; // 위의 요소들을 붙일 패널
	
	// 서버 접속을 위한 객체
	Socket s;
	
	// 클라이언트도 채팅 내역을 봐야 하므로 BufferedReader가 필요함
	BufferedReader br; // 읽기
	PrintWriter out; // 쓰기
	Thread t;

	public ChatClient() { // 생성자
		area = new JTextArea(); // 채팅이 보일 공간
		this.add(area); // 프레임에 JTextArea 추가
		
		// BorderLayout 배치 관리자로 지정된 JPanel 생성
		// BorderLayout : 동서남북으로 배치
		south_p = new JPanel(new BorderLayout());
		south_p.add(input = new JTextField()); // 메세지 입력 필드
		south_p.add(send_bt = new JButton("보내기"), BorderLayout.EAST); // 텍스트를 왼쪽에, 버튼을 오른쪽에 배치
		
		this.add(south_p, BorderLayout.SOUTH); // 입력 텍스트와 버튼을 프레임 아래에 배치

		// 윈도우 창에 대한 이벤트 처리 (기본 버튼인 최소화, 최대화, 닫기 등)
		this.addWindowListener(new WindowAdapter() {
			
			// 우상단 X 버튼을 눌렀을 때
			@Override
			public void windowClosing(WindowEvent e) {
				out.println("xx:~X"); // 종료 시 xx:~X라는 메세지를 전달
				// 해당 메세지가 뜨면 접속을 종료시킬 예정임
			}
			
		});
		
		// 보내기 버튼을 눌렀을 때에 대한 이벤트 처리
		send_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sendData(); // 서버로 메세지를 전달하기 위한 메소드
			}
		});
		
		// 프레임 영역 지정
		this.setBounds(100, 100, 400, 500);
		this.setVisible(true);
		
		connect(); // 서버에 접속을 하기 위한 커스텀 메소드
		
		// 서버로부터 전달되는 메세지를 감지하여 받는 스레드 생성 (다른 유저가 서버에 보낸 것도 계속 감지해서 받아야 하므로)
		t = new Thread(this); 
		t.start(); // 쓰레드 시작
		
	} // 생성자

	// 서버 접속 메소드
	public void connect() {
		try {
			s = new Socket("192.168.1.101", 3200);
			
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			out = new PrintWriter(s.getOutputStream(), true); // PrintWriter 버퍼를 자동으로 flush하는 옵션 켰음
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 프로그램 실행 여부와 관계 없이 단독으로 돌아감
	@Override
	public void run() {
		// 서버로부터 전달되는 메세지를 기다렸다가 메세지가 도착하면 화면에 출력함
		
		while(true) { // 계속 감지함
			try {
				String msg = br.readLine(); // 대기 상태
				if(msg.equals("xx:~X")) { // 사용자가 xx:~X를 치면 반복문 빠져나옴
					break;
				}
				
				if(msg != null) {
					area.append(msg + "\r\n"); // 개행 포함하여 area에 메세지 추가
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		close(); // 열려있는 스트림을 닫는 커스텀 메소드
		System.exit(0); // 현재 실행 중인 자바 프로그램을 종료하는 메소드
		
	} // run
	
	// 서버에 메세지 전달하는 메소드
	public void sendData() {
		String msg = input.getText().trim(); // 서버에 보낼 메시지를 JTextField에서 가져옴
		
		if(msg.length() > 0) {
			// 한 글자라도 입력하면 전송
			out.println(msg);
		}
		
		input.setText("");
	}
	
	// 열려있는 스트림 있으면 닫는 메소드
	public void close() {
		try {
			if(out != null) {
				out.close();
			}
			
			if(br != null) {
				br.close();
			}
			
			if(s != null) {
				s.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ChatClient();
	}
	
}















