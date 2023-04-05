package ex6_static;

public class Bank {
	// ������ �������� �ִµ�, �� ���࿡ ���� ���ڰ� �ϰ������� �ٲ� �� �ְ� �ϴ� ��
	
	// ������ static���� ����Ǹ�, ��ü�� �������� �ʰ� �ش� ������ ����� �� �ִ�.
	
	// static ������ ������ ��ü�� �ƹ��� ���� �����ص�, static ������ �޸𸮿� �� ���� ���������.
	
	private String name = "�츮����";
	private String point; // ����
	private String tel; // ��ȭ��ȣ
	static double interest = 10; // ������
	
	// ������ ����
	public Bank(String point, String tel) {
		this.point = point;
		this.tel = tel;
	}
	
	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", point=" + point + ", tel=" + tel + ", interest=" + interest + "]";
	}
	
	public void printBank() {
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("��ġ : %s\n", point);
		System.out.printf("��ȭ��ȣ : %s\n", tel);
		System.out.printf("������ : %.2f%%\n", interest);
		System.out.println("-------------------------");
	}
	
}
