package ex5_car;

public class HybridWaterCar extends HybridCar {
	protected int waterGuage;
	
	public HybridWaterCar(int n, int m, int l) {
		super(n, m);

		this.waterGuage = l;
	}
	
	protected String showCurrentGuage() {
		String res = String.format("�ܿ� ������ : %d\n", gasGuage);
		res += String.format("�ܿ� ���ⷮ : %d\n", electricGauge);
		res += String.format("�ܿ� ���Ǿ� : %d\n", waterGuage);
		
		return res;
	}
}
