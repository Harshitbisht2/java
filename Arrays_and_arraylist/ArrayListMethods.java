package Arrays_and_arraylist;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        //to add element in list as user input:
        for(int i = 0; i < 5; i++ ){
            System.out.printf("list[%d]: ", i);
            list.add(in.nextInt());
        }

        //to display the elements of the Arraylist:
        for(int i = 0; i < 5; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //tells if the ArrayList contains an element or not. : {ArrayList.contains(element)}
        System.out.println(list.contains(3));

        //changes an element of the given index:  {ArrayList.set(index, newElement)}
        list.set(0,99);
        System.out.println(list);

        //removes an element from the given index;  {ArrayList.remove(index)}
        list.remove(3);
        System.out.println(list);
    }
}
