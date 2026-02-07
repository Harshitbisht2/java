package Binary_Search_2D;

public class Sorted2d2 {

    public static void main(String[] args) {
        int[][] arr = {{1,3}};
        // int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(arr, target));
    }
    
    static boolean searchMatrix(int[][] matrix, int target){
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int end = m*n-1;

        while(start<=end){

            int mid = start+(end-start)/2;
            int r = mid/n;
            int c = mid%n;
            int address = matrix[r][c];

            if(address==target) return true;
            else if(address>target) end=mid-1;
            else start=mid+1;
        }
        return false;
    }
}
