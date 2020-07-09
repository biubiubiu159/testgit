package lesson.knowledge.thread;

public class ThreadDemo extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
