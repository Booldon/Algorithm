import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.DecimalFormat;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
	    Subject[] grades = new Subject[20];
	    double totalGrade = 0.0;
        double totalRate = 0.0;
	    
        for(int i=0; i<20; i++) {
            grades[i] = new Subject(in.next(), in.nextDouble(), in.next());
        }
        
        for(int i=0; i<20; i++) {
            
            if(grades[i].vaildateRate()) {
                totalGrade = totalGrade + grades[i].getGrade();
                totalRate = totalRate + grades[i].getTotalGrade();
            }
        }
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(df.format(totalRate/totalGrade));
		
	}
}

class Subject {
    
    String name;
    double grade;
    String rating;
    double rate = 0.0;
    
    public Subject(String name, double grade, String rating) {
        this.name = name;
        this.grade = grade;
        this.rating = rating;
    };
    
    public double getTotalGrade() {
        
        if(rating.equals("A+")) {
            rate = 4.5;
        } 
        else if(rating.equals("A0")) {
            rate = 4.0;
        }
        else if(rating.equals("B+")) {
            rate = 3.5;
        }
        else if(rating.equals("B0")) {
            rate = 3.0;
        }
        else if(rating.equals("C+")) {
            rate = 2.5;
        }
        else if(rating.equals("C0")) {
            rate = 2.0;
        }
        else if(rating.equals("D+")) {
            rate = 1.5;
        }
        else if(rating.equals("D0")) {
            rate = 1.0;
        }
        else if(rating.equals("F")) {
            rate = 0.0;
        }
        return grade*rate;
        
    }
    
    public double getGrade() {
        return grade;
    }
    public boolean vaildateRate() {
        if(rating.equals("P")) {
            return false;
        }
        else return true;
        
    }

}