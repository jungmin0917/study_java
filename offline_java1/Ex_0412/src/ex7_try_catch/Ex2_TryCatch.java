package ex7_try_catch;

public class Ex2_TryCatch {
	public static void main(String[] args) {
		
		int res = 0;
		int[] arr = new int[2];
		
		try {
//			res = 10 / 0;
			arr[2] = 10;
		} catch (ArithmeticException e) {
			System.out.println("������ 0���� ���� �� �����ϴ�");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�������� �ʴ� index���� �����Դϴ�");
		} finally {
			// try ���������� ���� �߻� ���ο� ���� ���� ������ ������ �κ�
			
			System.out.println("finally");
		}
	}
}
