import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int O,T,H = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        O = b%10;
        T = ((b-O)/10)%10;
        H = (b-(O+(T*10)))/100;
        System.out.println(a*O);
        System.out.println(a*T);
        System.out.println(a*H);
        System.out.println(a*b);
        
    }
}