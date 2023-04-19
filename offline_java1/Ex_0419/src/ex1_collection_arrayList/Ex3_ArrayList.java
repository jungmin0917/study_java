package ex1_collection_arrayList;

import java.util.ArrayList;

public class Ex3_ArrayList {
	public static void main(String[] args) {
		
//		ArrayList<String> name = new ArrayList<>(); // 이름 저장
//		ArrayList<Integer> age = new ArrayList<>(); // 나이 저장
//		
//		name.add("홍길동");
//		age.add(30);
		
		// 보통 위와 같이 안 하고 VO 객체로 처리함
		
		// VO, DTO 객체 등을 저장할 수 있기 때문에 데이터 저장 및 전송에 아주 용이함
		ArrayList<PersonVO> list = new ArrayList<>();

		PersonVO p1 = new PersonVO();
		p1.setName("홍길동");
		p1.setAge(30);

		PersonVO p2 = new PersonVO();
		p2.setName("황정민");
		p2.setAge(20);
		
		list.add(p1); // index 0
		list.add(p2); // index 1
		
		// p1 객체의 주소를 list 0번 인덱스와 공유함
		// p2 객체의 주소를 list 1번 인덱스와 공유함
				
		System.out.println(list);
	}
}








