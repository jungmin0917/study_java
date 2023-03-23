package ex1_single_for;

import java.util.stream.IntStream;

public class Ex1_single_for {
	public static void main(String[] args) {
		
		// �ݺ���
		// Ư�� ����� ���ϴ� ��ŭ �ݺ� �����ϴ� ���
		// for, while
		
		// �⺻��
		
//		for(�ʱ��; ���ǽ�; ������) {
//			���ǽ��� ���� �� �ݺ��� ��� 
//		}
		
		// �ʱ�� : �ݺ��� �ϱ� ���� ���۰�
		// �ʱ�Ŀ� ����� ������ �ϳ� �ʱ�ȭ�Ѵ�.
		// ���ǽ� : �ݺ��� �ϱ� ���� ���ᰪ. �񱳿����ڸ� ���� ����Ѵ�.
		// ������ : ������ ���� ���������ִ� ������ �Ѵ�. ���������ڸ� ���� ����Ѵ�.
		
//		for(int i=0; i<3; i++) {
//			System.out.println(i);
//		}
		
		// 1 ~ 10���� �ֿܼ� ���
		
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
		
		// �Ʒ��� ���ٽ��� �̿��� �ڵ��̴�
//		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		// IntStream
		
		// Stream API�� ���� ������, �������� ���� ������, ���� ó���� �����ؼ� ���� ����� �����ϴ�.
		
		// Stream�� iterable�� ������ �ڷᱸ�� (�÷���, �迭 ��)�� �ڷ���� �Լ��� ���α׷������� ó���ϴ� ����� �����Ѵ�
		// �� �� IntStream�� int���� �ڷ���� Stream���� ó���� �� �ִ�

//		for (int i = 10; i > 0; i--) {
//			System.out.println(i);
//		}
		
//		IntStream.rangeClosed(1, 10).forEach(num -> {
//			if(num % 3 == 0) {
//				System.out.println(num);
//			}
//		});
		
		// �Ʒ��� ���̴� �� �ȴ�. ���ٽ� �ȿ����� ���ٽ� ���� ������ ���� ���� ������, �����ϴ� ���� �Ұ����ϴ�.
//		String res = "";
//		IntStream.rangeClosed(1, 10).forEach(v -> {
//			res += v % 3 == 0?v+"":"";
//		});
		
//		IntStream.rangeClosed(1, 20).forEach(v -> {
//			if(v % 2 == 1) {
//				System.out.println(v);
//			}
//		});
		
		// 1 ~ 10���� ���� ���ϱ�
//		int n = 10;
//		System.out.println((n * (n+1)) / 2);
//		
//		int sum = 0;
//		
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		
//		System.out.println(sum);
		
		int n = 4;
		
		IntStream.rangeClosed(1, 9).forEach(v -> {
			System.out.println(String.format("%d * %d = %d", n, v, n * v));
		});
		
		
	}
}
