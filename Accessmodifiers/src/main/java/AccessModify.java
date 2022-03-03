
public class AccessModify {

		public static void main(String[] args) {
			System.out.println("it is Access modifier");
			defaultclass dc = new defaultclass();
			dc.display();
			privateclass pc = new privateclass();
			pc.setName("choco");
			System.out.println("this is private "+pc.getName());
			
			
			}
		}


		
	class defaultclass
	{
		 void display()
		{
		System.out.println("this is a default modifier");
	    }
	}
	       
	class privateclass
		{
		private String name;
		public String setName() {
			return name;
		}
		public String getName() {
			// TODO Auto-generated method stub
			return null;
		}
		public void setName(String name)
		{
		this.name=name;
		
			
			
		 }
		  
	public class protectedclass 
	{
		protected void protecteddisplay()
		{
			System.out.println("this is a protected modifier");
		}
	}
		}

		

