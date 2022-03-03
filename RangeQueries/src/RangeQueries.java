
public class RangeQueries
{ 
    static int f = 20;
    static int N = 550000; 
    static long table[][] = new long[N][f + 1]; 
    static void buildSparseTable(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            table[i][0] = arr[i]; 
        for (int j = 1; j <= f; j++) 
            for (int i = 0; i <= n - (1 << j); i++) 
                table[i][j] = table[i][j - 1] + table[i + (1 << (j - 1))][j - 1]; 
    } 
    static long query(int L, int R) 
    {
        long number = 0; 
        for (int j = f; j >= 0; j--)  
        { 
            if (L + (1 << j) - 1 <= R)  
            { 
                number = number + table[L][j];
                L += 1 << j; 
            } 
        } 
        return number; 
    }
    public static void main(String args[]) 
    { 
        int arr[] = { 18, 4, 20,15, 83, 9 }; 
        int n = arr.length; 
        buildSparseTable(arr, n); 
        System.out.println(query(0, 4)); 
        System.out.println(query(1, 6)); 
        System.out.println(query(9, 3)); 
    } 
}
