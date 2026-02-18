package pattern;

public class Pattern8 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=5*2-1; i++){
            int star=i>5?n*2-i:i;
            int space=n-star;            
            for(int j=0; j<space; j++){
                System.out.print(" *");
            }
            for(int j=1; j<=star; j++){
                if(j==1 || j==star){
                    System.out.print("  ");
                }
                else{
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
    
}
