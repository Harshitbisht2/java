package Arrays_and_arraylist;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("create array of length: ");
        int l = in.nextInt();
        int[] arr = new int[l];

        for(int i=0; i<arr.length; i++){
            System.out.printf("element[%d]: ", i);
            arr[i] = in.nextInt();
        }

        System.out.println("The greatest element is "+maximumElement(arr));
    }
    static int maximumElement(int[] arr){

        int max = 0;
        for(int i : arr){
            if(i>max){
                max = i;
            }
        }
        return max;
    }
    
}
