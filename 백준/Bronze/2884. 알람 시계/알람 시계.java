import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        
        if(H>=0 && H<=23 && M>=0 && M<=59){
            M = M - 45;
            if(M<0){
                M = M + 60;
                H = H - 1;
                if(H<0)
                    H = H + 24;
            }
            System.out.print(H+" "+M);
            return;
        }
        else
        {
            System.out.print("시각을 입력하십시오");
            return;
        }
    }
}