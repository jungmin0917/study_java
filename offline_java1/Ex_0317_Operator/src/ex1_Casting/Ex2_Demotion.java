package ex1_Casting;

public class Ex2_Demotion {
	public static void main(String[] args) {
		
		// ���� ����ȯ (����� ����ȯ) : ū �ڷḦ ���� �ڷ����� ����
		
		char c = 'B'; // 2byte
		int n = c + 1; // ������ ����ȯ (���� �ڷḦ ū �ڷῡ �־����Ƿ�)
		
		c = (char)n; // ū �����͸� ���� �ڷ����� �ְ� �ʹٸ� ����ȯ�� �ؼ� ������ ����
		
		float f = 5.5f;
		
		int n1 = 0;
		n1 = (int)f; // int�� float�� ���� 4����Ʈ���� �ڷ����� ��ġ���� �ʾ� ������ ���� �ʴ´�
//		int�� ���� �ڷ����̰�, float�� �Ǽ� �ڷ����̱� �����̴�.
//		�׷��� ���� ���� ����� ����ȯ�� ����� �Ѵ�
		
//		float���� int�� ����� ����ȯ�� �ϸ� �Ǽ��δ� ������ �ȴ�
		
//		System.out.println(n1);
		
		byte b1 = 100;
		byte b2 = 20;
//		byte b3 = b1 + b2; // ��ġ�� �ʴµ��� ������ ��
		// �ڹٴ� b1 + b2 ���� �� �� ����� 127�� ���� �ʴ��� int���� �ǵ��� ���踦 ����
		byte b3 = (byte)(b1 + b2);
		
		System.out.println(b3);
	}
}
