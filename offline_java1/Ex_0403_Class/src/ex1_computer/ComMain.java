package ex1_computer;

public class ComMain {
	public static void main(String[] args) {
		
		// �ش� Ŭ������ ��ü(�ν��Ͻ�) ���� (��üȭ)
		Computer com1 = new Computer();

		// �ٸ� Ŭ������ ���� ȣ��
		System.out.println(com1.getSsd());
		System.out.println(com1.getRam());
		System.out.println(com1.getCpu());
		System.out.println(com1.getColor());
		System.out.println("---------------------");

		System.out.println();
		
		// �̷��� ����� ��ü ������ �ϸ� Heap �ʿ� �� �ٸ� �ּҿ� ����ǹǷ� �� ��ü�� ���� �����ص� ���� ��ü�� ������ ����
		Computer com2 = new Computer(); // new -> ����� ��ü ����	
		
		com2.setSsd(512);
		com2.setRam(32);
		com2.setCpu(5.2);
		com2.setColor("black");
		
		// ������ �ݺ� �۾��� �Լ��� ó����
		com2.getInfo();
		
		
	}
}
