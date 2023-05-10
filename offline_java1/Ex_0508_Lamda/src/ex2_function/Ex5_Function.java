package ex2_function;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class Ex5_Function {
	public static void main(String[] args) {
		
		// �޼����� ����
		// ���ٽ��� �ϳ��� �޼��常 ȣ���ϴ� ��쿡�� �޼��� ����(method reference)��� ������� ���ٽ��� ���� �����ϰ� �ٲ� �� �ִ�.
		
		// �ϳ��� �޼��常 ȣ���ϴ� ���ٽ��� Ŭ������::�޼���� �Ǵ� ��������::�޼�������� �ٲ� �� �ִ�.
		
		// ���� Ÿ�� : (byte, short, char, int, long, double, float, boolean)�� ���� �⺻ Ÿ���� �����ϰ� �迭, ������(Enum), Ŭ����, �������̽��� �ǹ��Ѵ�.
		
		Function<String, Integer> f = (String s) -> Integer.parseInt(s);
		
		Function<String, Integer> f2 = Integer::parseInt; // �޼��� ����
		
		BiFunction<String, String, Boolean> f3 = (s1, s2) -> s1.equals(s2);
		BiFunction<String, String, Boolean> f4 = String::equals;
		
		Boolean result = isEqualString("abc", "abc", String::equals);
		
		System.out.println(result);
	}
	
	public static Boolean isEqualString(String s1, String s2, BiPredicate<String, String> predicate) {
		return predicate.test(s1, s2);
	}
}
