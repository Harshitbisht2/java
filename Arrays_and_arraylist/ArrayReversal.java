package Arrays_and_arraylist;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("create array of length: ");
        int l = in.nextInt();
        int[] arr = new int[l];

        for(int i=0; i<arr.length; i++){
            System.out.printf("element[%d]: ", i);
            arr[i] = in.nextInt();
        }

        System.out.println("Reversed array: " + Arrays.toString(reversal(arr)));
    }

    static int[] reversal(int[] arr){

        int start = 0;
        int end =  arr.length-1;
        while(start < end){

            // int temp = arr[start];
            // arr[start] = arr[end];
            // arr[end] = temp;
            swap(arr, start, end);
            start++;
            end--;
        }  
        return arr; 
    }

    static void swap(int[] arr, int s1, int s2){

        int temp = arr[s1];
        arr[s1] = arr[s2];
        arr[s2] = temp;
    }
    
}
    

