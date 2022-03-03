
class Dap extends Exception{
	public Dap() {
	
	}
		public Dap(String name) {
			super(name);
		}
	}

public class Throw {

	public static void main(String[] args) {
		int x = 34;
	      int g=10;
		try
		{
			if (x>g)
				throw new ArithmeticException("x>g");
		else {
		
		
		System.out.println("\n\t the method is not valid");
	}

   }
		catch(Exception e)
		{
			
		System.out.println(e);
}
	}
}

	


