package ex7_try_catch;

public class Ex1_TryCatch {
	public static void main(String[] args) {
		// �ڹٿ��� ���α׷��� ����Ǵ� ���� ���� (����, ����, ����)�� �߻��ϸ�, �Ϲ������� �� �������� ���α׷��� ����ȴ�.
		// ������ ���� ������ ������ �ְų�, ������ �߻��ϴ��� �̸� �����ϰ� ������ �۾��� �����ؾ� �� ��찡 �ִ�.
		// ���� ó���� ���� ���α׷��� ���������� ���Ḧ �ٿ�����
		
		// ���� ������ ���� : Ű���忡�� ���� ���� �� ���ϴ� Ÿ���� �ƴ� �ٸ� Ÿ������ ������ ���� ����
		
		// ���� ����
		int result = 0;
		char[] arr = new char[3];
		
		// try �ȿ��� ������ ������ �ڵ� ���ַ� ���� ���� ����
		try {
			result = 10 / 0; // ArithmeticException
			arr[3] = 'A'; // ArrayIndexOutOfBoundsException
		}catch(ArithmeticException e) {
			System.out.println("������ 0���� ���� �� �����ϴ�");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �濡 ���� ���� �� �����ϴ�");
		}catch (Exception e) {
			System.out.println("��Ÿ ������ �߻��߽��ϴ�");
		}
	}
}
