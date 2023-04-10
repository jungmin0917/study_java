package ex6_object;

public class ExtendsMain {
	public static void main(String[] args) {
		ExtendsEx1 v1 = new ExtendsEx1();
		
		v1.setValue("TEST");
		// 인자가 Object이지만 String이 Object를 상속받았으므로 인자로서 사용이 가능하다.
		
		System.out.println(v1.getValue());
		
		ExtendsEx1 v2 = new ExtendsEx1();
		
		v2.setValue(100); // AutoBoxing (자동 형변환 : 기본자료형 -> 객체(래퍼 클래스))
		
		System.out.println(v2.getValue()); // 이건 그냥 println이 Object도 출력할 수 있어서 그럼
		System.out.println((int)v2.getValue() + 1); // Unboxing은 자동으로 안 되고 명시적으로 해야 함
		
		
	}
}
