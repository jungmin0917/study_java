package ex3_collection_set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


public class Ex2_TreeSet {
	public static void main(String[] args) {
		
		// TreeSet�� ���� Ž�� Ʈ�� �� ������ ����Ų ����-�� Ʈ���� �����Ǿ� �ִ�.
		// ����-�� Ʈ���� �θ� ��庸�� ���� ���� ������ ���� ���� �ڽ�����, ū ���� ������ �ڽ��� ������ �ڽ����� ��ġ�Ͽ�
		// �������� �߰��� ���� �� Ʈ���� �������� ġ�������� �ʵ��� ������ �����ش�.
		
		TreeSet<Integer> set1 = new TreeSet<>();
//		TreeSet<Integer> set2 = new TreeSet<>(set1);
		
		// TreeSet�� �� �߰�
		set1.add(7);
		set1.add(4);
		set1.add(9);
		set1.add(1);
		set1.add(5);
		
		// ���� �� ������ Ʈ������ ���ؼ� �θ𺸴� ũ�� ������, �θ𺸴� ������ �������� ��
		
		System.out.println(set1); // ��ü ���
		
		System.out.println(set1.first()); // �ּҰ� ���
		System.out.println(set1.last()); // �ִ밪 ���
		System.out.println(set1.higher(3)); // �Է°����� ū ������ �� �ּҰ�, ������ null
		System.out.println(set1.higher(10)); // ��� null ��ȯ��
		System.out.println(set1.lower(2)); // �Է°����� ���� ������ �� �ִ밪, ������ null
		
		// Comparator ��ü ����
//		Comparator<Integer> reverseComparator = Comparator.reverseOrder();
//		TreeSet<Integer> descendingSet = new TreeSet<>(reverseComparator);
		
//		System.out.println(descendingSet);
		
		Iterator<Integer> iter = set1.iterator(); 
		while(iter.hasNext()) {
			System.out.println(iter.next() + " ");
		}
	}
}
