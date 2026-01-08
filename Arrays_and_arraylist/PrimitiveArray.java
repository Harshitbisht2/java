package Arrays_and_arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class PrimitiveArray {
    public static void main(String[] args){
        Scanner in =  new Scanner(System.in);
        int[] arr = new int[5]; 

        for(int i = 0; i < arr.length; i++){
            System.out.print("a["+i+"]: ");
            arr[i] = in.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //       or you can use for-each loop

        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();


        //       or you can use .toString() method

        System.out.println(Arrays.toString(arr));
    }
}
