package ex5_car;

public class HybridCar extends Car {
	protected int electricGauge;
	
	public HybridCar(int n, int m) {
		super(n);

		this.electricGauge = m;
	}
	
	protected String showCurrentGuage() {
		String res = String.format("�ܿ� ������ : %d\n", gasGuage);
		res += String.format("�ܿ� ���ⷮ : %d\n", electricGauge);
		
		return res;
	}
}
