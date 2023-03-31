package ex2_multi_Array;

import java.util.Arrays;

public class Ex1_multi_Array {
	public static void main(String[] args) {
		// ���� Array���� key���� ���ڹۿ� �� ��
		// Ű���� �ٸ� �ڷ��� �ְ� ������ �ؽø� ��� ��
		
		// ������ �迭 : 2���� �̻��� �迭�� �ǹ�
		// 2���� �迭�� 1���� �迭�� ��ҷ� ����
		
//		1���� �迭
//		�ڷ���[] �迭�� = new �ڷ���[����]
		
//		2���� �迭
//		�ڷ���[][] �迭�� = new �ڷ���[1���� �迭�� ����][������ 1���� �迭�� ����� ����]
//		
//		int[][] arr = new int[2][3];
//		
//		arr[0][0] = 100;
//		arr[0][1] = 200;
//		arr[0][2] = 300;
//		arr[1][0] = 400;
//		arr[1][1] = 500;
//		arr[1][2] = 600;
		
//		System.out.println(Arrays.deepToString(arr));

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.printf("arr[%d][%d] : %d, ", i, j, arr[i][j]);
//			}
//			System.out.println();
//		}
//		
//		char[][] ch = {{'A', 'B'},{'C', 'D', 'E'},{'F'}}; // �̷� ������ 1���� �迭�� ���̰� ���� �ٸ� �� ����
//		
//		System.out.println(Arrays.deepToString(ch));
		
//		�Ʒ��� ���� ���� ���� �迭�� ���̸� ���� �������� �� �ִ�.
//		int[][] num = new int[2][];
//		num[0] = new int[3];
//		num[1] = new int[2];
//		
//		int n = 0;
//		
//		for (int i = 0; i < num.length; i++) {
//			for (int j = 0; j < num[i].length; j++) {
//				System.out.println((num[i][j] = (n += 100)) + " ");
//			}
//		}
		
		// �迭 arr�� ��� ��� ���� �հ� ����� ���ϴ� ���α׷� �ۼ�

		int arr[][] = new int[4][5];
		int n = 1;
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = n;
				n++;
				count++; // ��ü ���� ����
			}
		}
		
		int sum = 0;
		double avg;
		
		for (int i = 0; i < arr.length; i++) {
			sum += Arrays.stream(arr[i]).sum();
		}
		
		avg = (double)sum / count;
		
		System.out.printf("���� : %d, ��� : %.2f", sum, avg);
		
	}
}
