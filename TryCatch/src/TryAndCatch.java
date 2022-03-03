

public class TryAndCatch {

	public static void main(String[] args) {
		int[]array=new int[5];
		try {
			array[3]=5;
		}
          catch(Exception e)
		{
       System.out.println("Find length of an array");
        }
         finally
    {
	System.out.println("array size"+array.length);
        }
     }
}

