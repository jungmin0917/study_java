package ex2_animal;

public class AnimalMain {
	public static void main(String[] args) {
		
		Cat cat = new Cat();

		System.out.println("---�����---");
		System.out.printf("�� : %d\n", cat.getEye());
		System.out.printf("�ٸ� : %d\n", cat.getLeg());
		System.out.printf("Ư¡ : %s\n", cat.getBalance());
		
		Lion lion = new Lion();

		System.out.println("---����---");
		System.out.printf("�� : %d\n", lion.getEye());
		System.out.printf("�ٸ� : %d\n", lion.getLeg());
		System.out.printf("Ư¡ : %s\n", lion.getEat());

		Sneak sneak = new Sneak();

		System.out.println("---��---");
		System.out.printf("�� : %d\n", sneak.getEye());
		System.out.printf("�ٸ� : %d\n", sneak.getLeg());
		System.out.printf("Ư¡ : %s\n", sneak.getSense());
	}
}
