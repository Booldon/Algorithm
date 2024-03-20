import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
		String value = in.next();
		int count = 0;
		
		
		String x = "";
		for(int i=0; i<value.length(); i++) {
		    char prev = value.charAt(i);
		    
		    if(prev == 'c') {
		        if(i<value.length()- 1) {
		            
		            if(value.charAt(i+1) == '=') {
		                i++;
		            }
		            else if(value.charAt(i+1) == '-') {
		                i++;
		            }
		        }
		    }
		    
		    else if(prev == 'd') {
		        
		        if(i<value.length()-1) {
		        
		            if(value.charAt(i+1) == 'z') {
		                
		                if(i<value.length()-2) {
		                    
		                    if(value.charAt(i+2) == '=') {
		                        i = i+2;
		                    }
		                }
		            }
		            else if(value.charAt(i+1) == '-') {
		                i++;
		            }
		        }
		    }
		    
		    else if(prev == 'l') {
		        
		        if(i<value.length()-1){
		            if(value.charAt(i+1) == 'j') {
		                i++;
		            }
		        }
		    }
		    
		    else if (prev == 'n') {
		        
		        if(i<value.length()-1) {
		            if(value.charAt(i+1) == 'j') {
		                i++;
		            }
		        }
		    }
		    
		    else if(prev == 's') {
		        if(i<value.length()-1) {
		            if(value.charAt(i+1) == '=') {
		                i++;
		            }
		        }
		    }
		    
		    else if(prev == 'z') {
		        if(i<value.length()-1) {
		            if(value.charAt(i+1) == '=') {
		                i++;
		            }
		        }
		    }
		
		    count++;
		    
		}
		
		System.out.println(count);
		
	}
}