package ex4_unit;

// ĳ���� ����
public abstract class Unit {
	protected String name; // �̸�
	protected int energy; // ü��
	
	// ĳ���Ͱ� ������ ������ �� ü�� ���ҷ� �����ϱ� ���� �޼ҵ�
	// ĳ���͸��� ü�� ���ҷ��� �ٸ�
	public abstract void decEnergy(); // decrease energy

	public int getEnergy() {
		return energy;
	}
}
