package ex1_Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Random;

public class Ex3_Array {
	public static void main(String[] args){
		// �迭 arr�� ����ִ� ��� ���� ���� ���
		
//		int[] arr = {10, 20, 30, 40, 50};

		// ��ȸ ���
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
		
		// Arrays.stream.sum() �޼ҵ� �̿�
//		int result = Arrays.stream(arr).sum();
		
		// ���ٽ� ������ (reduce �̿�)
//		int result = Arrays.stream(arr).reduce(0, (acc, x) -> acc + x);
//		
//		System.out.println(result);
		
//		���α׷��� ����Ǹ� ������ �迭 ch�� ���̸� Ű���忡�� �Է¹޾� �ִ´�
//		�Է¹��� ���̿� ���� ���ĺ� ��� (ABC �������)
		
//		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//			
//			System.out.print("1 ~ 26 ������ ������ �Է��ϼ��� : ");
//			
//			int n = Integer.parseInt(br.readLine());
//			
//			if(n < 1 || n > 26) {
//				throw new Exception("1 ~ 26 ���̷� �Է����ּ���");
//			}
//			
//			char[] ch = new char[n];
//			
//			StringBuilder sb = new StringBuilder();
//			
//			for (int i = 0; i < ch.length; i++) {
//				// �̷� ��ĵ� �ְ�
////				sb.append((char)('A' + i));
//				
//				ch[i] = (char)(i + 65);
//			}
//			
////			System.out.println(sb); // �̷� ��ĵ� �ִ�
//			
//			System.out.println(ch);
//			
//		} catch (NumberFormatException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
//		Random rand = new Random();
//		
//		int r = rand.nextInt(1, 20);
//		
//		System.out.println(r);
		
//		���� money�� 10 ~ 5000 ������ ������ �߻����� �ִ´�
//		��, 1�� �ڸ� ���ڴ� �ݵ�� 0�� �ǵ��� ������ش�
		
//		�߻��� ������ ������ �������� �ٲٸ� �� ���� �ʿ����� �Ǵ��ϴ� �ڵ� �ۼ��ϱ�
//		10��, 50��, 100��, 500��
//		���� ���� ������ ���� ����ϱ�
		
		Random rand = new Random();
		
		int r = rand.nextInt(1, 501);
		
		r *= 10;
		
		int total = r;

		int m500 = r / 500;		
		r -= 500 * m500;
		int m100 = r / 100;
		r -= 100 * m100;
		int m50 = r / 50;
		r -= 50 * m50;
		int m10 = r / 10;
		
		String res = String.format("�� �ݾ� : %d��\n500�� : %d��\n100�� : %d��\n50�� : %d��\n10�� : %d��", total, m500, m100, m50, m10);
		
		System.out.println(res);
	}
}
