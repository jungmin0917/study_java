package ex6_work;

public class QuizMain {
	public static void main(String[] args) {
		
		// QuizThread Ŭ���� ����� ������ ��ӹ޴´�
		// startGame() �޼ҵ� �����, �� �ȿ��� 1 ~ 100 ������ ���� �� ���� ���ϴ� ������ ����
		// Ű���忡�� ���� �Է¹޾� 5������ ����ó�� �� ������ �ݺ��Ѵ�
		// ������ ������ �� �Ŀ� ��� ������ �����µ� �� �ʰ� �ɷȴ��� ȭ�鿡 ����ϸ� ���α׷� ����
		
		QuizThread qt = new QuizThread();
		
		qt.start();
		qt.startGame();
	}
}
