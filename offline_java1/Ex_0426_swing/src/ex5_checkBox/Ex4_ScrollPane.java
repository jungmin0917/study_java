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
		JFrame f = new JFrame("스크롤");
		
		f.setLayout(new BorderLayout());
		
		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(10, 5));
		
		int cnt = 100;
		
		for (int i = 1; i <= cnt; i++) {
			JButton jb = new JButton("" + i);
			
			jp1.add(jb);
		}
		
		// 수직, 수평 스크롤바
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS; // 수직 상수
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS; // 수평 상수
		
		// 기존 패널과 수직, 수평 설정값을 가지고 스크롤이 존재하는 창을 만든다
		JScrollPane jsp = new JScrollPane(jp1, v, h);
		
		// 위에서 만든 JScrollPane 객체를 프레임에 추가함
		f.add(jsp);

		f.setBounds(50, 50, 300, 200);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
