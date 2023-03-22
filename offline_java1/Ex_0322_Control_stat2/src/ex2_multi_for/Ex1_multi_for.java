package ex2_multi_for;

import java.util.stream.IntStream;

public class Ex1_multi_for {
	public static void main(String[] args) {
		// ���� for�� : for�� �ȿ� for���� �ִ� ���
		// 2��, 3�� �� ���� ����
		// �ٵ� �ð����⵵ ������ ��κ� �ִ� 2�߱��� ����
		
//		�⺻��
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < m; j++) {
//				
//			}
//		}
		
//		StringBuilder sb = new StringBuilder();
//		
//		for (int i = 0; i < 3; i++) {
//			for (int j = 'A'; j <= 'D'; j++) {
//				if(j > 'A') {
//					sb.append(" ");
//				}
//				sb.append((char)j);
//			}
//			sb.append("\n");
//		}
//		
//		System.out.println(sb);
		
//		StringBuilder sb = new StringBuilder();
//
//		IntStream.rangeClosed(1, 12).forEach(v -> {
//			sb.append(v).append(" ");
//			if(v % 4 == 0) {
//				sb.append("\n");
//			}
//		});
//		
//		System.out.println(sb);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j <= 10; j++) {
				int sum = i + j;

				if(sum > 10) {
					sum -= 10;
				}
				
				sb.append(sum).append(" ");
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
