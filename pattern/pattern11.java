package pattern;

public class pattern11 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1; i<2*n; i++){
            int p=i>n?2*n-i:i;
            for(int j=1; j<2*n; j++){
                int q=j>n?2*n-j:j;
                int value=p<q?p:q;
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}
