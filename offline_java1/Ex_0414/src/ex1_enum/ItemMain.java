package ex1_enum;

public class ItemMain {
	public static void main(String[] args) {
		
//		�������� �����ڸ� �ܺο��� ȣ���ϴ� ���� �Ұ����ϴ�.
//		Item item = new Item();
		
//		for�� �̿��Ͽ� �������� ��ü ���� ����ϱ�
		
		Item[] items = Item.values(); // ���⼭ values �޼ҵ�� static�̱� ������ ��üȭ���� �ʾƵ� ����� �� �ִ�

//		���� for�� (�ݺ� ������ ��ü�� ��ȸ�ϸ鼭 ó����)
//		for(�ڷ��� ��ȯ�� : ��ü��){ }
		for(Item item : items) {
			System.out.printf("�����۸� : %s, itemStr : %s, sign : %d\n", item.name(), item.getItemStr(), item.getSign());
		}
	}
}
