import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        int[] a = new int[N];
        
        for(int i=0;i<N;i++){
            a[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        for(int i=0;i<N;i++){
            if(a[i] == v)
                cnt++;
        }
        System.out.println(cnt);
    }
}