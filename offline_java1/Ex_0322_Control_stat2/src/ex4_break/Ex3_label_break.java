package ex4_break;

public class Ex3_label_break {
	public static void main(String[] args) {
//		label : Ư�� �ݺ����� �̸�ǥ�� �ٿ� �� �� �̻��� �ݺ����� ������ �� �ֵ��� �ϴ� Ű����
		
//		label�� �׻� ������ �����Ѵ�.
//		label�� �̸��� �ڱⰡ ���ϴ� ��� ����� �����ϴ�.
//		label�� �ڽ��� �����ϰ� �ִ� ���� ���信�Ը� �� �� �ִ�.
		
//		switch���̳� �ݺ��� �տ� ���� �� ����
		
//		�󺧸�: �ݺ��� �Ǵ� switch��
		for1: for (int i = 1; i <= 3; i++) { // for1�̶�� ���� ����
			for (int j = 1; j <= 10; j++) {
				System.out.print(j + " ");
//				break for1; // �̷� ������ ������ �ݺ����� �������� �� �ִ�.
			}
			
			for (int j = 1; j <= 10; j++) {
				if(j % 2 == 0) {
					break for1;
				}
				
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
	}
}
