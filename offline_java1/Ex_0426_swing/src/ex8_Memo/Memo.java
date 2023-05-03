package ex8_Memo;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Memo {
	public static void main(String[] args) {
		
		JFrame f = new JFrame("�޸���");
		
		// ���� �޸����� ��ҵ��� �ø� JPanel ��ü ����
		JPanel jp = new JPanel();
		jp.setBackground(Color.CYAN);
		jp.setLayout(null);
		
		// �ؽ�Ʈ �Է�â�� ����
		JTextField tf = new JTextField();
		tf.setBounds(10, 15, 170, 30);
		
		// �Է��� �ؽ�Ʈ�� �ű� ��ư�� ����
		JButton btnInput = new JButton("Ȯ��");
		btnInput.setBounds(185, 15, 60, 30);
		btnInput.setEnabled(false); // ��ư Ŭ�� ��Ȱ��ȭ (�ϳ��� ���� �������� �� Ȱ��ȭ��ų ����)
		
		// ���ݲ� �ű� �ؽ�Ʈ ������ textarea�� ����
		JTextArea ta = new JTextArea();
		ta.setBounds(10, 60, 230, 280);
		ta.setEditable(false); // ���� �ۼ������� ���ϰ� ��
		
		JButton btnSave = new JButton("����");
		JButton btnClose = new JButton("����");
		btnSave.setBounds(10, 356, 110, 30);
		btnClose.setBounds(130, 356, 110, 30);
		
		// ��� ���� �ٹ̴� �� �� �߰� ����� ������
		// Ȯ�� ��ư Ŭ�� �� tf�� ���� ta�� ������ �ֱ�
		// ���ڷ� ��ü�� ���� �� (���⼭�� tf, ta) ��ü�� ������ ������ ���� �ƴϰ� ��ü�� �ּҰ��� ���޵ȴ�. �׷��� �ش� Ŭ�������� ��ü�� ������ �ٲٰų� �ϸ� �����Լ��� �ش� ��ü�� ���뵵 �ٲ�� ���̴�.
		btnInput.addActionListener(new InputButtonAdapter(tf, ta));
		
		// tf�� ���� �ϳ��� �� �ִ��� Ȯ���Ͽ� btnInput ��ư Ȱ��ȭ �Ǵ� ��Ȱ��ȭ
		tf.getDocument().addDocumentListener(new TextAdapter(tf, btnInput));
		
		
		// �����ư ������ �ش� ������ ���Ϸ� ����ǵ��� �ϱ�
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = ta.getText(); // ������ ������ String�� ����
				
				// ���� ������ �� ���������� �ߴ� â ��ü ����
				// â�� ��� ������, â �̸�, ��� â�� ����
				FileDialog fd = new FileDialog(f, "����", FileDialog.SAVE);
				
				fd.setVisible(true);
				
				String path = fd.getDirectory() + fd.getFile() + ".txt"; // ���� ���� �� ������ ��ġ + ������ ���ϸ�
				
				System.out.println(path);
				
				try {
					FileWriter fw = new FileWriter(path);
					
					fw.write(message);
					
					fw.flush();
					fw.close();
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		// ���� ��ư
		btnClose.addActionListener(new ActionListener() {	
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose(); // â�� ���� ���α׷� �����ϴ� �޼���
			}
		});
		
		
		jp.add(tf);
		jp.add(btnInput);
		jp.add(ta);
		jp.add(btnSave);
		jp.add(btnClose);
		
		f.add(jp);

		f.setBounds(700, 200, 270, 440);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}













