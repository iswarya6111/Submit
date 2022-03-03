
public class ConstructorWithTypes{
	 private String Name;
	 
	 public ConstructorWithTypes(String name) {
	 this.Name=Name;
	 
	 
	 System.out.println("this is parameterized constructor");
	 }
	 public ConstructorWithTypes() {
		// TODO Auto-generated constructor stub
	}
	{
	 System.out.println("this is non - parameterized constructor");
	 }
  public void setName(String Name) {
	  this.Name=Name;
	  
  }
  public String getName(){
  return Name;
  }
  
  
  public static void main(String args[]) {
	  ConstructorWithTypes h = new ConstructorWithTypes ();
	  ConstructorWithTypes h1 = new ConstructorWithTypes("ice cream");
	  h1.setName("ice cream");
	  System.out.println("the passed parameter" + h1.getName());
	  
  }
 }