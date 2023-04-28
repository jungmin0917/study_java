package ex4_JText;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex1_JText {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		// JLabel
		// ���� �Ǵ� �ؽ�Ʈ�� ���� ���� �����Ѵ�.
		// ���ڿ��̳� �������� ����Ͽ� ��ü�� �����Ѵ�.
		
		// JTextField
		// �� ���� ���ڿ��� �Է��� �� �ִ� ����̴�.
		
		// JTextArea
		// ���� ���� ���ڿ��� �Է��� �� �ִ� ����̴�.
		// â�� ũ�⺸�� �� ���ڿ��� �Է��ϴ��� ��ũ�ѹٰ� ������ �ʴ´�.
		// ��ũ�ѹ� ����� ����ϱ� ���� JScrollPane ��ü�� ����Ѵ�.
		
		f.setLayout(new FlowLayout());
		
		JLabel lb1 = new JLabel("�̸�");
		JTextField tf = new JTextField(20); // �ۼ��� �ؽ�Ʈ ũ�� ����
		
		JLabel lb2 = new JLabel("�ּ�");
		JTextArea ta = new JTextArea(5, 20); // ��, ���� �Է�
		
		JLabel lb3 = new JLabel("���");
		JPasswordField pf = new JPasswordField(20); // ��й�ȣ �Է�ĭ���� ����Ͽ� ������ ������� �ʰ� ��
		
		f.add(lb1);
		f.add(tf);
		
		f.add(lb2);
		f.add(ta);
		
		f.add(lb3);
		f.add(pf);

		f.setBounds(50, 50, 300, 200);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
