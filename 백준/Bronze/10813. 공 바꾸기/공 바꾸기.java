import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[N];
        
        for(int k=0;k<N;k++)
            a[k] = (k+1);
        
        int value;
        
        for(int k=0;k<M;k++){
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;
            
            value = a[i];
            a[i] = a[j];
            a[j] = value;        
        }
        
        
        for(int k=0;k<N;k++)
            System.out.print(a[k]+" ");
        
    }
}