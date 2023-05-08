package ex3_chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer extends Thread{

	ServerSocket ss; // ���� ����
	ArrayList<CopyClient> list; // ���纻 Ŭ���̾�Ʈ�� ���� ����Ʈ�� �غ�
	
	public ChatServer() {
		try {
			
			list = new ArrayList<>(); // ����Ʈ ����
			
			ss = new ServerSocket(3200); // 3200�� ��Ʈ
			
			// ���� ������ ���������ν� ������ ����� �Ѵ�
			
			System.out.println("���� ����");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		// start() �ϸ� Thread ��ü�� �ϴ� ��
		
		while (true) {
			try {
				Socket s = ss.accept(); // Ŭ���̾�Ʈ�κ����� ������ �޾Ƶ��̰� Socket ��ü�� ������

				String ip = s.getInetAddress().getHostAddress(); // ������ IP ����
				System.out.println(ip + "�� ����");

				// Ŭ���̾�Ʈ�� ������ ������ ����Ʈ�� �߰�
				CopyClient cc = new CopyClient(s, this);
				list.add(cc);
				
				cc.start(); // Ŭ���̾�Ʈ ���纻�� �����带 ����

			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}
	
	// �����ڵ鿡�� �޽����� ������ ���� �޼ҵ�
	public void sendMessage(String msg) {
		// �����ڵ��� ������ CopyClient�� �޾Ƽ� ArrayList�� �����صξ���.
		
		try {
			// ��� �����ڵ��� ��ü�� ��ȸ�ϸ鼭 ����� (������) 
			for(CopyClient cc : list) {
				cc.out.println(msg); // ������ �����ڵ鿡�� �޼����� ����
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// ������ �ش� Ŭ���̾�Ʈ�� list���� ����� �޼ҵ�
	public void removeClient(CopyClient cc) {
		list.remove(cc); // ���ڷ� ���޵� CopyClient ��ü�� ArrayList���� ����
		sendMessage("----" + cc.ip + "�� ����----");
	}
	
	public static void main(String[] args) {
		new ChatServer().start(); // ���� ����
	}
}










