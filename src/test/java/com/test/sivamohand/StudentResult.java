package com.test.sivamohand;

public class StudentResult {

	public static void main(String[] args) {
		int p = 65;
		
		if (p>=80)
			
		{
			System.out.println("Student passed in distinction");
		
		}
		else if (p>=70 && p<80)
		{
			System.out.println("Student passed in First Class");
		}
		else if (p>=60 && p<70)
		{
			System.out.println("Student passed in Second Class");
		}
		else if (p>=40 && p<60)
		{
			System.out.println("Student passed in Third Class");
		}
		else
		{
			System.out.println("Student Failed...relax till supplementary exams");
		}

	}

	}
