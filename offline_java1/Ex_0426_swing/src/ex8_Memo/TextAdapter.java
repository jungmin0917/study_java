package ex8_Memo;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TextAdapter implements DocumentListener{
	
	private JTextField tf;
	private JButton btnInput;
	
	public TextAdapter(JTextField tf, JButton btnInput) {
		this.tf = tf;
		this.btnInput = btnInput;
	}
	
	@Override
	public void insertUpdate(DocumentEvent e) {
		this.change();
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		this.change();
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		this.change();
	}
	
	public void change() {
		if(tf.getText().length() == 0) {
			this.btnInput.setEnabled(false);
		}else {
			this.btnInput.setEnabled(true);
		}
	}
}
