package ex5_interface;

public class InterMain {
	public static void main(String[] args) {
		// 인터페이스를 바로 객체화하는 것은 불가능.
		// 인터페이스를 구현한 클래스를 객체화하여 사용한다.
		InterChild ic = new InterChild();
		
		System.out.println(ic.getNum());
	}
}
