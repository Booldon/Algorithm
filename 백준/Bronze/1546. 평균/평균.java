import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] a = new double[N];
        double[] b = new double[N];
        double c = 0.0D;
        
        for(int i=0;i<N;i++){
            a[i] = sc.nextDouble();
            
        }

        double max = 0;
        
        for(int i=0;i<N;i++){
            if(max<a[i])
                max = a[i];
        }
        
        for(int i=0;i<N;i++){
            b[i] = (a[i]/max)*100;
            c = c + b[i];
        }
        System.out.println(c/N);
        
    }
}