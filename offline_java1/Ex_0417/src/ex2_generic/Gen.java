package ex2_generic;

// Gen 클래스 만들고 제네릭 타입 T를 갖는 printArr 메서드를 생성한다.
// printArr 내부에서 배열을 순차적으로 출력하는 코드 작성

// Main 클래스 만들어서 Integer[], Double[], Character[]을 만든 후
// Gen 클래스의 printArr 메서드를 각각 호출하여 배열 내용을 출력

// 결과
// 1 2 3 4 5
// 1.1, 2.2, 3.3, 4.4, 5.5
// A B C D E

public class Gen {
	public <T> void printArr(T[] array) {
		for (T t : array) {
			System.out.print(t + " ");
		}
		System.out.println();
	}
}
