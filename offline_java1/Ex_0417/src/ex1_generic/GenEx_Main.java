package ex1_generic;

public class GenEx_Main {
	public static void main(String[] args) {
		// 제네릭 타입으로는 클래스만이 가능하다 (기본 타입 안 됨)
		GenEx<String> v1 = new GenEx<String>();
		
		v1.setValue("test");
		
		System.out.println(v1.getValue());
		
		// 정수를 가지는 GenEx 객체 만들기
		// 제네릭 타입은 기본 자료형을 인식하지 않는다.
		// 따라서, int, double 등의 기본 자료형을 제네릭 타입으로 이용하고자 할 때는,
		// 래퍼 클래스 (Wrapper Class)를 이용한다.
		
		// int -> Integer, char -> Character, float -> Float, double -> Double 등이 있다.
		
		GenEx<Integer> v2 = new GenEx<>(); // 보통 뒤에 생성자 쪽에는 제네릭 안에 타입 생략해도 된다.
		v2.setValue(1000);
		System.out.println(v2.getValue() + 20);
		
		GenEx<Character> v3 = new GenEx<>();
		v3.setValue('A');
		System.out.println(v3.getValue());
		
		GenEx<Double> v4 = new GenEx<>();
		v4.setValue(1.12);
		System.out.println(v4.getValue());
	}
}
