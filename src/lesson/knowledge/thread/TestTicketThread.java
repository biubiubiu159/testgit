package lesson.knowledge.thread;

public class TestTicketThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketThread tt1 = new TicketThread();
		
		Thread t1 = new Thread(tt1);
		Thread t2 = new Thread(tt1);
		Thread t3 = new Thread(tt1);
		Thread t4 = new Thread(tt1);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
