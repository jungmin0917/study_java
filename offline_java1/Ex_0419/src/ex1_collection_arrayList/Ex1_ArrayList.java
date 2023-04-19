package ex1_collection_arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex1_ArrayList {
	public static void main(String[] args) {
		
		// ArrayList : index ���� ���� ���� ���� �߰��ϰų� �����ϴ� �뵵�� Ŭ����
		// �ߺ��� ���� ���� �� �ִ� (������ �ߺ��� Ű�� �翬�� �� �ȴ�)
		// index ��ȣ�� ������ �ִ�.
		
		// �迭�� ó�� ������ �� ũ�⸦ ���س�����, List �ڷᱸ���� �ƴϴ�
		// ����� ���������� ������ �� �ִٴ� ���� ���� �ŷ����� �ڷᱸ���̴�
		
		// ���� �� � �ڷ����� ������ �̸� ������� ��
		ArrayList<Integer> list = new ArrayList<>();
		
		// ��ǥ���� �޼ҵ�δ� add(value), add(index, value), get(index), remove(index), size(), clear(), indexOf(), set(index, value) ���� �ִ�.
		
		// List�� �� �߰��ϱ�
		list.add(100);
		list.add(200);
		list.add(100);
		
		System.out.println(list);
		
		// List�� ũ��
		System.out.println("����Ʈ�� ũ�� : " + list.size());

		// List���� �ϳ��� �� ��������
		System.out.println(list.get(2)); // 2�� �ε����� ���� ������
		
		// List���� for�� ����Ͽ� �� ������
		System.out.println("for�� ���");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// List���� ��ȸ�ϸ鼭 �� ������
		// ������ for�����μ�, index�� �������� ������ �Ұ����ϱ� ������ �ش� �ε����� ���� ����, ������ �Ұ�����.
		System.out.println("foreach ���");
		for (Integer i : list) {
			System.out.println(i);
		}
		
		// �Ʒ� ������ε� ����
		System.out.println("Iterator ���");
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}









