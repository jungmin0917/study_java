package ex7_Scanner;

import java.util.Scanner; // �ʿ��� ���̺귯���� ����Ʈ�ؾ� �Ѵ�

public class Ex1_Scanner {
	public static void main(String[] args) {
//		Scanner : ����ڷκ��� �Է��� �޴� Ŭ���� (java.util ������ ����)
//		�پ��� �Է� �ҽ����� �����͸� �о���̱� ���� Ŭ�����̴�
//		���� �μ��� System.in�� ����, �̰��� ǥ�� �Է� ��Ʈ������, ����ڰ� Ű����� �Է��� �����͸� �о����
//		System.in �� �ƴ϶� ���Ͽ����� ���� �� �ְ� ���� �Է� ����� �ִ�.
		
		try {
			Scanner sc = new Scanner(System.in); // ǥ�� �Է� ��Ʈ�� Scanner ��ü�� ������
			
//			Scanner Ŭ������ �پ��� �޼ҵ尡 �ִ�.
//			next(), nextLine(), nextInt(), nextDouble() �޼ҵ尡 ���� ���δ�.
			
			System.out.print("������ �Է����ּ��� : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			System.out.printf("�Է��Ͻ� ������ %d�Դϴ�\n", num);

			System.out.print("�̸��� �Է����ּ��� : ");
			String name = sc.nextLine();
			
			System.out.printf("�Է��Ͻ� �̸��� %s�Դϴ�\n", name);
			
			sc.close();
		} catch (Exception e) {
			System.out.println("����� �Է����ּ���");
		}
	}
}
