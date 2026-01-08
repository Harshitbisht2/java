package Arrays_and_arraylist;

import java.util.Arrays;

public class ArraysInFunction {
    public static void main(String[] args) {
        String[] arr = {"Harshit", "Bisht", "HB", "HarshitBisht", "BishtHarshi"};
        System.out.println(Arrays.toString(arr));
        editArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void editArray(String[] arr){
        arr[4] = "Harshi who?";
    }
}
