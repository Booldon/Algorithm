import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] value = new char[S.length()];
        
        for(int i=0;i<S.length();i++){
            value[i] = S.charAt(i);
        }
        
        int sequence = 0;
        
        Loop1 : for(int i=97;i<123;i++){
            for(int j=0; j<S.length();j++){
                
                if((char)i==value[j]){
                    System.out.print((j)+" ");
                    continue Loop1;
                }
            }
            System.out.print("-1 ");
        }
    }
}