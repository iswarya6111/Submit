
public class Throws {
          void Divison()throws ArithmeticException 
          {
			int x = 34,g=0,gx;
			gx=x/g;
			System.out.println("\n\t value is:"+gx);
          }
          public static  void main(String args[]) {
        	  Throws T = new Throws();
			try
			{
				T.Divison();						
			}
	   
			catch(ArithmeticException ew)
			{
				System.out.println("\n\tError:"+ew.getLocalizedMessage());
			}
			System.out.println("\n\t Program got error");
	}

		


	}


