package ex3_FileOutput;

import java.io.IOException;
import java.io.PrintStream;

public class Ex1_PrintStream {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		
		// read�� InputStream���κ��� �����͸� �д� �޼ҵ忴�ٸ�,
		// write�� PrintStream���κ��� �����͸� ���� �޼ҵ��̴�.
		
//		ps.write('J');
//		ps.write('A');
//		ps.write('V');
//		ps.write('A');
//		
//		ps.flush();
//		ps.close();
		// PrintStream�� flush�ϰų� close�� �ϸ� ����� �ȴ�.
		
		byte[] byteArr = {'J', 'A', 'V', 'A'};
		
		try {
			ps.write(byteArr); // �ش� ����Ʈ�迭�� PrintStream���� �о�´�.
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ps.close();
		
		
	}
}








