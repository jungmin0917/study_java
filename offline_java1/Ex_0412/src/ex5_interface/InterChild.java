package ex5_interface;

// ����� �ƴϰ� ������ �Ѵ� (implements Ű���带 �����)
public class InterChild implements InterTest{
	
	// �翬�� �߻� �޼ҵ� �����ؾ� �Ѵ�.
	@Override
	public int getNum() {
		return NUM; // InterTest�� ��� ��ȯ
	}
}
