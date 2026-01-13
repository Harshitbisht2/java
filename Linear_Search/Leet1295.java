package Linear_Search;
import java.util.Scanner;

public class Leet1295 {

    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        System.out.print("create an array of length: "); 
        int l = in.nextInt();       
        int[] arr = new int[l];
        for(int i=0; i<l; i++){
            System.out.printf("element[%d]: ", i);
            arr[i] = in.nextInt();
        }
        System.out.printf("elements having even no. of digits: %d", findNumbers(arr));


    }

    static int findNumbers(int[] nums){

        int count = 0;

        for(int i=0; i<nums.length; i++){

            int check = nums[i];
            int digit = 0;
            while(check!=0){
                
                check /= 10;
                digit++;
            }
            if(digit%2==0) count++;
        }
        return count;
    }
    
}
