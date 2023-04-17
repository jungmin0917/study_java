package ex6_work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

public class QuizThread extends Thread{
	
	private int a; // ���� a
	private int b; // ���� b
	private int playCount = 0;
	private int count = 0; // ���� ���� Ƚ��
	private boolean isCheck = true;
	private long starttime = System.currentTimeMillis(); // ���� �ð� ����
	private long endtime = 0;
	private double timer = 0;
	public int exectimer = 0;
	private final int FINISH = 5;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	// ���� Ǯ�� �Լ�
	public void startGame() {
		while(count < FINISH) {
			isCheck = true;
			while(isCheck) { // ���� ������ �ݺ�
				try {
					Random rand = new Random();
					
					this.a = rand.nextInt(1, 100);
					this.b = rand.nextInt(1, 100);
					
					System.out.println(String.format("%d + %d = ?", a, b));
					
					int ans = Integer.parseInt(br.readLine());
					
					this.playCount++;
					if(ans == a + b) {
						isCheck = false;
						count++;
						System.out.println(String.format("�����Դϴ�! ������� %d�� �����̽��ϴ�", this.count));
					}else {
						System.out.println("�����Դϴ�");
					}
					
				} catch (NumberFormatException e) {
					System.out.println("����� �Է����ּ���");
				} catch (IOException e) {
					System.out.println("����� �Է����ּ���");
				}
			}
		}
		
		// ���⼭ �۾��� ���� ���� �ð��� ����
		this.endtime = System.currentTimeMillis();
		this.timer = (this.endtime - this.starttime) / 1000.0;
		
		System.out.println(String.format("�����մϴ�! �� %.1f�� �ɸ��̽��ϴ� (currentTimeMillis��)", this.timer));
		System.out.println(String.format("�� %d�� �õ��ϼ̽��ϴ�", this.playCount));
		
		System.out.println(String.format("�����մϴ�! �� %d�� �ɸ��̽��ϴ� (Thread.sleep����)", this.exectimer));
	}
	
	// �Ʒ� run�� ���� startGame()�� ���ư��� �� ���ư��� ��׶��忡�� ������ �Ѵ�
	@Override
	public void run() {
		while(isCheck) {
			try {
				Thread.sleep(1000);
				exectimer++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}










