package ex3_computer;

public class Computer {
	
//	�Ϲ������� �������, ����޼ҵ�� ���� private���� �ϰ�, getter, setter�� �����ϵ��� �����
	private String brand;
	
	// �⺻ ������
	public Computer() {
		this.brand = "SAMSUNG"; // �⺻��
	}

	// getter, setter
//	������ private���� ������� ������ ���� �����ϰų� ��ȸ�ϰ� �ϱ� ���� ���
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
