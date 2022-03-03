
import java.util.regex.Pattern;

import java.util.regex.Matcher;

public class EmailValidation {

	
	public static void main(String[] args) {
		
		System.out.println("verify your id");
		
		
		String pattern ="[a-z]+\\d+@[a-z]+\\.com";
		String name = "ishu3@hp.com";
		Pattern pt = Pattern.compile(pattern);
		Matcher mt = pt.matcher(name);
	   
		   if(mt.matches()) {
			   System.out.println(name+ "Email id is valid");
		   }else 
		      System.out.println(name+ "Email is not valid" );
				   
		   }
		   
			
		}

	
