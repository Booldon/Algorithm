import java.util.*;
import java.lang.*;

public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        String[] A_array = A.split("");
        String[] B_array = B.split("");
        
        A = ""; B = "";
        
        for(int i=A_array.length-1;i>=0;i--){
            A = A + A_array[i];
        }
        
        for(int i=B_array.length-1;i>=0;i--){
            B = B + B_array[i];
        }
        
        int a = Integer.parseInt(A); 
        int b = Integer.parseInt(B);
        
        if(a>b)
            System.out.println(a);
        else
            System.out.println(b);
    }
}