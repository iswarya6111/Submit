public class EmployeeDetail {
	     String name;
	     String companyname;
	     int age;
	    int emid;
		
	     public EmployeeDetail(String name,String companyname, int age,int emid )
	     {
	     
	    	 this. name = name;
	    	 this. companyname = companyname;
	    	 this.age = age;
	    	 this.emid = emid;
	     }
	     public String geName()
	     {
	    	 return name;
	     }
	     public String getCompanyName()
	     {
	    	 return companyname;
	     }
	     public int getAge()
	     {
	    	 return age;
	     }
	     public int getEmid()
	     {
	    	 return emid;
	     }
	     
	     public String toString()
	     {
	    	 return("My name is "+this.geName()+"\n My companyname is "+this.getCompanyName()+"\n age"+this.getAge()+"\n my location is "+this.getEmid());
	    	 
	     }
	     
		public static void main(String[] args) {
			
				EmployeeDetail ed =new EmployeeDetail("hari", "mphasis", 23,23456);
				System.out.println(ed.toString());
			}
	

	}


