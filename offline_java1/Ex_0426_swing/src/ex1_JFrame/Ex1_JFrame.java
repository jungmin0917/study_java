package ex1_JFrame;

import javax.swing.JFrame;

public class Ex1_JFrame extends JFrame{
	
	// JFrame�� GUI�� �����ϴ� ��ü
	
	public Ex1_JFrame() { // JFrame�̶��, GUI â�� ����� �� ����
		super("����");
		
		// x��ǥ, y��ǥ, width, height
		setBounds(300, 300, 300, 200);
		setVisible(true); // â�� ���̴��� ����
		
	}
	
	public static void main(String[] args) {
		Ex1_JFrame f = new Ex1_JFrame(); // â ��ü�� ������
		f.setDefaultCloseOperation(EXIT_ON_CLOSE); // �̰� �� ������ â�� ���� ����� ���μ����� ������ ����
	}
}
