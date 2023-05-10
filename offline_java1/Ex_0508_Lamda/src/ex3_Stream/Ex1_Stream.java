package ex3_Stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex1_Stream {
	public static void main(String[] args) {
		
		String[] strArray = {"ȫ�浿", "���ڹ�", "�ڶ���"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(item -> System.out.print(item + " "));
		
		System.out.println(); 
		
		int[] intArray = {1, 2, 3, 4, 5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		System.out.println("----------------");
		
		// ��Ʈ���� ����
		// �߰����� : ������ ����� ��Ʈ��, ��Ʈ���� �����ؼ� ������ �� �� �ִ�.
		// �������� : ������ ����� ��Ʈ���� �ƴ� ����, ��Ʈ���� ��Ҹ� �Ҹ��ϹǷ� �� �� ���� ������
		
		int[] nums = {1, 44, 33, 21, 35, 44, 33, 2, 4, 2};
		
		// distinct() : �ߺ� ����
		Arrays.stream(nums).distinct().sorted().limit(5).forEach(System.out::println);
		// ������ limit�� �� �������� ���������̴�.
	}
}
