package ex2_method;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class MethodMain {
	public static void main(String[] args) {
//		try {
//			MethodTest mt = new MethodTest();
//
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//			
////		System.out.print("x �Է� : ");
////		
////		int x = Integer.parseInt(br.readLine());
////		System.out.println(mt.f(x));
////		
////		mt.f2(x);
//			
//			System.out.printf("�� ������ ������ ���̿� �ΰ� �Է����ּ��� : ");
//			String input = br.readLine();
//			
//			StringTokenizer st = new StringTokenizer(input);
//			
//			int a = Integer.parseInt(st.nextToken());
//			int b = Integer.parseInt(st.nextToken());
//			
//			int sum = mt.sum(a, b);
//			
//			bw.write(String.format("%d + %d = %d", a, b, sum));
//
//			bw.flush();
//			bw.close();
//			
//		} catch (Exception e) {
//			System.out.println("������ ����� �Է����ּ���");
//		}
		
//		MethodTest mt = new MethodTest();
//		System.out.println(mt.oneToTen());
//		
//		System.out.println(mt.getTotal());
//		
//		try {
//			MethodTest mt = new MethodTest();
//			
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//			
//			System.out.print("1 ~ 1000000 ������ ������ �Է����ּ��� : ");
//			
//			int n = Integer.parseInt(br.readLine());
//			
//			if(n < 1 || n > 1000000) {
//				throw new Exception();
//			}
//			
//			String res = mt.gugudan(n);
//			
//			bw.write(res);
//
//			bw.flush();
//			bw.close();
//			
//		} catch (Exception e) {
//			System.out.println("1���� 1000000 ������ ������ �Է����ּ���");
//		}
	
		MethodTest mt = new MethodTest();
		
		int su = 100;
		mt.valueTest(su);
		
		System.out.println(su);
		
	}
}
