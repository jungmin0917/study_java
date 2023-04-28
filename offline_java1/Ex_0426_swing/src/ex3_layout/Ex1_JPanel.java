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
		JFrame f = new JFrame("패널과 레이아웃");
		
		JPanel p1 = new JPanel(); // 새로운 JPanel 객체를 만듦
		p1.setBackground(Color.YELLOW); // 패널의 백그라운드를 만들고 색깔을 지정함
		
		// 배치 관리자 종류 (setLayout 안에 들어갈 것)
		// 1. FlowLayout : 왼쪽에서 오른쪽으로 배치, 오른쪽 공간이 없으면 아래로 배치함
		// 2. BorderLayout : 동, 서, 남, 북, 중앙 5개의 영역으로 나누어 배치한다.
		// 3. GridLayout : 2차원의 표 모양으로, n * n으로 설정해주며 왼쪽에서 오른쪽, 위에서 아래 순으로 배치한다.
		// 4. CardLayout : 컴포넌트를 포개어 배치한다.
		// 5. null : 레이아웃을 쓰지 않고 컴포넌트마다 수동으로 위치를 설정함
		
//		p1.setLayout(new FlowLayout());
//		p1.setLayout(new GridLayout(3, 2)); // 행, 열을 지정해준다
		
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














