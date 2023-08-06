import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int I = sc.nextInt();
        int D = 0;
        
        
        if((H<=23 && H>=0) && (M<=59 && M>=0) && (I>=0 && I<=1000)){
            M = M + I;
            if(M>=60){
                while(M>=60){
                    M = M - 60;
                    H = H + 1;
                    if(H>23){
                        while(H>=24){
                            H = H - 24;
                            D++;
                        }
                    }
                }
            }
            System.out.print(H+" "+M);
            return;
        }
        else{
            System.out.println("잘못된 숫자입니다.");
            return;
        }
    }
}