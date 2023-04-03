package ex1_computer;

// Ŭ���� (���赵)
public class Computer {
	// ��� ����, ��� �޼ҵ尡 �� (���赵�� ���)
	
//	��� ���� �뷮������ ���� ���赵�� ����� �۾�
//	Ŭ������ ���� ���
//	1. ������� (�Ӽ�, �ʵ��� �θ�)
//	2. �޼ҵ� (���, �Լ���� �θ�)
	
	int ssd; // ssd �뷮
	int ram; // ram ũ��
	double cpu; // CPU Ŭ�� �ӵ�
	String color; // ����
	
	// ���� �Լ��� ������
	// �Լ��� �Լ� �ȿ��� ���ǵ� �� ����.
	// �Լ��� �Լ� �ۿ��� ȣ���� �� ����.
	
//	�Լ��� �ݺ��ؼ� ����ϴ� ��ɿ� ���� �����س��� ���߿� ���ϰ� ���� ����
//	�޼���� � �۾����� �����ϱ� ���� ����� �����̴�
//	�ݺ������� ���� �ʱ� ���ؼ�
//	�����صΰ� �ʿ��� ������ ���� ��
	public void getInfo() {
		System.out.println("ssd: " + this.ssd);
		System.out.println("ram: " + this.ram);
		System.out.println("cpu: " + this.cpu);
		System.out.println("color: " + this.color);
		System.out.println("---------------------");
	}
	
//	�޼����� ����
//	���������� (static����) ��ȯ�ڷ��� �޼����(�Ű�����, �Ű�����, ...){ ������ ��� }

//	���������� ����
//	public : ��� ������ ���. ���� ������Ʈ ���� ��� Ŭ�������� ȣ�� ����
//	private : ���� Ŭ���� �������� ����� �㰡
//	protected : ��� ������ Ŭ���������� ����� �㰡
//	default : ���� ��Ű�� ���� Ŭ���������� ����� �㰡 (���� ���� ������ default)
	
//	�ش� Ŭ������ ��ȯ�ڷ����� �°� ��ȯ���� �����ؾ� ��
//	�޼��尡 ó������ ������ ������ ��ģ �� ��ȯ�ؾ� �� ���� ���� ��쿡 ����.
//	int, boolean, float, String, ���� ��ü ��
//	�⺻ �ڷ���, ���� Ŭ����, ����ڰ� ���� ���� �ƹ� Ŭ������ ��ü ��� ����
	
//	�̸� ȣ���ؼ� �� ���� �̷��� ����Ѵ�
//	�޼����(�Ű�����, �Ű�����, ...);
//	Ŭ������ ù���ڴ� �ݵ�� �빮��, �޼ҵ�� ù���ڴ� �ݵ�� �ҹ���
	
//	��ȯ��
//	return ��ȯ��;
//	��ȯ���� �ڷ����� ��ȯ���� ��ġ�ؾ� ��
	
	// �⺻ ������ (�⺻�� ó��)
	public Computer() {
		this.ssd = 1024;
		this.ram = 16;
		this.cpu = 4.8;
		this.color = "white";
	}

	// getter, setter
	public int getSsd() {
		return ssd;
	}

	public void setSsd(int ssd) {
		this.ssd = ssd;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public double getCpu() {
		return cpu;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
