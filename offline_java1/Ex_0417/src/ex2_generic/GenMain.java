package ex2_generic;

public class GenMain {
	public static void main(String[] args) {
		
		Integer[] array1 = new Integer[] {1, 2, 3, 4, 5};
		Double[] array2 = new Double[] {1.1, 2.2, 3.3, 4.4, 5.5};
		Character[] array3 = new Character[] {'A', 'B', 'C', 'D', 'E'};

		Gen g = new Gen();
		
		// �Ʒ��� ���� �����ϸ� printArr �޼ҵ� �ʿ��� �˾Ƽ� ���׸� Ÿ���� �迭�� �޾Ƽ� �پ��� Ÿ������ ó���� ���� �ִ�
		// ���׸��� ���� �̷����� �پ��� Ÿ���� ó���� �� ���� �� ���� �ִ�
		g.printArr(array1);
		g.printArr(array2);
		g.printArr(array3);
	}
}
