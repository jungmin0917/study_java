package ex2_generic;

public class PersonMain {
	public static void main(String[] args) {
		
		Person<String, Integer> p1 = new Person<String, Integer>("jungmin", 30);
		Person<String, Integer> p2 = new Person<>("chaechae", 30); // 이렇게 생성자 부분의 제네릭 타입은 생략 가능
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
