
import java.io.*;
public class QuickSort {
	
	   public static void sort(int arr[], int i,int j){
	     int temp = arr[i];
	     arr[i] =arr[j];
	     arr[j]=temp;
	}
	   public static int partition(int[]arr,int f,int l){
	         
	     int pivot = arr[l];
	     int i =(f-1);
	          for (int j=f ;j<=l;j++)
	            {
	              if(arr[j]<pivot)
	                 {
	                      i++;
	                      sort(arr,i,j);
	  }
	}
	           sort(arr,i+1,l);
	            return(i+1);
	}
	static void  quicksort(int[] arr,int f, int l)
	{
	  if (f<l)
	{
	int pi = partition(arr,f,l);
	quicksort(arr, f, pi - 1);
	        quicksort(arr, pi + 1, l);
	    }
	}
	
		
	
	static void printArray(int[] arr, int size)
	{
	    for(int i = 0; i < size; i++)
	        System.out.print(arr[i] + " ");
	         
	    System.out.println();
	}


	
	public static void main(String[] args) {
		
		    int[] arr = { 67, 15, 13, 18, 11, 5 };
		    int n = arr.length;
		     
		    quicksort(arr, 0, n - 1);
		    System.out.println("Sorted array: ");
		    printArray(arr, n);
		}
		}
		 
		 