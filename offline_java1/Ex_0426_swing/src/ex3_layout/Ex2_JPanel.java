package ex3_layout;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex2_JPanel {
	public static void main(String[] args) {
		JFrame f = new JFrame("ÆÐ³Î°ú ·¹ÀÌ¾Æ¿ô");
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.YELLOW);
		
		p1.setLayout(new BorderLayout());

		p1.add("East", new JButton("µ¿"));
		p1.add("West", new JButton("¼­"));
		p1.add("South", new JButton("³²"));
		p1.add("North", new JButton("ºÏ"));
		p1.add("Center", new JButton("Áß¾Ó"));
		
		f.add(p1);

		f.setBounds(50, 50, 300, 200);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}














