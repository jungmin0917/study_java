package ex1_collection_arrayList;

import java.util.ArrayList;

public class Ex3_ArrayList {
	public static void main(String[] args) {
		
//		ArrayList<String> name = new ArrayList<>(); // �̸� ����
//		ArrayList<Integer> age = new ArrayList<>(); // ���� ����
//		
//		name.add("ȫ�浿");
//		age.add(30);
		
		// ���� ���� ���� �� �ϰ� VO ��ü�� ó����
		
		// VO, DTO ��ü ���� ������ �� �ֱ� ������ ������ ���� �� ���ۿ� ���� ������
		ArrayList<PersonVO> list = new ArrayList<>();

		PersonVO p1 = new PersonVO();
		p1.setName("ȫ�浿");
		p1.setAge(30);

		PersonVO p2 = new PersonVO();
		p2.setName("Ȳ����");
		p2.setAge(20);
		
		list.add(p1); // index 0
		list.add(p2); // index 1
		
		// p1 ��ü�� �ּҸ� list 0�� �ε����� ������
		// p2 ��ü�� �ּҸ� list 1�� �ε����� ������
				
		System.out.println(list);
	}
}








