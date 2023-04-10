package ex4_super;

public class Child extends Parent{
	
	public Child() {
//		super(); // 부모 클래스 생성자 호출. 기본적으로 적지 않아도 자동으로 붙어 있음
//		다만, 부모 클래스의 생성자에서 파라미터를 받으면, 생략할 수 없다.
		super(1); // 그 어떤 명령보다 맨 위에 와야 함 (항상 부모클래스 생성자 먼저 작동)
		System.out.println("자식 클래스");
	}
	
	@Override
	public int result() {
		// TODO Auto-generated method stub
		return super.result(); // 기본값으로 오버라이딩하면 부모의 해당 메소드를 그대로 실행
	}
}
