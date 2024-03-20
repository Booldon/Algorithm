import java.util.*;

class Main {
	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        String value = in.next();
        int X = in.nextInt();
        int[] Y = new int[value.length()];
        int a = 1;
        int total = 0;
        
        
        for(int i=0; i<value.length(); i++) {
            
            int valueChar = (int)value.charAt((value.length()-1)-i);
            
            
            if(64 < valueChar && valueChar < 91) {
                valueChar = valueChar - 55;
                total = total + (valueChar * a);
            }
            else  {
                valueChar = valueChar - 48;
                total = total + (valueChar * a);
                
                }
                a = a * X;
                
            } 
            System.out.println(total);
            
        }
        
}
