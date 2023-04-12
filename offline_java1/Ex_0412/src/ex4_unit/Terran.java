package ex4_unit;

public class Terran extends Unit{
	
	// 날아다니면 true, 아니면 false
	private boolean fly;
	
	// 객체 생성 시 필요한 데이터 전부 받기 위해 커스텀 생성자 만듦
	public Terran(String name, int energy, boolean fly) {
		super.name = name; // 근데 사실 this로 접근해도 됨
		super.energy = energy;
		this.fly = fly;
	}

	@Override
	public void decEnergy() {
		energy -= 3;	
	}
}
