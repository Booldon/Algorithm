import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        int cnt = 0;
        
        for(int i=0;i<N;i++){
            a[i] = sc.nextInt();
            
            if(a[i] < X){
                b[cnt] = a[i];
                cnt++;
            }
        }
        for(int i=0;i<cnt;i++){
            System.out.print(b[i]+" ");
        }
    }
}