package Linear_Search;
import java.util.Scanner;

public class SearchInString { 

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = in.nextLine();
        System.out.println("character to find: ");
        String c = in.next();
        char ch = c.charAt(0);

        int result = linearSearchString(str, ch);

        if(result == -1){
            System.out.println("character not found.");
        }
        else{
            System.out.printf("found at index %d", result);
        }
    }
    
    static int linearSearchString(String str, char target){

        if(str.length() == 0) return -1;

        for(int i=0; i<str.length(); i++){
            if(target == str.charAt(i))  return i;     
        }

        return -1;
    }
}

