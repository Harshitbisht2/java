package pattern;

public class Pattern2 {
    public static void main(String[] args) {
        int n=4;
        for(int i=n; i>=0; i--){
            int p = 1;
            for(int j=0; j<n-i; j++){
                System.out.print(" "+p);
                p++;
            }
            System.out.println();
        }
    }
    
}
