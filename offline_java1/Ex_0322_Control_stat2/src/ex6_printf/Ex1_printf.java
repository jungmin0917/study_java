package ex6_printf;

public class Ex1_printf {
	public static void main(String[] args) {
		
//		int a = 20;
//		int b = 10;
//		
//		System.out.printf("%d + %d = %d", a, b, a + b);
		
//		printf : ���ڿ��� ������ ����ִ� �����͸� ���ϰ� ����� �� �ֵ��� �����ִ� ���� ����
//		printf�� f�� format�̶�� ��
		
//		���� ������
//		%d : ������
//		%c : ������
//		%s : ���ڿ�
//		%f : �Ǽ���
		
		int age = 30;
		
//		System.out.printf("���� ���̴� %d�� �Դϴ�\n", age);
//		
//		System.out.printf("���� ���̴� %d���̰� Ű�� %dcm�Դϴ�\n", 30, 175);
//		
//		// �������� 3.141592�Դϴ�
//		
//		System.out.printf("�������� %.6f�Դϴ�", Math.PI);
		
		for (int i = 1; i <= 12; i++) {
			System.out.printf("%3d", i);
		        
	        if(i % 4 == 0){
	            System.out.println();
	        }
		}
		
		
	}
}
