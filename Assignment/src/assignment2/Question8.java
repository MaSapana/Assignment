//8.	Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.
package assignment2;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 1 to convert from Celsius to Fahrenheit.");
		System.out.println("Enter 2 to convert from Fahrenheit to Celsius");
		int choice = input.nextInt();
		
	double temperature = 0.0;
	double converted = 0.0;
		if(choice== 1)
		{
			System.out.println("Enter the temperature in Celsius.");
			temperature = input.nextDouble();
			converted = 9/5.0*temperature+32;
			System.out.println("Temperature in Fahrenheit is: " + converted);
		}
		else if(choice== 2)
		{
			System.out.println("Enter the temperature in Fahrenheit.");
			temperature = input.nextDouble();
			converted = 5/9.0*(temperature-32);
			System.out.println("Temperature in Celsius is: " + converted);
		}
		
		else
			System.out.println("Wrong input.. Enter again...");
		
		 
		 
	}

}
