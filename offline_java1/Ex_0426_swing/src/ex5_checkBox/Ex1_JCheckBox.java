package ex5_checkBox;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex1_JCheckBox {
	public static void main(String[] args) {
		JFrame f = new JFrame();

		// JCheckBox
		// 체크박스를 GUI에서 구현하기 위한 객체
		
		JPanel jp1 = new JPanel();
		JCheckBox jcb1 = new JCheckBox("음악감상");
		JCheckBox jcb2 = new JCheckBox("등산");
		JCheckBox jcb3 = new JCheckBox("조깅");
		
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		
		// JRadioButton
		// 라디오 버튼을 GUI에서 구현하기 위한 객체
		// 라디오 버튼은 여러 버튼 중 하나만 눌려야 하기 때문에 ButtonGroup 객체가 필요하다
		
		JPanel jp2 = new JPanel();
		ButtonGroup bg1 = new ButtonGroup();
		
		JRadioButton jrb1 = new JRadioButton("남자", true); // true로 적으면 해당 버튼이 기본값이 된다
		JRadioButton jrb2 = new JRadioButton("여자");
	
		// 아래와 같이 ButtonGroup에 묶어두고 패널에 등록해야 해당 버튼 그룹에서 하나만 선택이 가능하다.
		bg1.add(jrb1);
		bg1.add(jrb2);

		jp2.add(jrb1);
		jp2.add(jrb2);
		
		f.add(jp1, "North");
		f.add(jp2, "South");

		f.setBounds(50, 50, 300, 200);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
