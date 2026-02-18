package pattern;

public class Pattern6 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n; i>0; i--){
            int space=n-i;
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if(i==n || j==1 || j==i){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
