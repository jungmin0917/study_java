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

// JFrame�� ����ϹǷ� ChatClient Ŭ������ �ϳ��� �������� ��
public class ChatClient extends JFrame implements Runnable{
	
	// �̹��� ä�ù� ȭ���� �����غ���
	// Ŭ���̾�Ʈ���� ���� ������ �޴� �� ���� Ȯ���ϱ� ���� GUI�� ���� Ȯ���غ���
	
	JTextField input; // �޼����� �Է��ϴ� ����
	JButton send_bt; // �Է��� �޼����� �����ϴ� ��ư
	JTextArea area; // �޼����� ȭ�鿡 ����ϴ� ����
	JPanel south_p; // ���� ��ҵ��� ���� �г�
	
	// ���� ������ ���� ��ü
	Socket s;
	
	// Ŭ���̾�Ʈ�� ä�� ������ ���� �ϹǷ� BufferedReader�� �ʿ���
	BufferedReader br; // �б�
	PrintWriter out; // ����
	Thread t;

	public ChatClient() { // ������
		area = new JTextArea(); // ä���� ���� ����
		this.add(area); // �����ӿ� JTextArea �߰�
		
		// BorderLayout ��ġ �����ڷ� ������ JPanel ����
		// BorderLayout : ������������ ��ġ
		south_p = new JPanel(new BorderLayout());
		south_p.add(input = new JTextField()); // �޼��� �Է� �ʵ�
		south_p.add(send_bt = new JButton("������"), BorderLayout.EAST); // �ؽ�Ʈ�� ���ʿ�, ��ư�� �����ʿ� ��ġ
		
		this.add(south_p, BorderLayout.SOUTH); // �Է� �ؽ�Ʈ�� ��ư�� ������ �Ʒ��� ��ġ

		// ������ â�� ���� �̺�Ʈ ó�� (�⺻ ��ư�� �ּ�ȭ, �ִ�ȭ, �ݱ� ��)
		this.addWindowListener(new WindowAdapter() {
			
			// ���� X ��ư�� ������ ��
			@Override
			public void windowClosing(WindowEvent e) {
				out.println("xx:~X"); // ���� �� xx:~X��� �޼����� ����
				// �ش� �޼����� �߸� ������ �����ų ������
			}
			
		});
		
		// ������ ��ư�� ������ ���� ���� �̺�Ʈ ó��
		send_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sendData(); // ������ �޼����� �����ϱ� ���� �޼ҵ�
			}
		});
		
		// ������ ���� ����
		this.setBounds(100, 100, 400, 500);
		this.setVisible(true);
		
		connect(); // ������ ������ �ϱ� ���� Ŀ���� �޼ҵ�
		
		// �����κ��� ���޵Ǵ� �޼����� �����Ͽ� �޴� ������ ���� (�ٸ� ������ ������ ���� �͵� ��� �����ؼ� �޾ƾ� �ϹǷ�)
		t = new Thread(this); 
		t.start(); // ������ ����
		
	} // ������

	// ���� ���� �޼ҵ�
	public void connect() {
		try {
			s = new Socket("192.168.1.101", 3200);
			
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			out = new PrintWriter(s.getOutputStream(), true); // PrintWriter ���۸� �ڵ����� flush�ϴ� �ɼ� ����
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// ���α׷� ���� ���ο� ���� ���� �ܵ����� ���ư�
	@Override
	public void run() {
		// �����κ��� ���޵Ǵ� �޼����� ��ٷȴٰ� �޼����� �����ϸ� ȭ�鿡 �����
		
		while(true) { // ��� ������
			try {
				String msg = br.readLine(); // ��� ����
				if(msg.equals("xx:~X")) { // ����ڰ� xx:~X�� ġ�� �ݺ��� ��������
					break;
				}
				
				if(msg != null) {
					area.append(msg + "\r\n"); // ���� �����Ͽ� area�� �޼��� �߰�
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		close(); // �����ִ� ��Ʈ���� �ݴ� Ŀ���� �޼ҵ�
		System.exit(0); // ���� ���� ���� �ڹ� ���α׷��� �����ϴ� �޼ҵ�
		
	} // run
	
	// ������ �޼��� �����ϴ� �޼ҵ�
	public void sendData() {
		String msg = input.getText().trim(); // ������ ���� �޽����� JTextField���� ������
		
		if(msg.length() > 0) {
			// �� ���ڶ� �Է��ϸ� ����
			out.println(msg);
		}
		
		input.setText("");
	}
	
	// �����ִ� ��Ʈ�� ������ �ݴ� �޼ҵ�
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















