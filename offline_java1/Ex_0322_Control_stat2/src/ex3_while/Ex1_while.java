package ex3_while;

import java.util.stream.IntStream;

public class Ex1_while {
	public static void main(String[] args) {
		// for������ ������ ������ ���� �ݺ��� (���� ��ó��)
		
//		�⺻��
//		while(���ǽ�) {
//			//
//		}
	
//		int i = 1; // �ʱ�� (while���� �� ����)
//		while(i <= 100) {
//			System.out.println(i);
//			i++; // �������̶���� while���� ������ �ϴϱ� ���� ������ �ž� ��
//			
//		}
		
		int sum = IntStream.rangeClosed(1, 10).reduce(0, (acc, val) -> acc + val);
		
		System.out.println(sum);
		
		// 1 ~ 10������ �� ���ϱ�
//		int sum = 0;
//		int i = 1;
		
//		while(i <= 10) {
//			sum += i;
//			i++;
//		}
//		
//		System.out.println(sum);
		
//		do-while
//		while���� ���� ��ó���� ������
//		do-while���� ��ó�� �ĺ񱳸� �ϱ� ������ ������ do ������ �ҽ��� �� �� �����Ѵ�
//		��� �� �����ϰ� �ڿ� �����ݷ��� �ٿ��� �Ѵ�.
//		
		
//		�⺻��
//		do {
//			
//		}while(���ǽ�); // ������ �����ݷ� ���ϴ� ����
		
		
		
	}
}
