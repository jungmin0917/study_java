package ex1_enum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class EnumMain {
	
//	ENUM : ������
//	������� ����

	public enum Item{
//		����ڰ� ������ �̸��� ���������� index�� �ο��ȴ�
//		�Ʒ��� ���� ��� START�� 0, PAUSE�� 1, EXIT�� 2�� �ο��� ���̴�
//		�ϳ��ϳ��� ����� ��ü��� ��������
		START, PAUSE, EXIT
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			System.out.println("0: ���ӽ���");
			System.out.println("1: �Ͻ�����");
			System.out.println("2: ��������");
			
			System.out.print("��ȣ�� �Է����ּ��� : ");
			
			int n = Integer.parseInt(br.readLine());
			
			Item start = Item.START;
			Item pause = Item.PAUSE;
			Item exit = Item.EXIT;

			if(n == start.ordinal()) {
				System.out.println("������ ���۵�");
			}else if(n == pause.ordinal()) {
				System.out.println("������ �Ͻ�������");
			}else {
				System.out.println("���� ����");
				break;
			}
		}
		
	}
}








