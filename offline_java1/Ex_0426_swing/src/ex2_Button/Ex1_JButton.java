package ex2_Button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// 이번엔 GUI에 버튼을 만들어서 붙여보자

public class Ex1_JButton {

	public static void main(String[] args) {
		// GUI 프로그램 생성을 위한 최소한의 코드부터 작성
		JFrame f = new JFrame("버튼(JButton) 추가");
		
		// 먼저 버튼을 만든다
		JButton jbtn1 = new JButton("버튼1");
		JButton jbtn2 = new JButton("버튼2");
		JButton jbtn3 = new JButton("버튼3");
		
		// 모든 요소를 수동으로 배치하기 위한 메소드
		f.setLayout(null);
		
		int width = 70;
		int height = 70;
		
		int margin = 20;
		
		// 버튼의 배치(레이아웃)를 정하지 않으면 기본적으로는 해당 GUI창을 꽉 채운다.
		// 그래서 요소명.setBounds() 등으로 레이아웃을 정해준다.
		
		jbtn1.setBounds(10, 10, width, height);
		jbtn2.setBounds(10 + width + margin, 10, width, height);
		jbtn3.setBounds(10 + (width + margin) * 2, 10, width, height);
		
		// 만든 버튼을 GUI 창에 붙여야 한다
		f.add(jbtn1);
		f.add(jbtn2);
		f.add(jbtn3);
		
		// 버튼을 화면에 다 붙였으면 버튼별 기능을 정해줘야 한다.
		// ActionListener 객체를 익명 메소드로 선언하여 내부의 actionPerformed를 바로 구현한다.
		ActionListener al = new ActionListener() {
			
			@Override
			// actionPerformed 내부를 구현함으로써 리스너에 대한 기능을 만든다.
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 누름");
			}
		};
		ActionListener al2 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 내가 누른 버튼에 쓰여 있는 글자를 가져옴
				System.out.println(e.getActionCommand());
			}
		};
		
		// 위에서 어떤 행위를 만들고, 버튼에다가 이제 기능을 붙여야 한다.
		// JButton.addActionListener() 메소드로 기능을 추가한다.
		// 매개변수로는 ActionListener 객체를 받는다
		jbtn1.addActionListener(al);
		jbtn2.addActionListener(new ActionListener() { // 바로 익명함수로 만들어도 됨
			public void actionPerformed(ActionEvent e) {
//				System.out.println("익명함수");
				
				switch(e.getActionCommand()) {
					case "버튼1":
						System.out.println("1번 ㄱㄱㄱㄱ");
						break;
					case "버튼2":
						System.out.println("2번 ㅎㅎㅎㅎ");
						break;
					case "버튼3":
						System.out.println("3번 ㅇㅇㅇㅇ");
						break;
					default:
						break;
				}
			}
		});
		jbtn3.addActionListener(al2);
		
		// 현재는 버튼에 대한 리스너이므로 "누를 때" 이벤트가 발생한다
		
		// 버튼은 setBounds, Visible 선언하기 전에 만들어서 붙여줘야 한다.
		
		f.setBounds(50, 50, 300, 200);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
