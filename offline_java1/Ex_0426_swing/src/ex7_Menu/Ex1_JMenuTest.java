package ex7_Menu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ex1_JMenuTest {
	public static void main(String[] args) {
		
		JFrame f = new JFrame("JMenuTest");

		// �޴��ٸ� �����
		JMenuBar jmb = new JMenuBar();
		
		// �޴��ٿ� �޴��� �߰��Ѵ�
		JMenu jmu1 = new JMenu("����");
		JMenu jmu2 = new JMenu("����");
		JMenu jmu3 = new JMenu("����");
		
		// �޴��� ������ ������ �Ҹ޴��� �߰��Ѵ�
		JMenuItem jmi1 = new JMenuItem("���� �����");
		JMenuItem jmi2 = new JMenuItem("����");
		JMenuItem jmi3 = new JMenuItem("����");
		
		jmu1.add(jmi1);
		jmu1.add(jmi2);
		jmu1.add(jmi3);
		
		jmb.add(jmu1);
		jmb.add(jmu2);
		jmb.add(jmu3);
		
		f.setJMenuBar(jmb);
		
		f.setBounds(50, 50, 300, 200);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
