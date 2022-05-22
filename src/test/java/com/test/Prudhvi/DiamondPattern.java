package com.test.Prudhvi;

public class DiamondPattern {

	public static void main(String[] args) {


int count = 20;
		
		for (int i=0;i<=20;i++)
		{
			for(int j=0;j<=40;j++)
			{
				if(j == (count - i) || (j == count + i))
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
		for (int i=20;i<=40;i++)
		{
			for(int j=0;j<=40;j++)
			{
				if(j==(i-count) || j == (3*count-i) )
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
