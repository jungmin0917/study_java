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
		// üũ�ڽ��� GUI���� �����ϱ� ���� ��ü
		
		JPanel jp1 = new JPanel();
		JCheckBox jcb1 = new JCheckBox("���ǰ���");
		JCheckBox jcb2 = new JCheckBox("���");
		JCheckBox jcb3 = new JCheckBox("����");
		
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		
		// JRadioButton
		// ���� ��ư�� GUI���� �����ϱ� ���� ��ü
		// ���� ��ư�� ���� ��ư �� �ϳ��� ������ �ϱ� ������ ButtonGroup ��ü�� �ʿ��ϴ�
		
		JPanel jp2 = new JPanel();
		ButtonGroup bg1 = new ButtonGroup();
		
		JRadioButton jrb1 = new JRadioButton("����", true); // true�� ������ �ش� ��ư�� �⺻���� �ȴ�
		JRadioButton jrb2 = new JRadioButton("����");
	
		// �Ʒ��� ���� ButtonGroup�� ����ΰ� �гο� ����ؾ� �ش� ��ư �׷쿡�� �ϳ��� ������ �����ϴ�.
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
