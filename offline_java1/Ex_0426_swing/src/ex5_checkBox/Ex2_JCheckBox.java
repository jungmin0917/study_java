package ex5_checkBox;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex2_JCheckBox {
	public static void main(String[] args) {

		JFrame f = new JFrame("ItemEvent 처리");
		
		f.setLayout(new BorderLayout()); // 프레임은 BorderLayout
		
		// 라디오버튼 객체 생성
		ButtonGroup rgroup = new ButtonGroup();
		JRadioButton r1 = new JRadioButton("선택1");
		JRadioButton r2 = new JRadioButton("선택2");
		JRadioButton r3 = new JRadioButton("선택3");
		
		rgroup.add(r1);
		rgroup.add(r2);
		rgroup.add(r3);
		
		JPanel jp1 = new JPanel();
		jp1.setBackground(Color.YELLOW);
		jp1.setLayout(new FlowLayout()); // 패널은 FlowLayout
		
		jp1.add(r1);
		jp1.add(r2);
		jp1.add(r3);
		
		// 패널을 프레임의 가운데에 붙이기
		f.add(jp1, BorderLayout.CENTER); // 대문자는 해당 클래스 내의 미리 선언해 둔 상수임
		
		JPanel jp2 = new JPanel(new FlowLayout());
		jp2.setBackground(Color.ORANGE);
		
		JLabel txt1 = new JLabel("선택 항목 : ");
		JLabel txt2 = new JLabel();
		
		jp2.add(txt1);
		jp2.add(txt2);
		
		f.add(jp2, BorderLayout.SOUTH);
		
		// 라디오버튼의 이벤트를 담당할 메서드 재정의하기
		// 라디오버튼의 이벤트는 ItemListener가 담당한다
		ItemListener il = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// ItemEvent.getStateChange()의 반환값은, 클릭이 될 때 1, 풀릴 때 2이다.
				if(e.getStateChange() == ItemEvent.SELECTED) { // 클릭됨
					System.out.println("클릭됨");
					
					// ItemEvent.getSource() : 이벤트가 발생한 객체를 가져옴
					// 가져와서 만들었던 라디오 버튼 객체와 비교한다
					// Object 타입은 switch ~ case문 안 됨
					if(e.getSource() == r1) { 
						txt2.setText("선택1");
					}else if(e.getSource() == r2) {
						txt2.setText("선택2");
					}else{
						txt2.setText("선택3");
					}
				}
				
				System.out.println(e);
			}
		};
		
		r1.addItemListener(il);
		r2.addItemListener(il);
		r3.addItemListener(il);

		f.setBounds(50, 50, 300, 200);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}










