public class MessageProcessor implements Runnable  {
	private int message;
	
	public MessageProcessor(int message) {
		this.message = message;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName()+" [Received] message  = "+message);
		respondtoMessage();
		System.out.println(Thread.currentThread().getName()+" [Done] Processing = "+message);
		
		
	}

	private void respondtoMessage() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Unable to process Message "+message);
			
		}
		
	}
}
