package Binary_Search_2D;

public class Sorted2DMatrix {
    
    public static void main(String[] args) {
        int[][] arr = {{1,3}};
        // int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(arr, target));
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length-1;
        int cols = matrix[0].length-1;

        if(rows == 0) {
            return binarySearch(matrix, target, 0, 0, cols);
        }

        int cmid = cols/2;
        int start = 0;
        int end = rows;

        while(start<end-1){

            int mid = start+(end-start)/2;

            if(matrix[mid][cmid]==target)return true;
            else if(matrix[mid][cmid]>target) end = mid;
            else start = mid;

        }
        //after this loop we will be left with only two rows. and we will divide them into 4 sections.

        if(matrix[start][cmid]==target || matrix[end][cmid]==target) return true;
        else if(binarySearch(matrix, target, start, 0, cmid)) return true; // check for first part (top left)
        else if(binarySearch(matrix, target, end, 0, cmid)) return true; // check for second part (bottom left)
        else if(binarySearch(matrix, target, start, cmid+1, cols)) return true; // check for third part (top right)
        else if(binarySearch(matrix, target, end, cmid+1, cols)) return true; //fourth part (bottom right)
        return false;
    }

    static boolean binarySearch(int[][] matrix, int target, int row, int cstart, int cend){

        while(cstart <= cend) {

            int mid = cstart + (cend - cstart)/2;

            if(matrix[row][mid]==target) return true;
            else if(matrix[row][mid]>target) cend=mid-1;
            else cstart=mid+1;
        }
        return false;
    }
}
