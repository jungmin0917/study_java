package ex2_bread;

public class Bread {
	public void makeBread() {
		System.out.println("빵을 만들었습니다");
	}
	
	public void makeBread(int n) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			sb.append("빵을 만들었습니다\n");
		}
		
		System.out.println(sb);
	}
	
	public void makeBread(int n, String s) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			sb.append(s + "빵을 만들었습니다\n");
		}
		
		System.out.println(sb);
	}
}
