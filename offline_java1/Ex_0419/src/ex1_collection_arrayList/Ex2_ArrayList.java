package ex1_collection_arrayList;

import java.util.ArrayList;

public class Ex2_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10); // �ε��� 0������ ���ʴ�� ������
		list.add(10);
		
		System.out.println(list.get(1));

		// set�� �ƴ� add�� ���� ��, ���� 0��, 1�� �ε��� ������ ������ ����
		// 1�� �ε����� ���� ������ �ε������� �ϳ��� ���������� �и�
		// ��, ���⼭ 10, 20, 10�� �Ǵ� ���� (������ 10�� ���������� �� ĭ �и�)
		list.add(1, 20); // 1�� �ε����� 20 ����
		
		// �ش� �ε����� ���� �ٲٰ� �ʹٸ� set()�� ����ؾ� ��
		list.set(2, 30); // �ش� �ε����� ���� ����
		
		// �ε����� ���� �ʰ� �⺻������ add�� �ϸ� �ش� list�� �� �ڿ� �߰���.
		
		// �ش� �ε����� ���� ����� �޼ҵ�
		// �߰� �ε����� ���� ����� ���� �ε������� ������ �������.
		list.remove(1);
		
		System.out.println("1�� �ε����� �� : " + list.get(1));

		// �ش� ���� ������ �ִ� ���� ���� �ε����� ��ȯ (������ -1�� ��ȯ��)
		System.out.println("30�̶�� ���� ���� �ε��� : " + list.indexOf(30));
		
		// �ش� list�� ���� ���� �޼ҵ�
		list.clear();
		
		// �ش� list�� ������� Ȯ���ϴ� �޼ҵ�
		System.out.println(list.isEmpty() ? "list�� ������ϴ�" : "list�� ���� �ʾҽ��ϴ�");
		
		
	}
}








