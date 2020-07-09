package lesson.knowledge.thread;

public class TestRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableDemo rd1 = new RunnableDemo();
		
		Thread t = new Thread(rd1);
		
		t.start();
		
		for(int i = 0; i < 20; i++) {
			System.out.println("Main : "+i);
		}

	}

}
