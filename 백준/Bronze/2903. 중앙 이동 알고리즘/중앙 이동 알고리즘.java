import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
		int X = in.nextInt();
        int init = 1;
        int prod = 1;
        
        for(int i=0; i<X; i++) {
            prod = prod*2;
        }

        System.out.println((init+prod)*(init+prod));

	}
}