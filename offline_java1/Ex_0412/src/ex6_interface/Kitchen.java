package ex6_interface;

// �ϳ��� Ŭ������ ���� �������̽��� ��ӹ��� �� �ִ�
public class Kitchen implements Menu1{ // Menu1�� 2, 3�� ��ӹ޾ұ� ������ 1�� ��ӹ޾Ƶ� �ȴ�.
	
	@Override
	public String jajang() {
		return "��� + ���� + ��";
	}
	
	@Override
	public String tangsuyook() {
		// TODO Auto-generated method stub
		return "������� + ��� + ����";
	}
	
	@Override
	public String bokkeumbab() {
		// TODO Auto-generated method stub
		return "�߸� + ���� + �ϵ���";
	}
	
	@Override
	public String jambbong() {
		return "�߸� + ȫ�� + û��ä";
	}
}
