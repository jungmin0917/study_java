package ex1_generic;

public class GenEx<T> {
	// ���׸�(Generic)
	// �Ϲ����� �ڵ带 �ۼ��ϰ�, �� �ڵ带 �پ��� Ÿ���� ��ü�� ���� �����ϴ� ��ü���� ���
	// ��ü�� Ÿ���� �������� �� üũ�ϱ� ������, Ÿ�Կ� ���� �������� ���̰� ����ȯ�� �ؾ� �ϴ� ���ŷο��� ���� �� �ִ�
	
	// Ŭ������ ����� ���
	// public class Ŭ������<���׸�Ÿ��>{}
	
	// �������̽��� ����� ���
	// public interface �������̽���<���׸�Ÿ��>{}
	
	// T�� Ÿ�Ժ���(Type variable)�̶�� �Ѵ�.
	// E(Element), K(Key), V(Value)�� ����ϱ⵵ �Ѵ�.

	T value; // ���� Ÿ���� ������ ���� ���̴�

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}
