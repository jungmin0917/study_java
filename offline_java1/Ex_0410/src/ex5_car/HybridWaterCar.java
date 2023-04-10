package ex5_car;

public class HybridWaterCar extends HybridCar {
	protected int waterGuage;
	
	public HybridWaterCar(int n, int m, int l) {
		super(n, m);

		this.waterGuage = l;
	}
	
	protected String showCurrentGuage() {
		String res = String.format("잔여 가스량 : %d\n", gasGuage);
		res += String.format("잔여 전기량 : %d\n", electricGauge);
		res += String.format("잔여 물의양 : %d\n", waterGuage);
		
		return res;
	}
}
