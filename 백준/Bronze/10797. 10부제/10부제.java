import java.util.*;

public class Main{


    public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            
            int cnt = 0;
            int a = sc.nextInt();
            int[] b = new int[5];
                        
            for(int i=0;i<5;i++){
                b[i] = sc.nextInt();
            }
            
            for(int i=0;i<5;i++){
                if(a == b[i]){
                    cnt ++;
                }
            }
            System.out.println(cnt);
          
            
    
    }

}