package ex4_charStream;

import java.io.FileWriter;
import java.io.IOException;

public class Ex3_FileWriter {
	public static void main(String[] args) {
		
		String path = "D:\\JAVA19_hjm\\fileWriter����.txt";
		
		try {
			FileWriter fw = new FileWriter(path);
			
			fw.write("ù��° �� �ۼ�");
			fw.write("\n");
			fw.write("�ι�° �� �ۼ�");
			
			fw.flush();
			fw.close();
			
			System.out.println("���� �ۼ� �Ϸ�");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
