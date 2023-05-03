package ex6_Table;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

public class Ex1_JTableTest {
	public static void main(String[] args) {
		
		JFrame f = new JFrame("���̺� �����");
		
		f.setLayout(new BorderLayout());
		
		String[] title = {"���", "����", "�μ�"};
		String[][] data = {{"1", "ȫ�浿", "�ѹ���"}, {"2", "��浿", "�渮��"}, {"3", "���ڹ�", "������"}}; // 2���� �迭
		
		JTable table = new JTable(data, title);
		
		// ����, ���� ��ũ�ѹ� ������ ���� ��� ���� (����, ���� ���� ��ũ�ѹٰ� �ʿ��� ���� ������ ��)
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		
		JScrollPane js = new JScrollPane(table, v, h);

		f.add(js, BorderLayout.CENTER);
		
		f.setBounds(50, 50, 300, 200);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
