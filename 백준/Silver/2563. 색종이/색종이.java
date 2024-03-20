import java.util.*;

class Main {
	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int[][] field = new int[100][100];
        int x = in.nextInt();
        
        
        for(int i=0; i<x; i++) {
            
            int y = in.nextInt();
            int z = in.nextInt();
            
            for(int j=0; j<10; j++) {
                
                for(int k=0; k<10; k++) {
                    field[y+j][z+k] = 1;
                    
                }
            }
        }
        int count = 0;
        
        for(int i=0; i<100; i++) {
            
            for(int j=0; j<100; j++) {
                if(field[i][j] == 1) {
                    count ++;
                }
            }
        }
        System.out.println(count);
        


    }
}
