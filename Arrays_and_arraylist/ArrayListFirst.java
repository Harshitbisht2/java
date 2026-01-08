package Arrays_and_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListFirst {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner in = new Scanner(System.in);
        System.out.print("enter the max: ");
        int max = in.nextInt();
        
        for(int num = 1; num <= max; num+=2){

            list.add(num);    
        }

        System.out.println(list);

        for(int i : list){
            System.out.print(i + ", ");
        }
        System.out.println();

        
    }
}
