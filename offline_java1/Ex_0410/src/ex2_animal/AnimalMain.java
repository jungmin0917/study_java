package ex2_animal;

public class AnimalMain {
	public static void main(String[] args) {
		
		Cat cat = new Cat();

		System.out.println("---°í¾çÀÌ---");
		System.out.printf("´« : %d\n", cat.getEye());
		System.out.printf("´Ù¸® : %d\n", cat.getLeg());
		System.out.printf("Æ¯Â¡ : %s\n", cat.getBalance());
		
		Lion lion = new Lion();

		System.out.println("---»çÀÚ---");
		System.out.printf("´« : %d\n", lion.getEye());
		System.out.printf("´Ù¸® : %d\n", lion.getLeg());
		System.out.printf("Æ¯Â¡ : %s\n", lion.getEat());

		Sneak sneak = new Sneak();

		System.out.println("---¹ì---");
		System.out.printf("´« : %d\n", sneak.getEye());
		System.out.printf("´Ù¸® : %d\n", sneak.getLeg());
		System.out.printf("Æ¯Â¡ : %s\n", sneak.getSense());
	}
}
