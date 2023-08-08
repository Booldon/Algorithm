import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[N];
        
        for(int k=0;k<N;k++)
            a[k]=(k+1);
        
        
        
         for(int k=0;k<M;k++){
             int i = sc.nextInt()-1;
             int j = sc.nextInt()-1;
             
             for(int t=i;t<j;t++){
                 int value = a[t]; 
                 a[t] = a[j];
                 a[j] = value;
                 j--;
             }
         }
        
        for(int k=0;k<N;k++)
            System.out.print(a[k]+" ");
    }
}