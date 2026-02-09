package Selection_sort;

import java.util.Arrays;

public class SelectionSort2 {
    
    public static void main(String[] args) {
        int[] arr = {0, 3, 5, 1, 1, 4, 0};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int end = arr.length-i-1;
            int max = max(arr, end);
            if(arr[max]!=arr[end]) swap(arr, max, end);
            else continue;
        }
    }

    static int max(int[] arr, int end){
        int max = 0;
        for(int i=0; i<=end; i++){
            if(arr[i]>arr[max]) max=i;
        }
        System.out.println(arr[max]);
        return max;
    }

    static void swap(int[] arr, int max, int end){
        int temp=arr[end];
        arr[end]=arr[max];
        arr[max]=temp;
    }
}
