package pattern;

public class Pattern10 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1; i<n*2; i++){
            int p=i>n?n*2-i:i;
            int space=n-p;
            for(int j=0; j<space; j++){
                System.out.print("  ");
            }
            for(int j=p;j>0;j--){
                System.out.print(j+" ");
            }
            for(int j=2; j<=p; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
}
