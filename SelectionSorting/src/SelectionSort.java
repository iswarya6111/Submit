
import java.util.Scanner;
public class SelectionSort {

	public static void main(String[] args) {
		int n,b,c,p,swap;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input numbers of sort");
		 n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter" +n+"integer");
		
		for(b=0;b<n;b++) 
			arr[b]= sc.nextInt();
		for(b=0;b<n-1;b++) {
			p=b;
			for(c=b+1;c<n-1;c++) {
				if(arr[p]>arr[c]) {
				p=c;
				
				}
				if(p!=b) {
					swap = arr[b];
					arr[c]=arr[p];
					arr[p]=swap;
					
				}
			}
			System.out.println("sorted list of numbers");
			for(c=0;c<n;c++)
				System.out.println(arr[c]);
			 
			
		}
	}

}
