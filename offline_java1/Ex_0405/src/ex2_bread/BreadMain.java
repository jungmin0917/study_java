package ex2_bread;

public class BreadMain {
	// Bread Ŭ������ �����, ���� �ٸ� ����� �ϴ� makeBread() �޼��带 ���� ��.
	
	// BreadMain Ŭ�������� ������ �޼��带 ȣ������ ���� ����� ���� ������ ������ ��
	
	// 1. ���� ��������ϴ�.
	// 2. ���� ������� x n
	// 3. xx ���� ������� x n
	
	public static void main(String[] args) {
		Bread br = new Bread();
		
		br.makeBread();
		
		br.makeBread(4);
		
		br.makeBread(5, "����");
	}
}
