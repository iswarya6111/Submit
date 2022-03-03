
public class Final {

		public static void main(String[] args) {
			int x=4,g=0,gx =0;
			try
			{
				gx = x/g;
			}
			catch(ArithmeticException ew)
			{
				System.out.println("\n\tError:"+ew.getMessage());
			}
			finally
			{
			System.out.println("\n\t the value:" + gx);
	    }

	}
}

