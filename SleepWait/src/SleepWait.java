

public class SleepWait {

	private static Object LOCK = new Object();
	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Thread" +Thread.currentThread().getName() + "is done");
          synchronized(LOCK)
          {
        	  LOCK.wait(2000);
        	  System.out.println("i am "+LOCK+ "here");
          }
	}

}
