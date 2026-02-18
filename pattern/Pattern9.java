package pattern;

public class Pattern9 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=5; i++){
            int space=n-i;
            for(int j=0; j<space; j++){
                System.out.print("  ");
            }
            for(int j=i;j>0;j--){
                System.out.print(j+" ");
            }
            for(int j=2; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
    
}
