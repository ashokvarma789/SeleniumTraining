package com.test.moses;

public class PatternD {

	public static void main(String[] args) {
for(int i=1;i<=133; ++i) {
			
			if (i == 11 || i == 23 || i==36 || i==50 || i==65 || i==80 || i==95 || i==109 || i==122 ) {
				System.out.println("*");
			}else if (i==12 || i == 24 || i==37 || i==51 || i==66 || i==81 || i==96 || i==110 ) {
				System.out.print("*"); 
			}else if (i>=13 && i<=22) {
				System.out.print(" ");
			}
			else if (i>=25 && i<=35 || i>=38 && i<=49 || i>=52 && i<=64 || i>=67 && i<=79 || i>=82 && i<=94 || i>=97 && i<=108 || i>=111 && i<=121  ) 
			{
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}
			
		}

	}

}
