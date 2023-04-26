package ex1_JFrame;

import javax.swing.JFrame;

public class Ex1_JFrame extends JFrame{
	
	// JFrame은 GUI를 생성하는 객체
	
	public Ex1_JFrame() { // JFrame이라고, GUI 창을 만드는 것 같다
		super("제목");
		
		// x좌표, y좌표, width, height
		setBounds(300, 300, 300, 200);
		setVisible(true); // 창이 보이는지 여부
		
	}
	
	public static void main(String[] args) {
		Ex1_JFrame f = new Ex1_JFrame(); // 창 객체를 생성함
		f.setDefaultCloseOperation(EXIT_ON_CLOSE); // 이거 안 적으면 창을 꺼도 실행된 프로세스가 꺼지지 않음
	}
}
