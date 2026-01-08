package Arrays_and_arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class ObjectArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] arr = new String[5];

        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextLine();
        }
        System.out.println(Arrays.toString(arr));

    }
}
