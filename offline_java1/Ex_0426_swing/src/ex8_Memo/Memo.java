package ex8_Memo;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Memo {
	public static void main(String[] args) {
		
		JFrame f = new JFrame("메모장");
		
		// 먼저 메모장의 요소들을 올릴 JPanel 객체 생성
		JPanel jp = new JPanel();
		jp.setBackground(Color.CYAN);
		jp.setLayout(null);
		
		// 텍스트 입력창을 만듦
		JTextField tf = new JTextField();
		tf.setBounds(10, 15, 170, 30);
		
		// 입력한 텍스트를 옮길 버튼을 만듦
		JButton btnInput = new JButton("확인");
		btnInput.setBounds(185, 15, 60, 30);
		btnInput.setEnabled(false); // 버튼 클릭 비활성화 (하나라도 뭔가 적혀있을 때 활성화시킬 것임)
		
		// 지금껏 옮긴 텍스트 보여줄 textarea를 만듦
		JTextArea ta = new JTextArea();
		ta.setBounds(10, 60, 230, 280);
		ta.setEditable(false); // 직접 작성하지는 못하게 함
		
		JButton btnSave = new JButton("저장");
		JButton btnClose = new JButton("종료");
		btnSave.setBounds(10, 356, 110, 30);
		btnClose.setBounds(130, 356, 110, 30);
		
		// 요소 만들어서 꾸미는 건 다 했고 기능을 만들자
		// 확인 버튼 클릭 시 tf의 값을 ta에 복사해 넣기
		// 인자로 객체를 전달 시 (여기서는 tf, ta) 객체의 내용을 보내는 것이 아니고 객체의 주소값이 전달된다. 그래서 해당 클래스에서 객체의 내용을 바꾸거나 하면 메인함수의 해당 객체의 내용도 바뀌는 것이다.
		btnInput.addActionListener(new InputButtonAdapter(tf, ta));
		
		// tf에 값이 하나라도 들어가 있는지 확인하여 btnInput 버튼 활성화 또는 비활성화
		tf.getDocument().addDocumentListener(new TextAdapter(tf, btnInput));
		
		
		// 저장버튼 누르면 해당 내용이 파일로 저장되도록 하기
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = ta.getText(); // 저장할 내용을 String에 담음
				
				// 파일 저장할 때 브라우저에서 뜨는 창 객체 생성
				// 창을 띄울 프레임, 창 이름, 띄울 창의 종류
				FileDialog fd = new FileDialog(f, "저장", FileDialog.SAVE);
				
				fd.setVisible(true);
				
				String path = fd.getDirectory() + fd.getFile() + ".txt"; // 파일 저장 시 지정한 위치 + 지정한 파일명
				
				System.out.println(path);
				
				try {
					FileWriter fw = new FileWriter(path);
					
					fw.write(message);
					
					fw.flush();
					fw.close();
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		// 종료 버튼
		btnClose.addActionListener(new ActionListener() {	
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose(); // 창을 끄고 프로그램 종료하는 메서드
			}
		});
		
		
		jp.add(tf);
		jp.add(btnInput);
		jp.add(ta);
		jp.add(btnSave);
		jp.add(btnClose);
		
		f.add(jp);

		f.setBounds(700, 200, 270, 440);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}













