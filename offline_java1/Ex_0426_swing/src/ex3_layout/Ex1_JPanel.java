package ex3_layout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex1_JPanel {
	public static void main(String[] args) {
		JFrame f = new JFrame("�гΰ� ���̾ƿ�");
		
		JPanel p1 = new JPanel(); // ���ο� JPanel ��ü�� ����
		p1.setBackground(Color.YELLOW); // �г��� ��׶��带 ����� ������ ������
		
		// ��ġ ������ ���� (setLayout �ȿ� �� ��)
		// 1. FlowLayout : ���ʿ��� ���������� ��ġ, ������ ������ ������ �Ʒ��� ��ġ��
		// 2. BorderLayout : ��, ��, ��, ��, �߾� 5���� �������� ������ ��ġ�Ѵ�.
		// 3. GridLayout : 2������ ǥ �������, n * n���� �������ָ� ���ʿ��� ������, ������ �Ʒ� ������ ��ġ�Ѵ�.
		// 4. CardLayout : ������Ʈ�� ������ ��ġ�Ѵ�.
		// 5. null : ���̾ƿ��� ���� �ʰ� ������Ʈ���� �������� ��ġ�� ������
		
//		p1.setLayout(new FlowLayout());
//		p1.setLayout(new GridLayout(3, 2)); // ��, ���� �������ش�
		
		p1.add(new JButton("1"));
		p1.add(new JButton("2"));
		p1.add(new JButton("3"));
		p1.add(new JButton("4"));
		p1.add(new JButton("5"));
		
		f.add(p1);

		f.setBounds(50, 50, 300, 200);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}














