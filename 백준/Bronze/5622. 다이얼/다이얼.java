import java.util.*;

public class Main {

    public static void main(String[] args){
                
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        char[] C_array = new char[S.length()];
        int[] D_array = new int[10];
        int value = 0;
        
        for(int i=0;i<S.length();i++){
            C_array[i] = S.charAt(i);
        }
        
        
        for(int i=1;i<10;i++){
            D_array[i] = 2+(i-1);
                
        }
        D_array[0] = 11;
        
        for(int i=0;i<C_array.length;i++){
            
            if(C_array[i] == 'W' || C_array[i] == 'X' || C_array[i] == 'Y' || C_array[i] == 'Z') //9
                value = value + D_array[9];
            
            else if(C_array[i] == 'T' || C_array[i] == 'U' || C_array[i] == 'V')//8
                value = value + D_array[8];
            
            else if(C_array[i] == 'P' || C_array[i] == 'Q' || C_array[i] == 'R' || C_array[i] == 'S')//7
                value = value + D_array[7];
            
            else if(C_array[i] == 'M' || C_array[i] == 'N' || C_array[i] == 'O')//6
                value = value + D_array[6];
            
            else if(C_array[i] == 'J' || C_array[i] == 'K' || C_array[i] == 'L')//5
                value = value + D_array[5];
            
            else if(C_array[i] == 'G' || C_array[i] == 'H' || C_array[i] == 'I')//4
                value = value + D_array[4];
            
            else if(C_array[i] == 'D' || C_array[i] == 'E' || C_array[i] == 'F')//3
                value = value + D_array[3];
            
            else //2
                value = value + D_array[2];
        
        }
        
        System.out.println(value);
    
    }
    
}