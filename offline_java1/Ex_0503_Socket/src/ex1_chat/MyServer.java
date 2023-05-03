package ex1_chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// ������ Ŭ���� ��ӹ޾ƾ� ��
public class MyServer extends Thread{
	
	// �ڹٿ����� java.net ��Ű������ ���� ���α׷����� ���� Ŭ�������� �����ϰ� �ִ�.
	ServerSocket ss;
	
	public MyServer() {
		try {
			// ���� ���� ���� �� ��Ʈ ��ȣ�� �����Ѵ�.
			// ��Ʈ�� Ŭ���̾�Ʈ�� ������ �� �ʿ��ϴ�.
			ss = new ServerSocket(3000); // ���� �غ� �Ϸ�
			System.out.println("���� �غ� �Ϸ�");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// �����带 ��ӹ��� ������ 
	@Override
	public void run() {
		// ���� �ݺ� �ӿ��� �׻� �����ڵ��� ���� �غ� �ؾ� �Ѵ�.
		while(true) {
			try {
				Socket s = ss.accept(); // �� �������� ������ Socket�� ���
				
				// ������ ������ ��Ʈ�� ������ Ŭ���̾�Ʈ�� IP �ּҸ� �����´�.
				String ip = s.getInetAddress().getHostAddress();
				
				System.out.println(ip + "�� �Դ� ��");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		MyServer ms = new MyServer();
		ms.start(); // �ش� Ŭ���� ���� run() �޼ҵ� ȣ��
	}
	
}
