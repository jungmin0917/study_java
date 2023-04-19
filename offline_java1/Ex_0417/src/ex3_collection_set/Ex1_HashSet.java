package ex3_collection_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.function.IntFunction;

public class Ex1_HashSet {
	public static void main(String[] args) {
		
		// 컬렉션 (Collection) : java.util 패키지의 인터페이스
		// 배열의 단점을 보완하여 index 개수가 정해져 있지 않은 객체를 다루기 위해 사용하는 프로그래밍 방식
		
		// 기존 배열의 단점은 처음에 객체를 만들 때 방의 개수가 정해져 있었다.
		
		// List, Set, Map, Queue, Deque 인터페이스 등이 있다.
		// 기존의 인터페이스와는 다르게 해당 내부의 객체를 사용할 때 일일이 구현해서 사용할 필요가 없다.
		
		// Set 인터페이스를 구현한 자식 클래스
		// HashSet, TreeSet
		
		// Set 인터페이스는 중복을 허용하지 않는 데이터의 집합을 다룬다.
		
		HashSet<String> hs1 = new HashSet<>();
		
		// HashSet에 데이터를 추가하는 방법
		hs1.add("a");
		hs1.add("b");
		hs1.add("f");
		hs1.add("d");
		
//		System.out.println(hs1);

		hs1.add("f");
		hs1.add("d");

//		System.out.println(hs1); // 위에서 동일한 데이터를 추가했기 때문에 내용에 변화가 없다.
		
		// HashSet의 크기 측정
		int size = hs1.size();
//		System.out.println("set의 크기 : " + size);
		
		// HashSet에 저장되어 있는 데이터 제거하기
//		hs1.remove("a"); // 데이터 1개 제거
//		hs1.clear(); // 데이터 전체 제거
		hs1.removeAll(hs1); // set의 모든 내용 제거
		
		// HashSet은 인덱스 번호를 가지지 않는다.
		
//		System.out.println(hs1);
//		System.out.println(hs1.size());
		
		// HashSet은 중복되는 값이 들어가지 않기 때문에 난수 생성하기가 편하다.
		// 예를 들어 로또 번호 6개를 생성 시 비교할 필요 없이 크기가 6이 될 때까지 반복해서 난수 생성하면 됨.
	
//		// 로또 번호 생성기
//		HashSet<Integer> hs2 = new HashSet<>();
//		
//		while(hs2.size() < 6) {
//			Random rand = new Random();
//			
//			int n = rand.nextInt(1, 45);
//			
//			hs2.add(n);
//		}
//		
//		List<Integer> list = new ArrayList<>(hs2); // HashSet을 List로 변환
//		
//		Collections.sort(list);
//		
//		System.out.println("로또 번호 : " + list);
		
		
		
		int arr[] = {1, 1, 2, 2, 2, 3, 3}; // 예를 들어 이런 배열이 있다고 하면
		// 중복값을 걸러낼 때 뭐 메소드를 사용해도 되지만, 이를 Set 자료구조로 넣으면 알아서 중복값이 사라지게 된다
		
		HashSet<Integer> hs3 = new HashSet<>();
		
		for (int i : arr) {
			hs3.add(i);
		}
		
		System.out.println(hs3);
		
		// new Integer[0] : set이 add해둔 요소의 개수만큼 자동으로 배열의 index가 생성된다.
		// 즉 해당 Set의 size만큼 배열의 index가 생성된다.
		Integer[] arr2 = hs3.toArray(new Integer[0]);
		for (int i : arr2) {
			System.out.println(i + " ");
		}
	}
}








