package ex3_collection_set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


public class Ex2_TreeSet {
	public static void main(String[] args) {
		
		// TreeSet은 이진 탐색 트리 중 성능을 향상시킨 레드-블랙 트리로 구현되어 있다.
		// 레드-블랙 트리는 부모 노드보다 작은 값을 가지는 노드는 왼쪽 자식으로, 큰 값을 가지는 자식은 오른쪽 자식으로 배치하여
		// 데이터의 추가나 삭제 시 트리가 한쪽으로 치우쳐지지 않도록 균형을 맞춰준다.
		
		TreeSet<Integer> set1 = new TreeSet<>();
//		TreeSet<Integer> set2 = new TreeSet<>(set1);
		
		// TreeSet에 값 추가
		set1.add(7);
		set1.add(4);
		set1.add(9);
		set1.add(1);
		set1.add(5);
		
		// 넣을 때 맨위의 트리부터 비교해서 부모보다 크면 오른쪽, 부모보다 작으면 왼쪽으로 감
		
		System.out.println(set1); // 전체 출력
		
		System.out.println(set1.first()); // 최소값 출력
		System.out.println(set1.last()); // 최대값 출력
		System.out.println(set1.higher(3)); // 입력값보다 큰 데이터 중 최소값, 없으면 null
		System.out.println(set1.higher(10)); // 없어서 null 반환함
		System.out.println(set1.lower(2)); // 입력값보다 작은 데이터 중 최대값, 없으면 null
		
		// Comparator 객체 생성
//		Comparator<Integer> reverseComparator = Comparator.reverseOrder();
//		TreeSet<Integer> descendingSet = new TreeSet<>(reverseComparator);
		
//		System.out.println(descendingSet);
		
		Iterator<Integer> iter = set1.iterator(); 
		while(iter.hasNext()) {
			System.out.println(iter.next() + " ");
		}
	}
}
