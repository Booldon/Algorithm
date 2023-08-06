import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int i,j,x = 0;
        int cnt = 0;
        
        for(i=0;i<a.length;i++){
            a[i] = sc.nextInt();
            if(a[i]<=0 && a[i]>6){
                System.out.println("잘못된 숫자입니다.");
                return;
            }
        }
        
        for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    cnt++;
                    x = a[i];
                }
            }
        }
        
        if(cnt==3)
            System.out.print(10000+(x*1000));
        else if(cnt==1)
            System.out.print(1000+(x*100));
        else if(cnt==0){
            if(a[0]>a[1] && a[0]>a[2])
                x = a[0];
            else if(a[1]>a[0] && a[1]>a[2])
                x = a[1];
            else if(a[2]>a[0] && a[2]>a[1])
                x = a[2];
            
            System.out.print(x*100);
        }
       
    }
}