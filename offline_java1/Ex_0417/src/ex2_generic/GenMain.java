package ex2_generic;

public class GenMain {
	public static void main(String[] args) {
		
		Integer[] array1 = new Integer[] {1, 2, 3, 4, 5};
		Double[] array2 = new Double[] {1.1, 2.2, 3.3, 4.4, 5.5};
		Character[] array3 = new Character[] {'A', 'B', 'C', 'D', 'E'};

		Gen g = new Gen();
		
		// 아래와 같이 구성하면 printArr 메소드 쪽에서 알아서 제네릭 타입의 배열로 받아서 다양한 타입으로 처리할 수가 있다
		// 제네릭을 쓰면 이렇듯이 다양한 타입의 처리를 한 번에 할 수가 있다
		g.printArr(array1);
		g.printArr(array2);
		g.printArr(array3);
	}
}
