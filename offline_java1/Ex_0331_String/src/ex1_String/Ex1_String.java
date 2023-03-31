package ex1_String;

public class Ex1_String {
	public static void main(String[] args) {
//		이 중에서 가장 많이 쓰는 클래스 중 하나인 String 클래스는 두 가지 특징을 가지고 있다.
//
//		1. 객체 생성법이 두 가지 (명시적, 암시적)
//		2. 한 번 생성된 문자열의 내용은 변하지 않는다. (불변)
		
		String s1 = "abc"; // 암시적 객체 생성
		String s2 = "abc";
		// 이미 앞에 같은 문자열로 생성된 암시적 객체가 있다면 앞서 생성된 객체의 주소를 같이 사용한다.
		
		String s3 = new String("abc"); // 명시적 객체 생성
		String s4 = new String("abc");
		// 같은 문자열을 갖고 있는 객체가 있더라도 new 키워드를 통해 생성 시 새로운 객체를 만든다.
		
		// String 클래스는 기본 자료형이 아니어서 ==로 비교하면 안 됨
		if(s1 == s2) {
			System.out.println("같다");
		}
		
		if(s1 == s3) {
			System.out.println("같다");
		}
		
		// == 연산자로 기본 자료형을 비교하면 값을 비교함
		// 하지만 객체를 비교하면 객체의 주소값을 비교함
		
		// 문자열 객체에 들어있는 값을 비교하려면 equals() 메소드를 사용한다.
		if(s3.equals(s4)) {
			System.out.println("s3과 s4 같음");
		}
		
		System.out.println("-------------------------------------------");
		
		// 한 번 생성된 문자열의 내용은 변하지 않는다
		String greet = "안녕";
		greet += "하세요";
		System.out.println(greet);
	}
}
