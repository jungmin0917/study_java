package ex5_checkBox;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Ex3_JComboBox {
	public static void main(String[] args) {

		// JComboBox
		// select �±׸� GUI���� �����ϱ� ���� ��ü
		JFrame f = new JFrame("�޺��ڽ� �����");
		
		f.setLayout(null);
		
		String[] title = {"C", "Java", "Python", "JS", "React"};
		
		JComboBox<String> jcb1 = new JComboBox<>(title);
		
		// �޺��ڽ��� ũ�⸦ �������ش�. (�޺��ڽ��� ũ�� ���� �� �ϸ� �� ����)
		jcb1.setBounds(50, 50, 100, 30);
		
		f.add(jcb1);

		f.setBounds(50, 50, 300, 200);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
