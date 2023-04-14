package ex5_Thread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CountMain {
	public static void main(String[] args) {
		
//		���ڸ� �Է¹ް�
//		���ڰ� 1�� �����ϴٰ� 0�� �Ǿ��� ��
//		"����"��� �޼����� �Բ� �����带 ������������ �����
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			System.out.print("1 ~ 100 ������ ������ �Է����ּ��� : ");
			
			int n = Integer.parseInt(br.readLine());
			
			if(n < 1 || n > 100) {
				throw new NumberFormatException("1 ~ 100 ���̷� �Է����ּ���");
			}
			
			CountThread ct = new CountThread();
			
			ct.setN(n);
			
			ct.start();
			
		} catch (NumberFormatException e) {
			if(e.getMessage() != null) {
				System.out.println(e.getMessage());
			}else {
				System.out.println("������ �Է����ּ���");
			}
		} catch (Exception e) {
			System.out.println("�����Դϴ�");
		} finally {
			try {
				bw.flush();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}







