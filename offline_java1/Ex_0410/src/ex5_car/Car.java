package ex5_car;

public class Car {
	protected int gasGuage;
	
	public Car(int n) {
		this.gasGuage = n;
	}
	
	protected String showCurrentGuage() {
		String res = String.format("�ܿ� ������ : %d\n", gasGuage);
		
		return res;
	}
	
}
