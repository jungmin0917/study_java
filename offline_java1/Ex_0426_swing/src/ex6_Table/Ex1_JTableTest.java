package ex6_Table;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

public class Ex1_JTableTest {
	public static void main(String[] args) {
		
		JFrame f = new JFrame("테이블 만들기");
		
		f.setLayout(new BorderLayout());
		
		String[] title = {"사번", "성명", "부서"};
		String[][] data = {{"1", "홍길동", "총무부"}, {"2", "김길동", "경리부"}, {"3", "김자바", "영업부"}}; // 2차원 배열
		
		JTable table = new JTable(data, title);
		
		// 수직, 수평 스크롤바 설정을 위한 상수 설정 (수직, 수평 전부 스크롤바가 필요할 때만 나오게 함)
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		
		JScrollPane js = new JScrollPane(table, v, h);

		f.add(js, BorderLayout.CENTER);
		
		f.setBounds(50, 50, 300, 200);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
