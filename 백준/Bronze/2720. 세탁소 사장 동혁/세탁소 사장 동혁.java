import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
		int X = in.nextInt();
		int[] value = new int[X];
		
		for(int i=0; i<X; i++) {
		    value[i] = in.nextInt();
		    int [] coin = new int[4];
            
            coin[0] = value[i] / 25;
            value[i] = value[i] % 25;
            
            coin[1] = value[i] / 10;
            value[i] = value[i] % 10;
            
            coin[2] = value[i] / 5;
            value[i] = value[i] % 5;
            
            coin[3] = value[i] / 1;

                for(int j=0; j<4; j++) {
                    System.out.print(coin[j]+" ");
                }
                
            System.out.println("");

		}
	}
}