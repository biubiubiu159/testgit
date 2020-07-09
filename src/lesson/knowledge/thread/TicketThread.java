package lesson.knowledge.thread;

public class TicketThread implements Runnable{
	
	private int num = 50;
	private int ID = 1;
	
	//synchronized 锁标志，对方法上锁
//	public synchronized void saleTicket() {
//		
//		if(num > 0) {
//			System.out.println(Thread.currentThread().getName()+" NO."+ID);
//			num--;
//			ID++;
//		}
//		
//	}
	//对代码块上锁
	public void saleTicket() {
		synchronized (this) {
			if(num > 0) {
				System.out.println(Thread.currentThread().getName()+" NO."+ID);
				num--;
				ID++;
			}
		}
			
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
		    if(num > 0) {
		    	this.saleTicket();
		    	try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }else {
		    	break;
		    }
		}
	}

}
