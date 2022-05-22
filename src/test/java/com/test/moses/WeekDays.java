package com.test.moses;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		int x;
		Scanner Sc= new Scanner(System.in);
		x = Sc.nextInt();
		
		if(x==1)
		{
			System.out.println("Sunday");
		}
		else if (x==2)
		{
			System.out.println("Monday");
		}
		else if (x==3)
		{
			System.out.println("Tuesday");
		}
		else if (x==4)
		{
			System.out.println("Wednesday");
		}
		else if (x==5)
		{
			System.out.println("Thrusday");
		}
		else if (x==6)
		{
			System.out.println("friday");
		}
		else if (x==7)
		{
			System.out.println("Saturday");
		}
		else 
		{
			System.out.println("Please Enter value b/w 0 to 7 W.R.T date");
		}

	}

}
