package ex1_collection_map;

import java.util.HashMap;

public class MapEx1 {
	public static void main(String[] args) {
		
		// Map�� ������ Ű(Key)���� ��(Value)�� �ϳ��� �����ͷ� �����
		// Map�� ������ Key�� ���ؼ� Value�� �˻��س��Ƿ� ���� ���� ������ �ȿ���
		// ��ȸ�ϴ� ���� �־ �ſ� �پ ������ �����Ѵ�.
		
		// Map�� �����ϰ� �ִ� �ڽ� Ŭ���� �� ���� ���� ����ϴ� Ŭ������ HashMap�̴�
		// �Ʒ��� ���� ���� �⺻ �����̰�, Ű���� ���� �ڷ����� �����־�� �Ѵ�. (�翬�� ���� Ŭ������)
//		HashMap<K, V> map = new HashMap<>();
		
		HashMap<Integer, Character> map = new HashMap<>();
		
		// Set�� add, remove ���� �޼ҵ尡 �־����� 
		// put(key, value), get(key), remove(key), containsKey(key) ���� �޼ҵ尡 �ִ�.
		
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(3, 'C');
		
		map.put(4, 'A');
		
		// Map�� Ű���� �ߺ��� �� �� ����, Value���� �ߺ��� �����ϴ�.
		
		// �̹� �ִ� Key���� �� ���� ������ �� ������ ��ü�ȴ�
		map.put(1, 'B');
		
		// Map���� ������ �����ϱ�
		map.remove(1);
		
		// Map�� ũ�� Ȯ��
		System.out.println("map�� ũ�� : " + map.size());
		
		// Map���� �ϳ� ������ (�ش� Ű�� �ش��ϴ� ���� ������ null�� ��ȯ)
		System.out.println("Ű���� 2�� �� : " + map.get(2));
		
		System.out.println(map);
	}
}
