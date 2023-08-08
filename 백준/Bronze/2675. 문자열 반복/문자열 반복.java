import java.util.*;

public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] S = new int[T];
        int[] sL = new int[T];
        String[] s_array= new String[T];
        
        
        for(int i=0;i<T;i++){
                S[i] = sc.nextInt();
                s_array[i] = sc.next();
                sL[i] = s_array[i].length();
            }
        char[][] value = new char[T][];        
        
        for(int i=0;i<T;i++){
                value[i] = new char[sL[i]];
        }
            
        for(int i=0;i<T;i++){
            
                for(int j=0;j<sL[i];j++){
                    value[i][j] = s_array[i].charAt(j);
                    
            }
        }
        
        for(int i=0;i<T;i++){
            
            for(int j=0;j<sL[i];j++){
                    
                    for(int k=0;k<S[i];k++){
                        System.out.print(value[i][j]);    
                    }
                     
            }
            System.out.println("");  
        }
        
    }
}