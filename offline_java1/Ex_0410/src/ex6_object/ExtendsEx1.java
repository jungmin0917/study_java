package ex6_object;

public class ExtendsEx1 {
	// ���� Ŭ������ ������ �޼��尡 � ���� String�� �ް�,
	// � ���� int�� �޴� ��, ��Ȳ�� ���� �ڷ����� �޾ƾ� �ϴ� ���,
	// ������ �ڷ����̳�, �޼����� �Ķ���Ϳ� � �ڷ����� �������� ��ε� ���� �ִ�.
	
	// ��� �ڷ����� ���� getter, setter�� ���ֱ⿡�� �ʹ� �ڵ尡 �������
	
	Object value; // �ڹ� �ֻ��� ��ü�� Object������ ������ ����

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	
}
