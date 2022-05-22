package com.test.Prudhvi;

public class PatternS {

	public static void main(String[] args) {
		for (int i=0;i<=27;i++) 
		{
			if (i>=6 && i<=9) 
			{
				System.out.println("*");
			}
			else if (i==17)
			{
				System.out.println();
			}
			else if (i >=18 && i <= 20)
			{
				System.out.println("      *");
			}
			else
			{
				System.out.print("*");	
			}
		
		}
		
	}

}
