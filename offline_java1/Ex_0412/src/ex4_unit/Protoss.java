package ex4_unit;

public class Protoss extends Unit{

	// ���ƴٴϸ� true, �ƴϸ� false
	private boolean fly;
	
	// ��ü ���� �� �ʿ��� ������ ���� �ޱ� ���� Ŀ���� ������ ����
	public Protoss(String name, int energy, boolean fly) {
		super.name = name;
		super.energy = energy;
		this.fly = fly;
	}
	
	@Override
	public void decEnergy() {
		energy -= 1;
	}
}
