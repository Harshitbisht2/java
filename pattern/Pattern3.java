package pattern;

public class Pattern3 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<n*2; i++){
            int col=i>n ? n*2-i : i;
            for(int j=0; j<col; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    
}
