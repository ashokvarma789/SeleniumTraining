package com.test.moses;

public class PatternS {

	public static void main(String[] args) {
		for(int i=1;i<=81;i++) {
			if(i==1 ||i == 15 || i>=24 && i<= 31 || i>=34 && i<= 41 || i>=44 && i<=51 || i>=54 && i<=61 || i>=64 && i<=71  ) {
				System.out.print(" ");
			}else if(i == 10 ||i == 23 || i==33 || i==43 || i ==53 || i ==63 || i == 73 ) {
				System.out.println(" ");
				}else if(i>=10 && i<=14)	{
					System.out.println("*");
				}
			
		else {
			System.out.print("*");
		}
		}

	}

}
