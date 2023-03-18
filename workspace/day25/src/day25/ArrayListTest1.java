package day25;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest1 {
	public static void main(String[] args) {
		
// 		배열(Array)은 한 번 선언하면 프로그램에서 크기를 변경할 수 없다.
		
//		int[] array = new int[10];
//		
//		for (int i = 0; i < 10; i++) {
//			array[i] = i + 1;
//		}
//		
//		System.out.println(Arrays.toString(array));
		
//		<E> : 제네릭(Generic Type Parameter)이라고 하는 것. ArrayList 내에서 저장할 수 있는 객체의 타입을 제한할 때 사용함.
//		예를 들어, ArrayList<Integer>로 선언하면 해당 ArrayList는 Integer 객체만 사용할 수 있음.
//		Wrapper 클래스 (래퍼 클래스)란 기본 데이터타입을 객체로 래핑하여 사용할 수 있도록 제공하는 클래스를 말함.
//		즉, 기본 데이터 타입의 값을 객체로 다룰 수 있도록 만들어주는 클래스임
//		각 클래스인 Integer, Float, Double, Boolean은 각각 int, float, double, boolean 타입과 대응됨.
//		ArrayList에서 저장할 자료들은 바로 저 래퍼 클래스를 사용한다.
//		Wrapper 클래스는 기본 자료형의 첫 문자만 대문자로 적으면 되지만, Character와 Integer는 풀네임을 사용한다
		
//		ArrayList는 크기를 동적으로 변경할 수 있다.
//		ArrayList<Integer> list = new ArrayList(); 예전 버전은 이렇게 써도 됐었다.
		ArrayList<Integer> list = new ArrayList<>();
		
//		유동성이 많은 배열이라면 ArrayList를 사용하면 좋다
		
		for (int i = 0; i < 20; i++) {
			list.add(i + 1);
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("list[%d] : %d\n", i, list.get(i));
		}
	}
}
