package ex1_Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex1_Array {
	public static void main(String[] args) {
		
//		Array (�迭) : ���� �ڷ����� �����͵��� ��Ƴ��� ��ü
//		�������� ȿ������ ������ ���� �ݵ�� �ʿ��ϴ�.
//		�ٵ� ArrayList�� �� ����
		
//		int[] arr; // ����
		
//		int[] arr = new int[5]; // ũ��� �Բ� ���� (�Ϲ������� �ε��� 0������ ä����)
//		int[] arr = new int[] {1, 2, 3, 4, 5}; // �Ҵ�� �Բ� ����
		
//		������ �濡 ������ �ֱ�
//		�迭��[�ε���] = ������;
		
//		�ϳ��� �־��
//		int[] arr = new int[5];
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		
//		�迭�� �ʱ�ȭ�� ���ÿ� ���� ���� �ִ�
		int[] arr = {10, 20, 30, 40, 50}; // �迭 �ʱ�ȭ�� ���ÿ� �־��ֱ�
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//		�翬������, ������ �ε��� ��ȣ�� ���� - 1�̴�
		
//		System.out.println(Arrays.toString(arr)); // �迭 �� ���� ����ϱ�
		
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			list.add((i+1) * 10);
		}

		
		
		
	}
}
