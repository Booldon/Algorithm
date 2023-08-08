import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        int x = 0;
        
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }

        int min = a[0], max = a[0];
         for(int j=0; j<N; j++){
            if(a[j] < min)
                min = a[j];
            if(a[j] > max)
                max = a[j];
      } 
    
        System.out.print(min+" "+max);
    }

}