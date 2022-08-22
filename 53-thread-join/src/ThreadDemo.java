public class ThreadDemo extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {

		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo t2 = new ThreadDemo();
		ThreadDemo t3 = new ThreadDemo();
		t1.start();
		try {
			t1.join();
			}catch (Exception e) {
			System.out.println(e);
		}
		t2.start();
		try {
			t2.join(2000);
			}catch (Exception e) {
			System.out.println(e);
		}		
		t3.start();
	}
}