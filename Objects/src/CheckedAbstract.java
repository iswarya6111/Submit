
abstract class Land
{
	String shape;
	abstract double area();
	public abstract String toString();
	public Land(String shape)
	{
		System.out.println("Land is for sale");
		this.shape=shape;
	}

   public String getshape()
   {
	   return shape;
   }
}
class SemiCircle extends Land
{
	double area;

public SemiCircle(String dimension,double area)
{
	super(dimension);
	System.out.println("otherLand compariosn");
    this.area = area;
}
double area()
{
	return Math.PI*Math.pow(area,4);
}
public String toString()
{
	return "SemiCircle is" +super.shape+ "and area is" +area();
}
}

public class CheckedAbstract {

	public static void main(String[] args) {
		Land l1 = new SemiCircle("rectangle",3);
		System.out.println(l1.toString());

	}

}
