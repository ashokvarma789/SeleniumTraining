package com.test.vamsi;

public class Ex13PatternX {

	public static void main(String[] args) {
		int count = 20;

		for(int i=0;i<=20;i++)
		{
			for(int j=0;j<=20;j++)
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
