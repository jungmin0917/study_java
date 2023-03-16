package day16;

public class MainClass {
	public static void main(String[] args) {
//		System.out.println(Math.sqrt(2)); // Math.sqrt()는 정적 메소드여서 객체를 생성하지 않아도 됨
		
//		System.out.println("1~100 summary : " + MethodClass.total()); // 해당 메소드는 non-static 메소드이므로 이렇게만 하면 사용할 수 없다
		
		MethodClass methodClass = new MethodClass(); // 객체를 생성 (인스턴스를 생성한다)
		// static 메소드가 아닌 다른 클래스에 있는 메소드는, 반드시 해당 클래스의 객체를 생성 후 사용하여야 한다
		System.out.println("1~100 summary : " + methodClass.total());
	}
}
