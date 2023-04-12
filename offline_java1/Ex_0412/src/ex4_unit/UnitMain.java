package ex4_unit;

public class UnitMain {
	public static void main(String[] args) {
		
		Terran t = new Terran("해병", 100, false);
		
		t.decEnergy(); // 한 번 공격당함
		
		System.out.println("해병의 에너지 : " + t.getEnergy());
		
		Protoss p = new Protoss("광전사", 150, false);
		
		for (int i = 0; i < 3; i++) {
			p.decEnergy();
		}
		
		System.out.println("광전사의 에너지 : " + p.getEnergy());
		
		Zerg z = new Zerg("무리군주", 200, true);
		
		z.decEnergy();
		z.decEnergy();
		
		System.out.println("무리군주의 에너지 : " + z.getEnergy());
	}
}
