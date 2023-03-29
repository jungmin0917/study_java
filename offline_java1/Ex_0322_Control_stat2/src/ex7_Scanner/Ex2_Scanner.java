package ex7_Scanner;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Ex2_Scanner {
	public static void main(String[] args) throws IOException{
		// Ű���忡�� ���� �Է¹ް� �������� ����ϱ�
		// 2~9 �̿��� ���ڸ� �Է��ϸ� 2~9������ ���ڸ� �Է��ϼ��� ��� �޽��� ���
		
//		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			
//			StringBuilder sb = new StringBuilder();
//			
//			System.out.println("2~9 ������ ���ڸ� �Է����ּ���");
//			int n = Integer.parseInt(br.readLine());
//			
//			if(n < 2 || n > 9) {
//				throw new Exception("2~9 ������ ���ڷ� �Է����ּ���");
//			}
//			
//			for (int i = 1; i <= 9; i++) {
//				sb.append(String.format("%d * %d = %d", n, i, n * i)).append("\n");
//			}
//			
//			System.out.println(sb);
//			
//		} catch (NumberFormatException e) {
//			System.out.println("���ڸ� �Է����ּ���");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
//		for vs while
//		for���� ���� ��Ȯ�� ����� �ݺ��ؾ� �ϴ��� �ƴ� ��쿡 �ַ� ���
//		while���� ���� ��Ȯ�� ����� �ݺ��ؾ� �ϴ��� ���� ���
//		
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//
//		while(num != -1) {
//			System.out.print("������ �Է����ּ��� : ");
//			num = sc.nextInt();
//
//			System.out.printf("�Է��� ���� : %d\n", num);
//		}
//		
//		System.out.println("-1�� �Է��Ͽ� ��������");
		
//		Ű���忡�� ���� �Է¹ޱ�
//		1 ~ n ������ ���� ����Ͽ� ��� ���
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			System.out.print("a, b�� �Է����ּ��� (���� �ƴ� ������) : ");
		
			String input = br.readLine();
			
			StringTokenizer st = new StringTokenizer(input);
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a < 0 || b < 0 || a > 1000000 || b > 1000000) {
				throw new Exception("1���� 1000000������ ���� ������ �Է����ּ���");
			}
			
			int min = Math.min(a, b);
			int max = Math.max(a, b);
			
			int sum = 0;
			
			for (int i = min; i <= max; i++) {
				sum += i;
			}
			
			bw.write(String.format("%d ~ %d������ ���� %d�Դϴ�", a, b, sum));
			
			bw.flush();
			bw.close();
			
		} catch (NumberFormatException e) {
			System.out.println("���ڸ� �Է��ϼ���");
		} catch (IOException e) {
			System.out.println("�Է� ����");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
}
