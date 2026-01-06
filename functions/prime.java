package functions;

import java.util.Scanner;

public class prime {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check it is prime or not: ");
        int num = in.nextInt();
        boolean result = isPrime(num);
        if(result){
            System.out.println("it is a prime number.");
        }else{
            System.out.println("it is not a prime number.");
        }

    }

    static boolean isPrime(int n){
        
        if(n<=1){
            return false;
        }

        int c = 2;

        while (c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
