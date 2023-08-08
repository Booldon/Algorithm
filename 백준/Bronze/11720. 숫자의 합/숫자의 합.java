import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int[] value = new int[N];
        int sum = 0;
        
        for(int i=0;i<N;i++){
            value[i] = Character.getNumericValue(S.charAt(i));
            sum = sum + value[i];
        }
        System.out.println(sum);
    }
}