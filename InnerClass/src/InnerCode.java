
public class InnerCode {
	private String name ="padma";
	void mname() {
		System.out.println("Welcome...What is your name" + name );
	}
	
	class Inner{
		private String clg=("Dhanalakshmi Srinivasan Institute of Technlogy");
		   void cname(){
			   System.out.println("college name:" +clg);
		   }
		class Department{
			String branchname =("B.E"); 			   
			     
			   void yr(){
				  
				   System.out.println(branchname +"Computer science Department");
			   }
		}
	}

	public static void main(String[] args) {
		InnerCode ds= new InnerCode();
		InnerCode.Inner in = ds.new Inner();
		Inner.Department dp = in.new Department();
		ds.mname();
		in.cname();
		dp.yr();
		
		
		

	}

}
