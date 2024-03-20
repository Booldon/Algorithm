import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
	    String[] array = new String[5];
	    
	    for(int i=0; i<5; i++) {
	        array[i] = in.next();
	    }
	    
	    for(int i=0; i<15; i++) {
	        
	        for(int j=0; j<5; j++) {
	            if(i < array[j].length()) {
	                System.out.print(array[j].charAt(i));
	            }
	            
	        }
	        
	    }

    }
}
