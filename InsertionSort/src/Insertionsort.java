
public class Insertionsort {

    public static  void main(String[] args){

        int[] in = {29,12,31,90,77};
        insertionSort(in);
        for(int i=0;i<in.length;i++){

            System.out.println(in[i]);

        }
     }
    public static void insertionSort(int[] bv){

    int len = bv.length;
    for(int j=1;j<len;j++){
    int key = bv[j];
    int i=j-1;
    while ((i>-1) && (bv[i]>key)){

        bv[i+1]=bv[i];
        i--;
    }
    bv[i+1]=key;
         }

    }
}
