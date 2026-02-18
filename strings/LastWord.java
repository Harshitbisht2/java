package strings;

public class LastWord {
    
    public static void main(String[] args) {
        String s="My name is Harshit ";
        System.out.println(lengthOfLastWord(s));
    }
    static int lengthOfLastWord(String s) {
        int length=s.length();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                length=s.length()-i-1;
            }
        }
        return length;
    }
}

