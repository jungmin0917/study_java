package ex1_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		
		Child c1 = new Child();
		
//		Child 클래스에서 상속받은 Parent 클래스의 멤버들에 접근할 수 있다.

		System.out.println(c1.getLand());
		System.out.println(c1.getCar());
		System.out.println(c1.getMoney());
		
		Parent p1 = new Parent();
		 // 부모에서 자식의 멤버에 접근할 수는 없다
//		System.out.println(p1.getCar());
		
		if(c1 instanceof Parent) {
			System.out.println("c1은 Parent의 인스턴스임");
		}
		
		if(c1 instanceof Child) {
			System.out.println("c1은 Child의 인스턴스임");
		}
	}
}
