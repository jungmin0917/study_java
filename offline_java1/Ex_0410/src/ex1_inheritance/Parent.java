package ex1_inheritance;

// �θ� Ŭ����
public class Parent {
	// ���
	// �ڹٿ����� Ŭ������ �θ��ڽ� ���谡 �����ϰ�, �θ��� ��� �� �Ϻ� Ȥ�� ���θ� �ڽ��� �������� �� �ִ�.
	// ���� ����� �Ұ�

	private int money = 200000000; // �θ��� ���
	private String land = "�۵�"; // �θ��� �ε���
	
	public Parent() {;}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	
	
	
}
