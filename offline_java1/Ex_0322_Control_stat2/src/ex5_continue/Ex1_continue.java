package ex5_continue;

public class Ex1_continue {
	public static void main(String[] args) {
		
//		�ݺ��� ������ continue�� ������ ���� ������ �ִ� �ݺ����� ���� �������� �Ѿ��
//		continue�� : �ݺ��� ������ Ư�� ������ �ǳʶٰ��� �� �� ���
		
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 5; j++) {
				
				if(j % 2 == 0) {
					continue;
				}
				
				System.out.print(j + " ");				
			}
			
			System.out.println();
		}
		
//		��Ÿ����� Ư¡
//		�ݺ��� �ȿ��� ����� �ȴ�.
//		break, continue�� �ؿ��� ��� �ڵ嵵 �� �� ����.
		
		
	}
}
