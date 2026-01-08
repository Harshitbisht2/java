package Arrays_and_arraylist;
import java.util.Arrays;
import java.util.Scanner;

public class SwapArrayElement {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i=0; i<5; i++){
            System.out.printf("array[%d]: ", i);
            arr[i] = in.nextInt();
        }
        System.out.println();

        System.out.print("Swap Index: ");
        int s1 = in.nextInt();
        System.out.print("with: ");
        int s2 = in.nextInt();

        System.out.println(Arrays.toString(arr));

        swap(arr, s1, s2);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int s1, int s2){

        int temp = arr[s1];
        arr[s1] = arr[s2];
        arr[s2] = temp;
    }
}
