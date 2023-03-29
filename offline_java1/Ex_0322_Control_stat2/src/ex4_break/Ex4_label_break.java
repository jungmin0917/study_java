package ex4_break;

public class Ex4_label_break {
	public static void main(String[] args) {
		
//		int n = 0;
//		
//		outer: while(true) {
//			if(n > 10) {
//				break;
//			}
//
//			while(true) {
//				n++;
//				if(n % 3 == 0) {
//					System.out.println("continue�� ����");
//					continue outer;
//				}
//				
//				System.out.println(n);
//			}
//		}
		
		// �ݺ��� �ȿ��� ���� ����ġ�� break�� ��� �ɱ�
		
		int n = 0;
		
		while(n < 10) {
			n++;
			
			outer: switch(n) {
				case 1:
					System.out.println("switch�� 1�� ���İ�");
					break; // �翬������, �ش� break�� switch���� break�̴�
				case 2:
					System.out.println("switch�� 2�� ���İ�");
					// switch���� �ܵ����� ����� ���� continue�� ����� �� ����.
					continue; // �� continue�� �� while���� ���� continue�̴�;
			}
			
			System.out.println(n);
		}
	}
}
