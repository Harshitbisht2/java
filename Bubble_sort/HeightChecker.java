package Bubble_sort;
import java.util.Arrays;

public class HeightChecker {

    public static void main(String[] args) {
        int[] heights = {5, 6, 1, 4, 4, 5, 5, 2 ,3, 1};
        System.out.println(heightChecker(heights));
        System.out.println(Arrays.toString(bubbleSort(heights)));
    }

    static int heightChecker(int[] heights) {
        int[] sorted = bubbleSort(heights);
        int count=0;
        System.out.println(Arrays.toString(heights));
        for(int i=0; i<heights.length; i++){
            if(heights[i]!=sorted[i]) count++;
        }
        return count;
    }
    static int[] bubbleSort(int[] heights){
        int[] sorted = heights.clone();
        boolean swapped;
        int temp;
        for(int i=0; i<sorted.length-1; i++){
            swapped = false;
            for(int j=1; j<sorted.length-i; j++){
                if(sorted[j-1]>sorted[j]){
                    temp = sorted[j];
                    sorted[j] = sorted[j-1];
                    sorted[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        return sorted;
    }
}
