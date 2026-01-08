package Arrays_and_arraylist;
import java.util.Scanner;
import java.util.ArrayList;

public class MultidimentionalArrayList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("list[%d][%d]: ", i, j);
                list.get(i).add(in.nextInt());
            }
        }

        for(ArrayList<Integer> i : list){
            System.out.println(i);
        }

    }
}
