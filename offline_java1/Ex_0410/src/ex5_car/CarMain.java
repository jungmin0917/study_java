package ex5_car;

public class CarMain {
	public static void main(String[] args) {
		// Car Ŭ������ ����. �� Ŭ������ gasGauge ��� ������ ���� �ִ�.
		// �����ڸ� ���� �ܺο��� gasGuage�� �޴´�.
		// �ܿ����� ����ϴ� �޼����� showCurrentGuage() �� ���� �ִ�.
		
		// HybridCar Ŭ������ electricGauge ������ ���� �ְ�, Car Ŭ������ ��ӹ޴´�
		// �����ڸ� ���� �ܺο��� gasGuage�� electricGauge�� �޴´�.
		// �޼���� �������̵��Ͽ� �ܿ� �������� ���ⷮ�� ����ϱ�
		
		// HybridWaterCar Ŭ������ waterGauge ������ ���� �ְ�, HybridCar Ŭ������ ��ӹ޴´�
		// �����ڸ� ���� �ܺο��� gasGuage�� electricGauge�� waterGauge�� �޴´�.
		// �޼���� �������̵��Ͽ� �ܿ� �������� ���ⷮ, ���� ���� ����ϱ�
		
		// main���� HybridWaterCar ��ü�� �����Ͽ� �ܿ����� ����ϱ�
		// �ܿ� ������
		// �ܿ� ���ⷮ
		// �ܿ� �� ��
		
		HybridWaterCar hwc = new HybridWaterCar(10, 20, 30);
		
		System.out.println(hwc.showCurrentGuage());
	}
}
