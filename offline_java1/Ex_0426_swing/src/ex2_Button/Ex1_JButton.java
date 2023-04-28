package ex2_Button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// �̹��� GUI�� ��ư�� ���� �ٿ�����

public class Ex1_JButton {

	public static void main(String[] args) {
		// GUI ���α׷� ������ ���� �ּ����� �ڵ���� �ۼ�
		JFrame f = new JFrame("��ư(JButton) �߰�");
		
		// ���� ��ư�� �����
		JButton jbtn1 = new JButton("��ư1");
		JButton jbtn2 = new JButton("��ư2");
		JButton jbtn3 = new JButton("��ư3");
		
		// ��� ��Ҹ� �������� ��ġ�ϱ� ���� �޼ҵ�
		f.setLayout(null);
		
		int width = 70;
		int height = 70;
		
		int margin = 20;
		
		// ��ư�� ��ġ(���̾ƿ�)�� ������ ������ �⺻�����δ� �ش� GUIâ�� �� ä���.
		// �׷��� ��Ҹ�.setBounds() ������ ���̾ƿ��� �����ش�.
		
		jbtn1.setBounds(10, 10, width, height);
		jbtn2.setBounds(10 + width + margin, 10, width, height);
		jbtn3.setBounds(10 + (width + margin) * 2, 10, width, height);
		
		// ���� ��ư�� GUI â�� �ٿ��� �Ѵ�
		f.add(jbtn1);
		f.add(jbtn2);
		f.add(jbtn3);
		
		// ��ư�� ȭ�鿡 �� �ٿ����� ��ư�� ����� ������� �Ѵ�.
		// ActionListener ��ü�� �͸� �޼ҵ�� �����Ͽ� ������ actionPerformed�� �ٷ� �����Ѵ�.
		ActionListener al = new ActionListener() {
			
			@Override
			// actionPerformed ���θ� ���������ν� �����ʿ� ���� ����� �����.
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư ����");
			}
		};
		ActionListener al2 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���� ���� ��ư�� ���� �ִ� ���ڸ� ������
				System.out.println(e.getActionCommand());
			}
		};
		
		// ������ � ������ �����, ��ư���ٰ� ���� ����� �ٿ��� �Ѵ�.
		// JButton.addActionListener() �޼ҵ�� ����� �߰��Ѵ�.
		// �Ű������δ� ActionListener ��ü�� �޴´�
		jbtn1.addActionListener(al);
		jbtn2.addActionListener(new ActionListener() { // �ٷ� �͸��Լ��� ���� ��
			public void actionPerformed(ActionEvent e) {
//				System.out.println("�͸��Լ�");
				
				switch(e.getActionCommand()) {
					case "��ư1":
						System.out.println("1�� ��������");
						break;
					case "��ư2":
						System.out.println("2�� ��������");
						break;
					case "��ư3":
						System.out.println("3�� ��������");
						break;
					default:
						break;
				}
			}
		});
		jbtn3.addActionListener(al2);
		
		// ����� ��ư�� ���� �������̹Ƿ� "���� ��" �̺�Ʈ�� �߻��Ѵ�
		
		// ��ư�� setBounds, Visible �����ϱ� ���� ���� �ٿ���� �Ѵ�.
		
		f.setBounds(50, 50, 300, 200);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
