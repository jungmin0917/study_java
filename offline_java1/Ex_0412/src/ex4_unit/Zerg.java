package ex4_unit;

public class Zerg extends Unit{

	// ���ƴٴϸ� true, �ƴϸ� false
	private boolean fly;
	
	// ��ü ���� �� �ʿ��� ������ ���� �ޱ� ���� Ŀ���� ������ ����
	public Zerg(String name, int energy, boolean fly) {
		super.name = name;
		super.energy = energy;
		this.fly = fly;
	}
	
	@Override
	public void decEnergy() {
		energy -= 10;
	}
}
