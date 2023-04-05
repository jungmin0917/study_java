package ex2_bread;

public class BreadMain {
	// Bread 클래스를 만들어, 각기 다른 기능을 하는 makeBread() 메서드를 만들 것.
	
	// BreadMain 클래스에서 각각의 메서드를 호출했을 때의 결과를 보고 로직을 구현할 것
	
	// 1. 빵을 만들었습니다.
	// 2. 빵을 만들었다 x n
	// 3. xx 빵을 만들었다 x n
	
	public static void main(String[] args) {
		Bread br = new Bread();
		
		br.makeBread();
		
		br.makeBread(4);
		
		br.makeBread(5, "마늘");
	}
}
