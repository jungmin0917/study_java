package ex5_interface;

// 상속이 아니고 구현을 한다 (implements 키워드를 사용함)
public class InterChild implements InterTest{
	
	// 당연히 추상 메소드 구현해야 한다.
	@Override
	public int getNum() {
		return NUM; // InterTest의 상수 반환
	}
}
