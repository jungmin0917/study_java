package ex2_bread;

public class Bread {
	public void makeBread() {
		System.out.println("���� ��������ϴ�");
	}
	
	public void makeBread(int n) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			sb.append("���� ��������ϴ�\n");
		}
		
		System.out.println(sb);
	}
	
	public void makeBread(int n, String s) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			sb.append(s + "���� ��������ϴ�\n");
		}
		
		System.out.println(sb);
	}
}
