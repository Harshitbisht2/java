package Linear_Search;
import java.util.Scanner;
public class ElementExistance {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Create an array of length: ");
        int l = in.nextInt();
        int[] arr = new int[l];

        for(int i=0; i<l; i++){
            System.out.printf("element[%d]: ", i);
            arr[i] = in.nextInt();
        }

        System.out.print("search for element: ");
        int el = in.nextInt();

        int result = linearSearch(arr, el);

        if(result == -1){
            System.out.println("element not found!");
        }
        else{
            System.out.printf("found at index %d", result);
        }
    }

    //time complexity in best case: O(1)
    //time complexity in worst case: O(N), where n is the number of element in the array.
    static int linearSearch(int[] arr, int el){

        if(arr.length == 0){
            return -1;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] == el){
                return i;
            }
        }

        return -1;
    }
}
