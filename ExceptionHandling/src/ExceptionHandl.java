
class ExHa extends Exception{
	
	
	String name="tamil";
	ExHa(String english){
		name=english;
	}
	public String toString() {
		return(name);
	}
}
public class ExceptionHandl {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("check the language");
			throw new ExHa("getting error");
			
		}
		catch(ExHa str) {
			System.out.println("catch block");
			System.out.println(str);
		}
		
	}
 }