
interface Ocean
{
	default void show()
	{
		System.out.println("Default  ocean");
	}
}
interface Sea
{
	default void show()
	{
		System.out.println(" Default Sea");
	}
}
public class TestInterface implements Ocean,Sea {
         public void show()
         {
        	Ocean.super.show();
        	Sea.super.show();
         }
	public static void main(String[] args) {
		TestInterface ry = new TestInterface();
		 ry.show();

	}

}