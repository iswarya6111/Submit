
class Students implements Runnable{
		int avl = 1;		
		public synchronized void run() {    // with synchronization
			Thread t =Thread.currentThread();
			String name = t.getName();
			if(avl==1) {
				System.out.println(name+ "you can join the class ");
				avl=avl-1;
				}else {
					System.out.println(name+ "sorry Date of joining is closed");
					
				}
			}
	}
class Student1 implements Runnable{  // without synchronization
	int avl=1;
	public void run() {
		Thread t =Thread.currentThread();
		String name =t.getName();
		if (avl==1) {
			System.out.println(name + "u r selected");
			
		}else {
			System.out.println(name + "u r not selected");
		}
	}
}
public class MultithreadingSynchronize {

	public static void main(String[] args) {
		Students s1 =new Students();
		Students s2 = new Students();	
		Students s3 = new Students();
		
		Student1 s5 = new Student1();
		Student1 s6 = new Student1();
		Student1 s7 = new Student1();
		Thread t1 = new Thread (s1);
		Thread t2 = new Thread (s1);
		Thread t3 = new Thread (s1);
		
		Thread t11 = new Thread (s5);
		Thread t12 = new Thread (s5);
		Thread t13 = new Thread (s5);
		
		t1.setName("hari");
		t2.setName("ice");
		t3.setName("choco");
		
		t11.setName("ishu");
		t12.setName("lit");
		t13.setName("mag");
		
		t1.start();	
		t2.start();
		t3.start();
		
		t11.start();
		t12.start();
		t13.start();
		
		
	}

}
