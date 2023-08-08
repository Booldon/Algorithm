import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[30];
        
        for(int i=0;i<30;i++)
            a[i] = (i+1);
        
        for(int i=0;i<28;i++){
            int value = sc.nextInt();
            a[value-1] = a[value-1] - (value);
        }
        
        for(int i=0;i<30;i++){
            if(a[i]!=0)
                System.out.println(a[i]);
        }
            
        
    }
}