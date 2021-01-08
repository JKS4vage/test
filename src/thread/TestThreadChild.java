package thread;

public class TestThreadChild implements Runnable{
	
	public static void main(String[] args) {
		TestThreadChild tc = new TestThreadChild();
		new Thread(tc,"线程1").start();
		new Thread(tc,"线程2").start();
	}
	Object lock_A = new Object();
	Object lock_B = new Object();
	boolean flag = true;
	public void run() {
		while(true) {
			if(flag) {
				synchronized (lock_A) {
					synchronized (lock_B) {
						System.out.println(Thread.currentThread().getName()+"先获取lock_A,再获取lock_B");
					}
				}
			}else {
				flag = true;
			}
		}
	}

}
