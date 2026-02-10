package Selection_sort;

import java.util.Arrays;

public class SelectionSort {
    
    public static void main(String[] args) {
        int[] arr = {5,7,4,0,1,0,7,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){

        for(int i=0; i<arr.length; i++){
            int min = min(arr, i);
            if(arr[min]!=arr[i]){
                swap(arr, min, i);
            } else continue;   
        }
    }

    static int min(int[] arr, int start){
        int min=arr.length-1;
        for(int i=start; i<arr.length; i++) {
            if(arr[i]<arr[min]) min=i;
        }
        return min;
    }

    static void swap(int[] arr, int min, int start){
        int temp;
        temp = arr[min];
        arr[min]=arr[start];
        arr[start]=temp;
    }

}
