package ex1_abstract;

// �߻� Ŭ������ ��ӹ޾����� �ݵ�� �ش� �߻� Ŭ���� ���� �߻� �޼ҵ���� �����Ͽ��� �Ѵ�.
public class AbsChild extends AbsParent{
	
	// setValue�� �߻� �޼����̹Ƿ� �ڽ� Ŭ�������� �������̵� �Ͽ� ����Ѵ�.
	@Override
	public void setValue(int n) {
		this.value = n;
		System.out.println("�߻�޼��� ������");
	}

	
}
