import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[N]; // 바구니 배열
        
        for(int x=0;x<M;x++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            
            for(int t=(i-1);t<j;t++){
                a[t] = k;
            }
            
        }
        for(int x=0;x<N;x++)
            System.out.print(a[x]+" ");
    }
}