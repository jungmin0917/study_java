package ex4_unit;

// 캐릭터 정보
public abstract class Unit {
	protected String name; // 이름
	protected int energy; // 체력
	
	// 캐릭터가 공격을 당했을 때 체력 감소량 관리하기 위한 메소드
	// 캐릭터마다 체력 감소량이 다름
	public abstract void decEnergy(); // decrease energy

	public int getEnergy() {
		return energy;
	}
}
