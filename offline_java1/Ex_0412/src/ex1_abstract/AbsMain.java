package ex1_abstract;

public class AbsMain {
	public static void main(String[] args) {
		// �Ϲ����� ������δ� �߻�Ŭ������ ��üȭ��ų �� ����
//		AbsParent ap = new AbsParent();
		
		// �׷��� �߻�Ŭ������ ��ӹ޾� ������ �ڽ� Ŭ������ ��üȭ�Ͽ� ����ϰų� �Ѵ�.
		// �߻�Ŭ������ �ڽ��� ����� �ڽ��� �ϼ���Ű���� ���Ǻ� ����Ͽ� �ڽ�Ŭ������ ������ �� ��üȭ�ȴ�.
		AbsChild ac = new AbsChild();

		ac.setValue(20);
		
		System.out.println(ac.getValue());
	}
}
