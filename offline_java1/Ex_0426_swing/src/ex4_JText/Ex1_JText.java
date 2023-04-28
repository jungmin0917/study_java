package ex4_JText;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex1_JText {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		// JLabel
		// 정보 또는 텍스트를 위한 라벨을 생성한다.
		// 문자열이나 아이콘을 사용하여 객체를 생성한다.
		
		// JTextField
		// 한 줄의 문자열을 입력할 수 있는 요소이다.
		
		// JTextArea
		// 여러 줄의 문자열을 입력할 수 있는 요소이다.
		// 창의 크기보다 긴 문자열을 입력하더라도 스크롤바가 생기지 않는다.
		// 스크롤바 기능을 사용하기 위해 JScrollPane 객체를 사용한다.
		
		f.setLayout(new FlowLayout());
		
		JLabel lb1 = new JLabel("이름");
		JTextField tf = new JTextField(20); // 작성할 텍스트 크기 지정
		
		JLabel lb2 = new JLabel("주소");
		JTextArea ta = new JTextArea(5, 20); // 행, 열을 입력
		
		JLabel lb3 = new JLabel("비번");
		JPasswordField pf = new JPasswordField(20); // 비밀번호 입력칸임을 명시하여 내용이 노출되지 않게 함
		
		f.add(lb1);
		f.add(tf);
		
		f.add(lb2);
		f.add(ta);
		
		f.add(lb3);
		f.add(pf);

		f.setBounds(50, 50, 300, 200);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
