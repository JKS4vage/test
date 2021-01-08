package thread;

public class Test {

	public static void main(String[] args) {
		//一份资源
		Web12306 web=new Web12306();
		System.out.println(Thread.currentThread().getName());
		//多个代理
		new Thread(web,"码畜").start();
		new Thread(web,"码农").start();
//		new Thread(web,"macm").start();
		
	}
}
