import java.util.Arrays;
import java.util.Scanner;
public class ExponentialSearch {

	public static int ExponentialSearch(int[] arr,int keyelement) {
		if(arr[0]==keyelement) {
			return 0;
			
				}
		   int i =1;
	       while( i<arr.length && arr[i]<= keyelement) {
			i=i*2;
		}
		   return Arrays.binarySearch(arr,i/2,Math.min(i,arr.length),keyelement);
		}
	public static void main(String[] args) {
		Scanner aw = new Scanner(System.in);
		System.out.println("enter the elements");
		int n   = aw.nextInt();
		int [] arr =new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("enter the numbers");
			arr[i]=aw.nextInt();
		}
		System.out.println("enter the element to be searched");
		int keyelement = aw.nextInt();
		 int mid= ExponentialSearch (arr,keyelement); 
			 if (mid>=0) {
                  System.out.println("the element is found " +keyelement+ "the position of is " +mid );
                 
			 } else {
				 System.out.println("element is not found");
			    
                	  
	}

	}
}
