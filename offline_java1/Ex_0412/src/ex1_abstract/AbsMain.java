package ex1_abstract;

public class AbsMain {
	public static void main(String[] args) {
		// 일반적인 방법으로는 추상클래스를 객체화시킬 수 없다
//		AbsParent ap = new AbsParent();
		
		// 그래서 추상클래스를 상속받아 구현한 자식 클래스를 객체화하여 사용하거나 한다.
		// 추상클래스는 자신의 기능을 자식이 완성시키도록 조건부 상속하여 자식클래스가 생성될 때 객체화된다.
		AbsChild ac = new AbsChild();

		ac.setValue(20);
		
		System.out.println(ac.getValue());
	}
}
