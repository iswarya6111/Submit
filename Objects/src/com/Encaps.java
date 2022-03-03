package com;

class Encapsulations
{
	String name;
	
	int Dob;
	int sec;

	public String getname()
	{
		return name;
	}
	
	public int Dob()
	{
		return Dob;
	}
	public int sec()
	{
		return sec;
	}
	public void setname(String newname)
	{
		name = newname;
	}
	
		public void setDob(int newDob)
		{
		     Dob = newDob;
		}
		public void setsec(int  newsec)
		{
			sec = newsec;
		}
		
	}
		
public class Encaps {

	public static void main(String[] args) {
		{
			Encapsulations g =new Encapsulations();
			g.setname("mengi");
			g.setDob(432005);
			g.setsec(7);
			System.out.println("This is my name"+g.getname());
			System.out.println(" my Date of birth"+g.Dob());
			System.out.println("my class"+g.sec());
			
			
			
			
			
		}
	}

}
