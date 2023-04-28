package ex5_checkBox;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Ex4_ScrollPane {
	public static void main(String[] args) {
		JFrame f = new JFrame("��ũ��");
		
		f.setLayout(new BorderLayout());
		
		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(10, 5));
		
		int cnt = 100;
		
		for (int i = 1; i <= cnt; i++) {
			JButton jb = new JButton("" + i);
			
			jp1.add(jb);
		}
		
		// ����, ���� ��ũ�ѹ�
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS; // ���� ���
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS; // ���� ���
		
		// ���� �гΰ� ����, ���� �������� ������ ��ũ���� �����ϴ� â�� �����
		JScrollPane jsp = new JScrollPane(jp1, v, h);
		
		// ������ ���� JScrollPane ��ü�� �����ӿ� �߰���
		f.add(jsp);

		f.setBounds(50, 50, 300, 200);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
