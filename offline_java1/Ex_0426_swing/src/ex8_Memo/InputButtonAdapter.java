package ex8_Memo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

// 커스텀 액션 리스너
public class InputButtonAdapter implements ActionListener{
	
	// 생성자의 특징 (아주 중요)
	// 1. 반환값이 없다
	// 2. 클래스의 이름과 무조건 동일한 이름의 메소드이다
	// 3. 객체 생성 시 1회만 호출되며 그 후 재호출할 수 없다
	
	private JTextField tf;
	private JTextArea ta;
	
	// 기본 생성자
	public InputButtonAdapter(JTextField tf, JTextArea ta) {
		this.tf = tf;
		this.ta = ta;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// JTextArea.setText() : 해당 textarea의 내용을 매개변수 내용으로 세팅을 하는 메서드
		
//		ta.setText(tf.getText()); // 이건 ta값이 계속 덮어씌워짐
		
		// ta가 가진 기존 값에 새로 들어온 값을 append 하기
		this.ta.append(tf.getText() + "\n");
		
		// tf 값을 ta로 옮겼으니 tf를 비우기
		this.tf.requestFocus(); // 커서를 tf로 옮겨놓는다.
		this.tf.setText(""); // tf를 빈 문자열로 덮어쓴다.
	}
	
}












