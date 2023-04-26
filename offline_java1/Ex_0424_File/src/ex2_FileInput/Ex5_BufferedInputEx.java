package ex2_FileInput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex5_BufferedInputEx {
	public static void main(String[] args) {
		
		// �ռ� FileInputStream�� ��ô�.
		// BufferedInputStream�� ���� �ִ�.
		
		// ��Ʈ���� ������ �о�� �� ���� ������ ����,
		// �ش� ���۰� �� ������ ���۸� ���鼭 �д� ���̴�.
		// ���� ũ��� ��Ʈ�� ���� �� ������ �����ϸ�, �Ϲ������� ������ �� ���� �о���� �ͺ��� ������.
		// �޸𸮵� ���� ����Ѵ�.
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		byte _byte[] = new byte[100];
		byte result[] = new byte[100];
		
		try {
			System.out.println("��� �Է� : ");
			System.in.read(_byte); // ����Ʈ �迭�� �Է��� ������
			
			String path = new String(_byte).trim(); // ����Ʈ �迭�� String���� ��ȯ�Ͽ� ������
			
			fis = new FileInputStream(path);
			bis = new BufferedInputStream(fis); // BufferedInputStream�� �Ű������δ� InputStream�� �ʿ��ϴ�
			
			bis.read(result); // ���Ϸκ��� �о� ����Ʈ �迭�� �����Ѵ�

			String res = new String(result); // ����Ʈ �迭�� String���� ��ȯ�Ѵ�
		
			System.out.println(res);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// üũ�ϴ� ������, �̹� �ݰ�µ� �� ������ �ȵǴϱ�
				if(bis != null) { // ���� ������ �ʾҴٸ�
					bis.close();
				}
				if(fis != null) { // ���� ������ �ʾҴٸ�
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}





