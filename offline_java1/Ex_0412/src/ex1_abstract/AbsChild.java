package ex1_abstract;

// 추상 클래스를 상속받았으면 반드시 해당 추상 클래스 내의 추상 메소드들을 구현하여야 한다.
public class AbsChild extends AbsParent{
	
	// setValue가 추상 메서드이므로 자식 클래스에서 오버라이딩 하여 사용한다.
	@Override
	public void setValue(int n) {
		this.value = n;
		System.out.println("추상메서드 재정의");
	}

	
}
