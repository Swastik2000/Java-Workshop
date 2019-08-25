package com.assignment;

public class q6 {

  public static void main(String[] args) {
   
   int n=2019;
		if(n%4==0)
		{
			System.out.println("Yes a leap year");
		}
		else if(n%100==0 && n%400==0)
		{
			System.out.println("yes a leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}

	}

}