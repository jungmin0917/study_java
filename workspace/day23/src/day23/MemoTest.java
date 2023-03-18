package day23;

public class MemoTest {
	public static void main(String[] args) {
		MemoVO vo1 = new MemoVO();
		MemoVO vo2 = new MemoVO("jungmin", true, "hello");
		
//		System.out.println(vo1); // 이렇게 그냥 출력하면 객체 정보가 나옴.
//		System.out.println(vo1.toString()); // 이렇게 해도 마찬가지임
//		기본적으로 객체를 System.out.println으로 출력하면 자동으로 toString 메소드가 호출됨.
		
		System.out.println(vo1);
		System.out.println(vo2);
	}
}
