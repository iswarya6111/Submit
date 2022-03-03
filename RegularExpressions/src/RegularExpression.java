import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		String pattern="\\w{3,10}\\d{10}";
		
		String check="ishu1234908675";
		Pattern pu = Pattern.compile(pattern);
		Matcher c = pu.matcher(check);
	    
	   
		if(c.find()) {
			System.out.println("your pattern is correct");
		}else
		{
			System.out.println("your pattern is not correct");
		
			
		}

	}

	}

