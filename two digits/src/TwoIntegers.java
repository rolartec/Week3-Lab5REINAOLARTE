//  Making a Java Program that accepts 2 integers and outputs the digits entered.
//  By   REINA OLARTE

import java.util.Scanner;

//  Imports the Scanner class

public class TwoIntegers
{

	public static void main(String[] args)
	{
		// Create a Scanner  to input information 
		Scanner input = new Scanner( System.in );
		
		//  Declaring the variables
		
		int Number1;
		int Number2;
		
		System.out.println("ENTER THE FIRST DIGIT :");
		
		//  PROMPTS USER TO ENTER FIRST DIGIT
		
		Number1 = input.nextInt();
		
		System.out.println("ENTER THE SECOND DIGIT :");
		
		
	    //  PROMPTS USER TO ENTER SECOND DIGIT
		
		Number2 = input.nextInt();
		
		System.out.printf("HELLO, YOU ENTERED : %d and %d",Number1,Number2);
		
		
	}   //END METHOD MAIN

}      //  END CLASS
