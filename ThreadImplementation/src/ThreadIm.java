
class D extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("l"+i);
		}
	}

		
	}

class F extends Thread{
	public void run() {
		for(int j=1;j<6;j++) {
			System.out.println("j"+j);
		}
	}
}
public class ThreadIm {

	public static void main(String[] args) {
		D obj1 = new D();
		F obj2 = new F();
		obj1.start();
		obj2.start();
	}

}
