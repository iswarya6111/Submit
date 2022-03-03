
class Van extends Exception{
	  public Van(String y)
	  {
		  super(y);
	  }
}
 public class Custom
 {
	public static void main(String[] args) {
		
       try
       {
    	   throw new Van("mouse");
       }
       catch(Van v)
       {
    	   System.out.println("headphone");
    	   System.out.println(v.getMessage());
       }
	}

}
