package pattern;

public class Pattern5 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0; i<n*2; i++){
            int star=i>=n?i-(n-1):n-i;
            int space=n-star;
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }
            for(int j=0; j<star; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    
}
