package Arrays_and_arraylist;
import java.util.Arrays;
import java.util.Scanner;

public class ReplaceArrayElements {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0; i<5; i++){
            System.out.printf("array[%d]: ", i);
            arr[i] = in.nextInt();
        }
        System.out.println();

        System.out.print("Replace: ");
        int re1 = in.nextInt();
        System.out.print("with: ");
        int re2 = in.nextInt();

        System.out.println("initial Array: " + Arrays.toString(arr));

        replace(arr, re1, re2);

        System.out.println("edited array: " + Arrays.toString(arr));
    }

    static void replace(int[] arr, int re1, int re2){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == re1){
                arr[i]=re2;
            }
        }
    }
    
}
