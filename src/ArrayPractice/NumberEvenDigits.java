package ArrayPractice;

import java.util.*;

public class NumberEvenDigits {

    public static void main(String args[]){
        int[] nums={112, 134, 2782, 276527};
        List<Integer> list=new ArrayList<>();
        int z=0;


        for(int i=0; i<nums.length;i++){
           int j=1;
           int k=nums[i];
            while(k/10!=0){
               k= k/10;
                j++;
            }
            list.add(j);
        }
        for(int a:list){
           if(a%2==0){
               z++;
           }
        }
        System.out.println(z);
    }
}
