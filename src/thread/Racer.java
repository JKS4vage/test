package thread;
/*
 * ģ���������
 */
public class Racer implements Runnable {
	private static String winner;
	@Override
	public void run() {
		for(int steps=1;steps<=100;steps++) {
			//ģ����Ϣ
			if(Thread.currentThread().getName().equals("����")&&steps%10==0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+"--->"+steps);
			//�����Ƿ����
			boolean flg=gameOver(steps);
			if(flg) {
				break;
			}
		}

	}
	private boolean gameOver(int steps) {
		if(winner!=null) {
			return true;
		}else {
			if(steps==100) {
				winner=Thread.currentThread().getName();
				System.out.println("Winner is"+winner);
				return true; 
			}

		}
		return false;	
	}
	
	public static void main(String[] args) {
		Racer racer=new Racer();
		new Thread(racer,"�ڹ�").start();
		new Thread(racer,"����").start();
		
	}
}
