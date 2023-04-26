package ex3_FileOutput;

import java.io.IOException;
import java.io.PrintStream;

public class Ex1_PrintStream {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		
		// read가 InputStream으로부터 데이터를 읽는 메소드였다면,
		// write는 PrintStream으로부터 데이터를 쓰는 메소드이다.
		
//		ps.write('J');
//		ps.write('A');
//		ps.write('V');
//		ps.write('A');
//		
//		ps.flush();
//		ps.close();
		// PrintStream을 flush하거나 close를 하면 출력이 된다.
		
		byte[] byteArr = {'J', 'A', 'V', 'A'};
		
		try {
			ps.write(byteArr); // 해당 바이트배열을 PrintStream으로 읽어온다.
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ps.close();
		
		
	}
}








