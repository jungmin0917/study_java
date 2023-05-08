package ex2_message;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
	public static void main(String[] args) throws IOException{
		// ���α׷� ����
		System.out.print("�Է� : ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String msg = br.readLine();
		
		if(msg != null && msg.trim().length() > 0) {
			Socket s; // ���� ��ü�� ����
			
			// ������ IP�� ��Ʈ�� ����
			try {
				// MyServer Ŭ�������� �� ���� ����
				s = new Socket("192.168.1.6", 3001);
				
				// ���ڿ��� ������ ������ ���� ��Ʈ�� �غ�
				// PrintWriter : ������ ������ ��ü�� ǥ���� �ؽ�Ʈ ��� ��Ʈ������ �μ���.
				PrintWriter out = new PrintWriter(s.getOutputStream());
				
				// ������ ���ڿ� ������
				out.write(msg);
				
				// ��Ʈ�� ����
				out.flush();
				
				// ��Ʈ�� �ݱ�
				if(out != null) {
					out.close();
				}
				
				// ���� �ݱ�
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











