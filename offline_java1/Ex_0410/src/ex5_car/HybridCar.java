package ex5_car;

public class HybridCar extends Car {
	protected int electricGauge;
	
	public HybridCar(int n, int m) {
		super(n);

		this.electricGauge = m;
	}
	
	protected String showCurrentGuage() {
		String res = String.format("잔여 가스량 : %d\n", gasGuage);
		res += String.format("잔여 전기량 : %d\n", electricGauge);
		
		return res;
	}
}
