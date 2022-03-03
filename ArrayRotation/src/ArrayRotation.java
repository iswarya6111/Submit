
class Array { 
public void rotate(int[] nums, int z) {
    		if(z > nums.length) 
       			z=z%nums.length;
 		int[] result = new int[nums.length];
 		for(int i=0; i < z; i++){
        			result[i] = nums[nums.length-k+i];
 		}
 		int j=0;
    		for(int h=z; h<nums.length; h++){
        			result[h] = nums[j];
j++;
    		}
 		System.arraycopy( result, 0, nums, 0, nums.length );
}
} 
public class ArrayRotation
{
	public static void main(String[] args) {
		Array r = new Array();
        		int arr[] = { 7, 8, 0, 9, 3, 6, 7 }; 
        		r.rotate(arr, 5); 
        		for(int i=0;i<arr.length;i++){
            			System.out.print(arr[i]+" ");
        		}
	}
}
