package com.user;

import java.util.Scanner;

public class User {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter Age:");
		  int age=sc.nextInt();
		  System.out.println("Enter weight: ");
		   float weight=sc.nextFloat();
		   
		   if(age<21 && age>=60)
		   {
		       if(weight<=40 && weight>=70)
			   {
				   System.out.println("You are eligible for Donating the blood :" + "Age :"+age + " +" +"weight :"+ weight);
			   }
			   else
			   {
				   System.out.println("Invalid weight ");
			   }
		   }
		   else
		   {
			   throw new InvalidDonerException("Your age and weight is invalid");
			   //Exception throw
		   }
		
	}
	}
}
