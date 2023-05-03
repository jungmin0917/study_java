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
		
		String[] title = {"���", "����", "�μ�"};
		
		// ���� ��ư �޴��� �迭�� ������ JRadioButtonMenuItem �迭 ����
		JRadioButtonMenuItem[] rbm = new JRadioButtonMenuItem[3];
		
		JPopupMenu pmenu = new JPopupMenu();
		ButtonGroup tgroup = new ButtonGroup(); // ���� ��ư�� ���� ��ư �׷� ����
		
		for (int i = 0; i < rbm.length; i++) { // JRadioButtonMenuItem ũ�⸸ŭ
			rbm[i] = new JRadioButtonMenuItem(title[i]); // JRadioButtonMenuItem�� ���� title �迭�� �̿��� ������
			pmenu.add(rbm[i]); // �˾� �޴��� �߰�
			tgroup.add(rbm[i]); // ��ư �׷쿡�� �߰�
		}
		
		// ���콺�� �ൿ�� ������
		f.addMouseListener(new MouseAdapter() { // MouseAdapter ��ü�� �����Ѵ� (���ο��� ���� ���콺 �ൿ�� ���� �޼ҵ尡 ���ǵǾ� �ִ�)
			@Override
			public void mousePressed(MouseEvent e) { // ���콺�� ������ ��
				checkForTriggerEvent(e);
			}
			
			@Override
			public void mouseReleased(MouseEvent e) { // ���콺�� ���� ��
				checkForTriggerEvent(e);
			}
			
			// ���콺 ������ ��ư�� �����ų� ������ �� �߻� (���� ���� Ŀ���� �Լ���)
			private void checkForTriggerEvent(MouseEvent e) {
				// ���콺 �����µ� �˾� Ʈ���Ű� �۵��Ѵٸ� (������ ��ư ������ ���� ���� ����)
				if(e.isPopupTrigger()) {
					// �˾� �޴��� �����ش�.
					pmenu.show(e.getComponent(), e.getX(), e.getY());
				}
			}
		});
		
		// ���������� �۵��Ѵٸ� ��Ŭ������ �� �ش� ��ġ���� �˾� �޴��� ���� ��
		
		f.setBounds(50, 50, 300, 200);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}









