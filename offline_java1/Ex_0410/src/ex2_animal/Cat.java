package ex2_animal;

public class Cat extends Animal {
	
	// �θ��� ���� �״�� �޾Ƽ� �ᵵ �� (��, �ٸ� ������ �⺻���� ����)
	private String balance = "�Ϳ���";
	
	public Cat() {;}

	// �޼��� �������̵� (���� �̸�, ���� �Ű����� �� Ÿ���� �Լ��� ������)
	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}
	
}
