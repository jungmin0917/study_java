package day25;

import java.util.ArrayList;

public class ArrayListTest2 {
	public static void main(String[] args) {
		
//		Person person1 = new Person();
//		Person person2 = new Person("jungmin", 30);
//		
//		System.out.println(person1);
//		System.out.println(person2);
		
//		<> 안에는 클래스명이나 인터페이스명이 와야 한다
//		예를 들어, 해당 <> 안에 Person이라는 클래스의 클래스명을 적으면, Person 클래스를 저장할 수 있는 ArrayList 객체를 생성하는 것이다.
		ArrayList<Person> list = new ArrayList<>();
		
//		아래와 같이 Person을 생성하면서 넣을 수 있다
		list.add(new Person("jungmin", 30));	// ArrayList.add() : ArrayList의 맨 뒤에 요소를 추가한다.
		list.add(new Person("chaeyeon", 25));
		list.add(new Person("gildong", 50));
		list.add(new Person("chaeyeon", 25));	// 중복되는 데이터도 입력된다.
		
		System.out.println("list.size() : " + list.size());		// ArrayList.size() : ArrayList에 저장된 데이터의 개수를 얻어온다
		
		list.add(1, new Person("heungmin", 30));	// add(index, value) : ArrayList의 index번째 위치에 value를 삽입한다. (뒤의 값들은 하나씩 밀림)
		System.out.println("list.size() : " + list.size());
		
		System.out.println(list.get(1));		// get(index) : ArrayList의 index번째 위치의 값을 가져온다.
		System.out.println(list.get(2));
		
		list.set(2, new Person("chunhyang", 16));	// set(index, value) : ArrayList의 index번째 위치에 값을 설정한다.
		
		System.out.println(list.get(2));
		
		list.remove(2);		// remove(index) : ArrayList의 index번째 위치의 값을 제거한다. (뒤의 값은 하나씩 당겨옴)
		System.out.println(list.get(2));
		
//		ArrayList가 또 좋은 점이, Arrays.toString처럼 String으로 변환하지 않고도 그냥 출력이 된다.
		System.out.println(list);
		list.clear();		// clear() : ArrayList의 모든 데이터를 제거한다.
		
		System.out.println(list);
	}
}
