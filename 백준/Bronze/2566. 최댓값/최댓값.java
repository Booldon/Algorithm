import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
	    int[][] array = new int[9][9];
	    
	    for(int i=0; i<9; i++) {
	        
	        for(int j=0; j<9; j++) {
	            array[i][j] = in.nextInt();
	            
	        }
	    }
	   
	    int max = Integer.MIN_VALUE;;
	    int[] p = new int[2];
	   
	   	for(int i=0; i<9; i++) {
	        
	        for(int j=0; j<9; j++) {
	           if(array[i][j] > max) {
	                max = array[i][j];
	                p[0] = i+1;
	                p[1] = j+1;
	           }
	        }
	    }
	    
        
	    System.out.println(max);
	    System.out.print(p[0]+" "+p[1]);
	}
}
