package ex4_unit;

public class Terran extends Unit{
	
	// ���ƴٴϸ� true, �ƴϸ� false
	private boolean fly;
	
	// ��ü ���� �� �ʿ��� ������ ���� �ޱ� ���� Ŀ���� ������ ����
	public Terran(String name, int energy, boolean fly) {
		super.name = name; // �ٵ� ��� this�� �����ص� ��
		super.energy = energy;
		this.fly = fly;
	}

	@Override
	public void decEnergy() {
		energy -= 3;	
	}
}
