package com.test.jyothi;

public class PercentageOfStudents {

	public static void main(String[] args) {
            int a = 10;
          
            
             if (a >=90 && a <=100) {
            	 System.out.println("First class distinction");
             }else if (a >=70 && a <=90 ) {
            	 System.out.println("First class ");
             }else if (a >=60 && a <=70){
            	 System.out.println("Second class ");
             }else if (a >=30 && a <=60) {
            	 System.out.println("Third class ");
             }else if (a >=10 && a <=30) {
                 System.out.println("Fail ");
             }else {
            	 System.out.println("Input not valid");
             }
	}

}
