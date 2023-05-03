package ex7_Menu;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;

public class Ex2_JPopupMenu {
	public static void main(String[] args) {
		
		JFrame f = new JFrame("JMenuTest");
		
		String[] title = {"사번", "성명", "부서"};
		
		// 라디오 버튼 메뉴를 배열로 가지는 JRadioButtonMenuItem 배열 생성
		JRadioButtonMenuItem[] rbm = new JRadioButtonMenuItem[3];
		
		JPopupMenu pmenu = new JPopupMenu();
		ButtonGroup tgroup = new ButtonGroup(); // 라디오 버튼을 넣을 버튼 그룹 생성
		
		for (int i = 0; i < rbm.length; i++) { // JRadioButtonMenuItem 크기만큼
			rbm[i] = new JRadioButtonMenuItem(title[i]); // JRadioButtonMenuItem을 위의 title 배열을 이용해 생성함
			pmenu.add(rbm[i]); // 팝업 메뉴에 추가
			tgroup.add(rbm[i]); // 버튼 그룹에도 추가
		}
		
		// 마우스의 행동을 감지함
		f.addMouseListener(new MouseAdapter() { // MouseAdapter 객체를 생성한다 (내부에는 각종 마우스 행동에 대한 메소드가 정의되어 있다)
			@Override
			public void mousePressed(MouseEvent e) { // 마우스를 눌렀을 때
				checkForTriggerEvent(e);
			}
			
			@Override
			public void mouseReleased(MouseEvent e) { // 마우스를 뗐을 때
				checkForTriggerEvent(e);
			}
			
			// 마우스 오른쪽 버튼을 누르거나 해제할 때 발생 (따로 만든 커스텀 함수임)
			private void checkForTriggerEvent(MouseEvent e) {
				// 마우스 눌렀는데 팝업 트리거가 작동한다면 (오른쪽 버튼 눌렀을 때와 같은 상태)
				if(e.isPopupTrigger()) {
					// 팝업 메뉴를 보여준다.
					pmenu.show(e.getComponent(), e.getX(), e.getY());
				}
			}
		});
		
		// 정상적으로 작동한다면 우클릭했을 때 해당 위치에서 팝업 메뉴가 떠야 함
		
		f.setBounds(50, 50, 300, 200);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}









