package ex1_abstract;

// �߻� �޼��带 �ϳ��� ���������Ƿ� �߻�Ŭ������ ��������� �Ѵ� (abstract Ű����)
abstract public class AbsParent {
	int value = 100;

	// �Ϲ� �޼���
	public int getValue() {
		return value;
	}
	
	// �߻� �޼���� �߰�ȣ �κ�(body)�� ���� ������ �̿ϼ����̴�.
//	public void setValue(int n); // �߻� �޼���
	
	// �߻� �޼���� �տ� �߻� �޼������� ǥ���ϴ� Ű���� abstract�� �����־�� �Ѵ�.
	abstract public void setValue(int n);
	
	// �׷��Ƿ� �ڽ� Ŭ������ �̰��� ��ӹ޾Ƽ� �ݵ�� �ش� �߻� �޼ҵ带 �����ؼ� ��� �Ѵ�.
}
