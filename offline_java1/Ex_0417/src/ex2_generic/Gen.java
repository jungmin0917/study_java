package ex2_generic;

// Gen Ŭ���� ����� ���׸� Ÿ�� T�� ���� printArr �޼��带 �����Ѵ�.
// printArr ���ο��� �迭�� ���������� ����ϴ� �ڵ� �ۼ�

// Main Ŭ���� ���� Integer[], Double[], Character[]�� ���� ��
// Gen Ŭ������ printArr �޼��带 ���� ȣ���Ͽ� �迭 ������ ���

// ���
// 1 2 3 4 5
// 1.1, 2.2, 3.3, 4.4, 5.5
// A B C D E

public class Gen {
	public <T> void printArr(T[] array) {
		for (T t : array) {
			System.out.print(t + " ");
		}
		System.out.println();
	}
}
