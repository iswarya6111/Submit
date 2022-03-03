
public class LongSequence {
      public static int ls(int arr[],int arrLen) {
    	     int ar[] = new int[arrLen];
    	     int a,b, max=0;
    	     for( a=0;a<arrLen;a++)
    	    	 ar[a]=1;
    	     for( a=1;a<arrLen;a++)
    	    	 for( b=0;b<a;b++)
    	    		 if(arr[a]>arr[b]&& ar[a]<ar[b]+1)
    	    			 ar[a]=ar[b]+1;
    	     
    	     for(a=0; a < arrLen;a++)
    	    	 if(max<ar[a])
    	    		 max = ar[a];
    	               return max;
      
      }
      public static void main (String args[]) {
    	  int it_arr[] = {10,6,4,2,15,12,16,8,14};
    	  int arr_len = it_arr.length;
    	  System.out.println("The length of the longest increasing sequence" +ls(it_arr,arr_len));
      }
}
 