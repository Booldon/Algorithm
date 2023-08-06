import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if(x>=-1000 && x<=1000 && y>=-1000 && y<=1000)
        {
         if(x==0 || y==0){
             System.out.print("0은 안됩니다 ㅋ.");
             return;
         }
         else if(x>0 && y>0)
             System.out.print(1);
         else if(x<0 && y>0)
             System.out.print(2);
         else if(x<0 && y<0)
             System.out.print(3);
         else if(x>0 && y<0)
             System.out.print(4);
            
        }
        else{
            System.out.print("틀린 숫자입니다.");
            return;      
        }
    }
}