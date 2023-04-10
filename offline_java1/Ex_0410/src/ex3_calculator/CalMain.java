package ex3_calculator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CalMain {
	public static void main(String[] args) {
		try {
			// Calculator Ŭ������ �����
			// getResult() �޼ҵ� ����
			// ��ȯ���� ����, ���ڴ� ���� n1, n2�� �ް� ���ϰ��� -1
			
			// CalPlus Ŭ���� ����� Calculator Ŭ���� ��ӹ���
			// �������̵� �̿��Ͽ� getResult() �Լ��� �������Ͽ�
			// ���ڷ� ���� n1 + n2�� ��ȯ�ϴ� �Լ��� �����
			
			// CalMinus�� ��������
			
			CalPlus calPlus = new CalPlus();
			CalMinus calMinus = new CalMinus();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			System.out.print("�� ������ �Է��ϼ��� : ");
			
			String input = br.readLine();
			
			StringTokenizer st = new StringTokenizer(input);
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			String res = String.format("%d + %d = %d\n%d - %d = %d", a, b, calPlus.getResult(a, b), a, b, calMinus.getResult(a, b));
			
			bw.write(res);
			
			bw.flush();
			bw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
