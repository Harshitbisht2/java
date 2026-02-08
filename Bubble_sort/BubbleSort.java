package Bubble_sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {-1,2,6,2,0,-49};
        int[] sortedarr = bubbleSort(arr);
        System.out.println(Arrays.toString(sortedarr));
        int[] sortedarr2 = bubbleSort2(arr);
        System.out.println(Arrays.toString(sortedarr2));
        // foreach(int a:sortedarr){

        }
    static int[] bubbleSort(int[] arr){
        int swap = 0;
        int j = arr.length-1;
        int i = 0;
        int temp = 0;
        do{
            swap = 0;
            i=0;
            while(i<j){
                if(arr[i]>arr[i+1]) { //increasing order
                // if(arr[i]<arr[i+1]) { //decreasing order
                    swap(arr,i,i+1);
                    i++;
                    swap++;

                }
                else {i++;}
            
            }
            j--;
        }while(swap!=0);

        return arr;
    }

    static void swap(int[] arr, int s1, int s2){

        int temp = arr[s1];
        arr[s1] = arr[s2];
        arr[s2] = temp;

    }

    static int[] bubbleSort2(int[] arr){
        
        boolean swapped;
        for(int i=0; i<arr.length-1; i++){
            swapped = false;
            for(int j=1; j<arr.length-i; j++){
                // if(arr[j]<arr[j-1]){ //for non decreasing order
                if(arr[j]>arr[j-1]){    // for non increasing order
                    swap(arr, j-1, j); 
                    swapped = true;
                }  
            }
            if(!swapped) break;
        }

        return arr;
    }
}



