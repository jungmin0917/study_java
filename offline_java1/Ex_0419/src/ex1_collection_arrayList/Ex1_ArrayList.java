package ex1_collection_arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex1_ArrayList {
	public static void main(String[] args) {
		
		// ArrayList : index 개수 제한 없이 값을 추가하거나 제거하는 용도의 클래스
		// 중복된 값을 가질 수 있다 (하지만 중복된 키는 당연히 안 된다)
		// index 번호를 가지고 있다.
		
		// 배열은 처음 생성할 때 크기를 정해놓지만, List 자료구조는 아니다
		// 사이즈를 유동적으로 구성할 수 있다는 점이 가장 매력적인 자료구조이다
		
		// 생성 시 어떤 자료형을 넣을지 미리 정해줘야 함
		ArrayList<Integer> list = new ArrayList<>();
		
		// 대표적인 메소드로는 add(value), add(index, value), get(index), remove(index), size(), clear(), indexOf(), set(index, value) 등이 있다.
		
		// List에 값 추가하기
		list.add(100);
		list.add(200);
		list.add(100);
		
		System.out.println(list);
		
		// List의 크기
		System.out.println("리스트의 크기 : " + list.size());

		// List에서 하나의 값 꺼내오기
		System.out.println(list.get(2)); // 2번 인덱스의 값을 꺼내옴
		
		// List에서 for문 사용하여 값 꺼내기
		System.out.println("for문 사용");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// List에서 순회하면서 값 꺼내기
		// 개선된 for문으로서, index에 직접적인 접근이 불가능하기 때문에 해당 인덱스에 대한 수정, 삭제가 불가능함.
		System.out.println("foreach 사용");
		for (Integer i : list) {
			System.out.println(i);
		}
		
		// 아래 방법으로도 가능
		System.out.println("Iterator 사용");
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}









