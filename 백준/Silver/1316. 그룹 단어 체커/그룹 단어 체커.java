import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		String value[] = new String[x];
		int count = 0;
		String ans = "";
		
		
		for(int i=0; i<x; i++) {
		    boolean valid = false;
		    value[i] = in.next();
		    
		    for(int j=0; j<value[i].length(); j++){
		        int p = 0;
                for(int m=j+1; m<value[i].length(); m++) {
                    if(value[i].charAt(j) == value[i].charAt(m)) {
                        p++;   
                    }
                    else break;
                }
		        j = j+p;
		        ans = ans + value[i].charAt(j);
		    }
            
            for(int k=0; k<ans.length(); k++) {
                for(int l=k+1; l<ans.length(); l++) {
                    if(ans.charAt(k) == ans.charAt(l)) {
                        valid = true;
                    }
                }
            }
            // System.out.println(valid);
            
            if(!valid) {
                count++;
            }
            ans = "";
            
		}

		System.out.println(count);
		
	}
}