package lesson.knowledge.thread;

public class TestThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo td1 = new ThreadDemo();
		ThreadDemo td2 = new ThreadDemo();
		
		td1.start();
		td2.start();

	}

}
