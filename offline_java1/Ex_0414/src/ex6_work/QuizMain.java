package ex6_work;

public class QuizMain {
	public static void main(String[] args) {
		
		// QuizThread 클래스 만들고 스레드 상속받는다
		// startGame() 메소드 만들고, 그 안에서 1 ~ 100 사이의 난수 두 개를 합하는 문제를 출제
		// 키보드에서 답을 입력받아 5문제가 정답처리 될 때까지 반복한다
		// 정답을 맞히고 난 후에 모든 문제를 맞히는데 몇 초가 걸렸는지 화면에 출력하며 프로그램 종료
		
		QuizThread qt = new QuizThread();
		
		qt.start();
		qt.startGame();
	}
}
