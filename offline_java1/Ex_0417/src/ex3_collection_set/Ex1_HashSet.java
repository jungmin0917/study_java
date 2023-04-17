package ex3_collection_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Ex1_HashSet {
	public static void main(String[] args) {
		
		// �÷��� (Collection) : java.util ��Ű���� �������̽�
		// �迭�� ������ �����Ͽ� index ������ ������ ���� ���� ��ü�� �ٷ�� ���� ����ϴ� ���α׷��� ���
		
		// ���� �迭�� ������ ó���� ��ü�� ���� �� ���� ������ ������ �־���.
		
		// List, Set, Map, Queue, Deque �������̽� ���� �ִ�.
		// ������ �������̽��ʹ� �ٸ��� �ش� ������ ��ü�� ����� �� ������ �����ؼ� ����� �ʿ䰡 ����.
		
		// Set �������̽��� ������ �ڽ� Ŭ����
		// HashSet, TreeSet
		
		// Set �������̽��� �ߺ��� ������� �ʴ� �������� ������ �ٷ��.
		
		HashSet<String> hs1 = new HashSet<>();
		
		// HashSet�� �����͸� �߰��ϴ� ���
		hs1.add("a");
		hs1.add("b");
		hs1.add("f");
		hs1.add("d");
		
//		System.out.println(hs1);

		hs1.add("f");
		hs1.add("d");

//		System.out.println(hs1); // ������ ������ �����͸� �߰��߱� ������ ���뿡 ��ȭ�� ����.
		
		// HashSet�� ũ�� ����
		int size = hs1.size();
//		System.out.println("set�� ũ�� : " + size);
		
		// HashSet�� ����Ǿ� �ִ� ������ �����ϱ�
//		hs1.remove("a"); // ������ 1�� ����
//		hs1.clear(); // ������ ��ü ����
		hs1.removeAll(hs1); // set�� ��� ���� ����
		
		// HashSet�� �ε��� ��ȣ�� ������ �ʴ´�.
		
//		System.out.println(hs1);
//		System.out.println(hs1.size());
		
		// HashSet�� �ߺ��Ǵ� ���� ���� �ʱ� ������ ���� �����ϱⰡ ���ϴ�.
		// ���� ��� �ζ� ��ȣ 6���� ���� �� ���� �ʿ� ���� ũ�Ⱑ 6�� �� ������ �ݺ��ؼ� ���� �����ϸ� ��.
	
		// �ζ� ��ȣ ������
		HashSet<Integer> hs2 = new HashSet<>();
		
		while(hs2.size() < 6) {
			Random rand = new Random();
			
			int n = rand.nextInt(1, 45);
			
			hs2.add(n);
		}
		
		List<Integer> list = new ArrayList<>(hs2); // HashSet�� List�� ��ȯ
		
		Collections.sort(list);
		
		System.out.println("�ζ� ��ȣ : " + list);
	}
}








