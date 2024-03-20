import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.DecimalFormat;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
	    int x = in.nextInt();
	    int y = in.nextInt();
	    
	    int[][] array1 = new int[x][y];
	    int[][] array2 = new int[x][y];
	    
	   for(int a=0; a<x; a++) {
	       for(int b=0; b<y; b++) {
	       array1[a][b] = in.nextInt();
	            
	       }
	   }
	   
	   for(int q=0; q<x; q++) {
	       for(int w=0; w<y; w++) {
	        array2[q][w] = in.nextInt();
	            
	       }
	   }
	    
	    

	    for(int i=0; i<x; i++) {
	        
	        for(int j=0; j<y; j++) {
	            int value = array1[i][j] +array2[i][j];
	            System.out.print(value + " ");
	            
	        }
	        System.out.println("");
	    }
	    
		
	}
}
