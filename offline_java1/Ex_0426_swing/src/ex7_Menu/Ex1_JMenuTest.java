package ex7_Menu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ex1_JMenuTest {
	public static void main(String[] args) {
		
		JFrame f = new JFrame("JMenuTest");

		// 메뉴바를 만든다
		JMenuBar jmb = new JMenuBar();
		
		// 메뉴바에 메뉴를 추가한다
		JMenu jmu1 = new JMenu("파일");
		JMenu jmu2 = new JMenu("편집");
		JMenu jmu3 = new JMenu("보기");
		
		// 메뉴를 누르면 나오는 소메뉴를 추가한다
		JMenuItem jmi1 = new JMenuItem("새로 만들기");
		JMenuItem jmi2 = new JMenuItem("열기");
		JMenuItem jmi3 = new JMenuItem("저장");
		
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
