package ex5_work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimesTableMain {
	// TimesTable Ŭ������ �����, showTable() �޼ҵ带 �����Ѵ�
	// showTable() �޼ҵ忡�� �������� ����ϴ� �ڵ带 �ۼ��Ѵ�
	// TimesTableMain������ TimesTable ��ü�� �����ϰ�, �����ܿ� ����� ���� �Է¹ް� �������� ����Ѵ�
	
	public static void main(String[] args) {
		
		try {
			TimesTable tt = new TimesTable();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("1 ~ 1000000 ������ ������ �Է����ּ���");
			
			int n = Integer.parseInt(br.readLine());
			
			if(n < 1 || n > 1000000) {
				throw new Exception("1 ~ 1000000 ������ ������ �Է����ּ���");
			}
			
			tt.setNum(n);
			
			tt.showTable();
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
