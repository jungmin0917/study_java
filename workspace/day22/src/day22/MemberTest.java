package day22;

public class MemberTest {
	public static void main(String[] args) {
//		클래스 객체를 생성하는 방법
//		클래스명 객체명 = new(생성자) 클래스명();
		MemberVO vo = new MemberVO(); // 해당 클래스로 객체(인스턴스) 생성
//		클래스의 객체(Object)가 실제 메모리에 할당된 것을 인스턴스(Instance)라고 함

		System.out.println(vo.no);
		System.out.println(vo.name);
		System.out.println(vo.gender);
		System.out.println(vo.height);
		
	}
}
