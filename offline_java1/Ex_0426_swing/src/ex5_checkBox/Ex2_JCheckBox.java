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

		JFrame f = new JFrame("ItemEvent ó��");
		
		f.setLayout(new BorderLayout()); // �������� BorderLayout
		
		// ������ư ��ü ����
		ButtonGroup rgroup = new ButtonGroup();
		JRadioButton r1 = new JRadioButton("����1");
		JRadioButton r2 = new JRadioButton("����2");
		JRadioButton r3 = new JRadioButton("����3");
		
		rgroup.add(r1);
		rgroup.add(r2);
		rgroup.add(r3);
		
		JPanel jp1 = new JPanel();
		jp1.setBackground(Color.YELLOW);
		jp1.setLayout(new FlowLayout()); // �г��� FlowLayout
		
		jp1.add(r1);
		jp1.add(r2);
		jp1.add(r3);
		
		// �г��� �������� ����� ���̱�
		f.add(jp1, BorderLayout.CENTER); // �빮�ڴ� �ش� Ŭ���� ���� �̸� ������ �� �����
		
		JPanel jp2 = new JPanel(new FlowLayout());
		jp2.setBackground(Color.ORANGE);
		
		JLabel txt1 = new JLabel("���� �׸� : ");
		JLabel txt2 = new JLabel();
		
		jp2.add(txt1);
		jp2.add(txt2);
		
		f.add(jp2, BorderLayout.SOUTH);
		
		// ������ư�� �̺�Ʈ�� ����� �޼��� �������ϱ�
		// ������ư�� �̺�Ʈ�� ItemListener�� ����Ѵ�
		ItemListener il = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// ItemEvent.getStateChange()�� ��ȯ����, Ŭ���� �� �� 1, Ǯ�� �� 2�̴�.
				if(e.getStateChange() == ItemEvent.SELECTED) { // Ŭ����
					System.out.println("Ŭ����");
					
					// ItemEvent.getSource() : �̺�Ʈ�� �߻��� ��ü�� ������
					// �����ͼ� ������� ���� ��ư ��ü�� ���Ѵ�
					// Object Ÿ���� switch ~ case�� �� ��
					if(e.getSource() == r1) { 
						txt2.setText("����1");
					}else if(e.getSource() == r2) {
						txt2.setText("����2");
					}else{
						txt2.setText("����3");
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










