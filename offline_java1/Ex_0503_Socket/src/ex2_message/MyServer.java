package ex2_message;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread{
	ServerSocket ss; // ���� ����
	
	public MyServer() {
		try {
			ss = new ServerSocket(3001);
			
			System.out.println("���� ����");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		// Thread�� �ؾ� �� ��
		// �����ڸ� �ް�, �����ڰ� �Է��� ���ڿ� �ޱ�
		// �� ���ڿ��� IP�� �Բ� ���
		
		while(true) {
			try {
				Socket s = ss.accept();
				
				// Ŭ���̾�Ʈ�� ������ ���ڸ��� ���ڿ��� ������ ������ ���ڿ��� �޾�����
				
				BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				
				String msg = br.readLine(); // �����ڰ� ���� �޼����� �о��
				String ip = s.getInetAddress().getHostAddress();
				
				System.out.println(ip + " : " + msg);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// ���α׷��� ����
		MyServer ms = new MyServer();
		ms.start();
	}
}









