package ex4_unit;

public class UnitMain {
	public static void main(String[] args) {
		
		Terran t = new Terran("�غ�", 100, false);
		
		t.decEnergy(); // �� �� ���ݴ���
		
		System.out.println("�غ��� ������ : " + t.getEnergy());
		
		Protoss p = new Protoss("������", 150, false);
		
		for (int i = 0; i < 3; i++) {
			p.decEnergy();
		}
		
		System.out.println("�������� ������ : " + p.getEnergy());
		
		Zerg z = new Zerg("��������", 200, true);
		
		z.decEnergy();
		z.decEnergy();
		
		System.out.println("���������� ������ : " + z.getEnergy());
	}
}
