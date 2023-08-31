import java.util.*;

public class Main{
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> c = new ArrayList<>();
        int a[] = new int[7];
        int cnt =0;
        int b = 0;
        
        for(int i=0;i<7;i++){
            a[i] = sc.nextInt();
        }
        
        for(int i=0;i<7;i++){
            if(a[i]%2 == 1){
                b = b+a[i];
                c.add(a[i]);
                cnt ++;
            }
        }
            
        int min = 100;
        
        for(int i=0;i<c.size();i++){
            if(min>c.get(i)){
                min = c.get(i);
            }
        }
        
        if(b==0) System.out.println("-1");
        else{
            System.out.println(b);
            System.out.println(min);
        }
        
    }
}