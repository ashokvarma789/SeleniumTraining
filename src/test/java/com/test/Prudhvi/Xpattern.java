package com.test.Prudhvi;

public class Xpattern {

	public static void main(String[] args) {
		
		int count = 10;
		
		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<=10;j++)
			{
				if (j==i || j==count-i) 
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
