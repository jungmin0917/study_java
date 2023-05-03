package ex8_Memo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

// Ŀ���� �׼� ������
public class InputButtonAdapter implements ActionListener{
	
	// �������� Ư¡ (���� �߿�)
	// 1. ��ȯ���� ����
	// 2. Ŭ������ �̸��� ������ ������ �̸��� �޼ҵ��̴�
	// 3. ��ü ���� �� 1ȸ�� ȣ��Ǹ� �� �� ��ȣ���� �� ����
	
	private JTextField tf;
	private JTextArea ta;
	
	// �⺻ ������
	public InputButtonAdapter(JTextField tf, JTextArea ta) {
		this.tf = tf;
		this.ta = ta;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// JTextArea.setText() : �ش� textarea�� ������ �Ű����� �������� ������ �ϴ� �޼���
		
//		ta.setText(tf.getText()); // �̰� ta���� ��� �������
		
		// ta�� ���� ���� ���� ���� ���� ���� append �ϱ�
		this.ta.append(tf.getText() + "\n");
		
		// tf ���� ta�� �Ű����� tf�� ����
		this.tf.requestFocus(); // Ŀ���� tf�� �Űܳ��´�.
		this.tf.setText(""); // tf�� �� ���ڿ��� �����.
	}
	
}












