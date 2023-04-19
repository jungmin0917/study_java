package ex1_collection_arrayList;

import java.util.ArrayList;

public class Ex2_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10); // 인덱스 0번부터 차례대로 대입함
		list.add(10);
		
		System.out.println(list.get(1));

		// set이 아닌 add로 했을 때, 기존 0번, 1번 인덱스 사이의 연결을 끊고
		// 1번 인덱스가 들어가고 오른쪽 인덱스들이 하나씩 오른쪽으로 밀림
		// 즉, 여기서 10, 20, 10이 되는 것임 (기존의 10이 오른쪽으로 한 칸 밀림)
		list.add(1, 20); // 1번 인덱스에 20 대입
		
		// 해당 인덱스의 값을 바꾸고 싶다면 set()을 사용해야 함
		list.set(2, 30); // 해당 인덱스의 값을 변경
		
		// 인덱스를 주지 않고 기본적으로 add를 하면 해당 list의 맨 뒤에 추가됨.
		
		// 해당 인덱스의 값을 지우는 메소드
		// 중간 인덱스의 값을 지우면 뒤의 인덱스들이 앞으로 당겨진다.
		list.remove(1);
		
		System.out.println("1번 인덱스의 값 : " + list.get(1));

		// 해당 값을 가지고 있는 가장 앞의 인덱스를 반환 (없으면 -1을 반환함)
		System.out.println("30이라는 값을 가진 인덱스 : " + list.indexOf(30));
		
		// 해당 list를 전부 비우는 메소드
		list.clear();
		
		// 해당 list가 비었는지 확인하는 메소드
		System.out.println(list.isEmpty() ? "list는 비었습니다" : "list는 비지 않았습니다");
		
		
	}
}








