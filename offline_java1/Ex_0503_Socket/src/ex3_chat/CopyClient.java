package ex3_chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// Ŭ���̾�Ʈ ���纻 Ŭ����

public class CopyClient extends Thread{
	Socket s; // ChatClient�� ����
	BufferedReader br; // �б�
	PrintWriter out; // ����
	ChatServer server; // ������ Ŭ����
	String ip;

	// ����� ���ϰ� ä�� ���� ��ü�� �޾� ��� �� �Է� ��Ʈ���� ����.
	public CopyClient(Socket s, ChatServer cs) {
		this.s = s;
		this.server = cs;
		
		try {
			out = new PrintWriter(s.getOutputStream(), true); // Ŭ���̾�Ʈ���� ������ �����͸� ������ ���� ��� ��Ʈ���� ����. �� ��� ��Ʈ���� PrintWriter Ŭ������ ����Ͽ� �����ϰ� ���ڿ��� ������ ������ �� �ֵ��� ��
			br = new BufferedReader(new InputStreamReader(s.getInputStream())); // Ŭ���̾�Ʈ���� �����κ��� �����͸� �ޱ� ���� �Է� ��Ʈ���� ����. �� �Է� ��Ʈ���� BufferedReader Ŭ������ ����Ͽ� �����ϰ� ���ڿ��� �����κ��� �о�� �� �ֵ��� ��
			
			ip = s.getInetAddress().getHostAddress();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				// �Է��� �����
				String msg = br.readLine();
				
				// �Է��� �޾Ҵµ� xx:~X�̸� ������
				if(msg.equals("xx:~X")) {
					out.println("xx:~X"); // ������ ����
					
					server.removeClient(this); // ���� Ŭ���̾�Ʈ�� list���� ������
					
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







