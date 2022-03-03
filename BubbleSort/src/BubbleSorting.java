
public class BubbleSorting {

	public static void bubbleSort(int[]arr) {
		int n = arr.length;
		int temp = 0;
		for(int i=0;i<n;i++) {
			for(int j=1;j<(n-i);j++) {
				if(arr[j-1]>arr[j]) {
					//swap elements
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}

	}
	public static void main (String[]args){
		int[]arr = {34,76,45,98,100,3,21};
		System.out.println("array before bubble sort");
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"");
			
		}
		System.out.println();
		bubbleSort(arr);
		System.out.println("array after bubble sort");
		for(int i =0 ; i<arr.length;i++) {
			System.out.println(arr[i]+ "");
			
			
		}
	}

}
