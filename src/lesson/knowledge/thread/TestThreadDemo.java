package lesson.knowledge.thread;

public class TestThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo td1 = new ThreadDemo();
		
//		td1.run(); 
		td1.start();
		
		for(int i = 0; i < 20; i++) {
			System.out.println("Main : "+i);
		}

	}

}
