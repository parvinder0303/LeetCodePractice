package ArrayPractice;

import java.util.Arrays;

public class SortedSquaresArray {
    public static void main(String args[]) {

        int[] arr = {1, 4, 2, 9, 5};
        int[] ar = new int[arr.length];
        int k;

        for (int i = 0; i < arr.length; i++) {
            int j = arr[i] * arr[i];
            ar[i] = j;
        }

        Arrays.sort(ar);
        for(int i=0; i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        for (int i = 1; i<ar.length; i++) {
            for(int j=0;j<ar.length-1;j++){
             k=ar[j];
                if(k>ar[j+1]){

                    ar[j]=ar[j+1];
                    ar[j+1]=k;
                }
               // System.out.print(ar[j]+" ");

            }
           // System.out.print(ar[i]+" ");
        }
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }
}
