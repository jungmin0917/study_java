package ex7_try_catch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex3_TryCatch {
	public static void main(String[] args) {
		// Ű���忡�� ���� �Է¹ް� �ϰ�, ���� �̿� ���� �ԷµǾ����� "������ �Է� ����"
		
		// ������ �Է¹��� ���
		// ���� : 100
		// �Է¹��� �� : 100
		
		// ������ �Է¹��� ���� ���
		// ������ �Է� ����
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			System.out.print("������ �Է����ּ��� : ");
			
			int n = Integer.parseInt(br.readLine());
			
			bw.write(String.format("�Է¹��� �� : %d\n", n));
			
		} catch(NumberFormatException e) {
			System.out.println("������ �Է� ����");
		} catch (Exception e) {
			System.out.println("�߸��� �Է��Դϴ�");
		} finally {
			System.out.println("���α׷� ����");
			
			try {
				bw.flush();
				bw.close();
			} catch (IOException e) {
				System.out.println("��� �����Դϴ�");
			}
			
		}
	}
}













