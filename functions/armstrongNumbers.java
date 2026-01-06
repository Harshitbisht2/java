package functions;

// Armstrong number are those numbers whose sum of cube of every individual digit is equal to the original number.

import java.util.Scanner;
public class armstrongNumbers {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:  ");
        int n = in.nextInt();
        boolean result = armstrongNumber(n);
        // System.out.println(result);
        if(result){
            System.out.println("Given number is an Armstrong number.");
        }else{
            System.out.println("The given number is not an Armstrong number.");
        }
    }
    
    static boolean armstrongNumber(int a){
        int original = a;
        int sum = 0;
        while(a > 0){
            int rem = a % 10;
            a = a/10;
            sum += rem*rem*rem;
        }
        return sum == original;
    }
}
