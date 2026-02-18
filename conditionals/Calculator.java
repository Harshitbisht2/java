package conditionals;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        char operator='c';
        while(operator!='x' || operator!='X'){
            int ans=0;
            System.out.print("operator: ");
            operator=in.next().charAt(0);
            System.out.print("-> ");
            int op1=in.nextInt();
            System.out.print("->");
            int op2=in.nextInt();
            if(operator=='+' || operator=='-' || operator=='*' || operator=='/' || operator=='%'){
                if(operator=='+') ans=op1+op2;
                else if(operator=='-') ans=op1-op2;
                else if(operator=='*') ans=op1*op2;
                else if(operator=='/'){
                    if(op2!=0) ans=op1/op2; else break; }
                else if(operator=='%') ans=op1%op2;
                System.out.printf("= %d \n", ans);
            }else System.out.println("invalid operation!");
        }
    }
    
}
