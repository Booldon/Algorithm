import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean[] a = new boolean[42];
        
        for(int i=0;i<10;i++){
            int b = sc.nextInt()%42;
            a[b] = true;
        }
        
        int cnt = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]==true)
                cnt++;
        }
        System.out.print(cnt);
    }
}