package cycle_sort;

import java.util.Arrays;

public class CyclicSort {
    
    public static void main(String[] args) {
        int[] arr = {3,1,2,6,4,5};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // cyclic sort for 1 to N.
    static void cyclicSort(int[] arr){
        int idx=0;
        int correct;
        while(idx<arr.length-1){
            correct = arr[idx]-1;  // formula for sorting array containing 1 to N numbers.
            if(correct!=idx) swap(arr, idx, arr[idx]-1);
            else idx++;
        }
    }
    static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
