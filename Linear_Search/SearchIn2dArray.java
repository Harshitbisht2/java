package Linear_Search;
import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2dArray {

    public static void main(String[] args) {
                
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] result = LinearSerch2d(arr, 6);

        if(result[0]==-1){
            System.out.println("not found");
        }
        else{
            System.out.printf("found at row %d and column %d", result[0]+1, result[1]+1);
        }
    }
    
    static int[] LinearSerch2d(int[][] arr, int el){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == el){
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {-1, -1};
    }
}
