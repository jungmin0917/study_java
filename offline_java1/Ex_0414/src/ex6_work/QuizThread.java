package ex6_work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

public class QuizThread extends Thread{
	
	private int a; // 랜덤 a
	private int b; // 랜덤 b
	private int playCount = 0;
	private int count = 0; // 정답 맞힌 횟수
	private boolean isCheck = true;
	private long starttime = System.currentTimeMillis(); // 현재 시간 넣음
	private long endtime = 0;
	private double timer = 0;
	public int exectimer = 0;
	private final int FINISH = 5;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	// 문제 풀이 함수
	public void startGame() {
		while(count < FINISH) {
			isCheck = true;
			while(isCheck) { // 맞힐 때까지 반복
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
						System.out.println(String.format("정답입니다! 현재까지 %d개 맞히셨습니다", this.count));
					}else {
						System.out.println("오답입니다");
					}
					
				} catch (NumberFormatException e) {
					System.out.println("제대로 입력해주세요");
				} catch (IOException e) {
					System.out.println("제대로 입력해주세요");
				}
			}
		}
		
		// 여기서 작업이 끝날 때의 시간을 구함
		this.endtime = System.currentTimeMillis();
		this.timer = (this.endtime - this.starttime) / 1000.0;
		
		System.out.println(String.format("축하합니다! 총 %.1f초 걸리셨습니다 (currentTimeMillis로)", this.timer));
		System.out.println(String.format("총 %d번 시도하셨습니다", this.playCount));
		
		System.out.println(String.format("축하합니다! 총 %d초 걸리셨습니다 (Thread.sleep으로)", this.exectimer));
	}
	
	// 아래 run은 위의 startGame()이 돌아가든 안 돌아가든 백그라운드에서 동작을 한다
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










