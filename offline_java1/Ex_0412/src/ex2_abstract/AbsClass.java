package ex2_abstract;

public abstract class AbsClass {
	int value = 100;
	
	public int getValue() {
		return value;
	}
	
	// 추상 메서드
	public abstract int changeValue();
}
