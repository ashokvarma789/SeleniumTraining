package com.test.vamsi;

public class Excersice1Greetings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int x=11;
					
		if(x >= 0 && x <=12 )
		{
			System.out.println("Good Morning");
		}
		else if(x >= 12 && x <16 )
		{
			System.out.println("Good Afternoon");
		}
		else if(x >= 16 && x <19 )
		{
			System.out.println("Good Evening");
		}
		else if (x >= 19 && x <24 )
		{
			System.out.println("Good Night");
		}
		else {
			System.out.print("Please enter valide input b/w 0 to 24");
		}


	}

}
