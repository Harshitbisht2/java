package pattern;

public class Pattern4 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<n*2; i++){
            int star=i>n?n*2-i:i;
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
