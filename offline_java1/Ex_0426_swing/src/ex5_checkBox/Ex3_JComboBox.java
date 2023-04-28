package ex5_checkBox;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Ex3_JComboBox {
	public static void main(String[] args) {

		// JComboBox
		// select 태그를 GUI에서 구현하기 위한 객체
		JFrame f = new JFrame("콤보박스 만들기");
		
		f.setLayout(null);
		
		String[] title = {"C", "Java", "Python", "JS", "React"};
		
		JComboBox<String> jcb1 = new JComboBox<>(title);
		
		// 콤보박스도 크기를 지정해준다. (콤보박스는 크기 지정 안 하면 안 보임)
		jcb1.setBounds(50, 50, 100, 30);
		
		f.add(jcb1);

		f.setBounds(50, 50, 300, 200);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
