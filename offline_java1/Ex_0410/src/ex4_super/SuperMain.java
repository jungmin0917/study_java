package ex4_super;

public class SuperMain {
	public static void main(String[] args) {
		
		Child child = new Child();
		
//		자식 클래스를 생성하면 부모 생성자가 먼저 실행된다.
//		heap 영역에 부모의 영역을 먼저 만들기 때문
		
		child.result();
	}
}
