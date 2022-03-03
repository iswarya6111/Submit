
import java. util.*;
public class LinearSearch {

	public static void main (String args[]) {
		Scanner sn = new Scanner(System.in);
		System.out.println("enter the values");
		int n = sn.nextInt();
		int [] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("enter the numbers");
			arr[i]=sn.nextInt();
		}
		System.out.println("lineraSearch is created");
		System.out.println("enter the element to be searched");
		int m = sn.nextInt();
		 for (int i=0;i<n;i++) {
			 if (arr[i]==m) {
                  System.out.println("the element is found " +m+ "the position of is " +i );
                  break;
			 } else
				 System.out.println("element is not found");
			     break;
                	  
			 }
		 }
		
		
		

	}


