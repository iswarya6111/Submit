
import java.util.*;
		public class ArithMeticCalculator {

			public static void main(String[] args) {
				int a,b,choice;
				 float result=0;
				Scanner Value = new Scanner(System.in);
				System.out.println("Enter the number");
				a = Value.nextInt();
				System.out.println("Enter the number");
				b = Value.nextInt();
				
				System.out.println("Enter the symbol for the result");
				System.out.println("\n1. + , \n2. -,\n3. *,\n4. /, \n5. %");
				choice = Value.nextInt();
				switch (choice)
				{

				case 1:
					  result = (a+b); 
					  break;
			    case 2:
						result = (a-b); 
						break;
				case 3:
					      result = (a*b); 
						  break;
				 case 4:
					      result = (a/b); 
						  break;
				  case 5:
						result =(a%b);
				        break;				  
			               
			      default:
				          System.out.println("An invalid choice");
				}
				   if(choice>=1 && choice<=5)
					   System.out.println("The result is : "+result);
			}
			
				

			



	}


