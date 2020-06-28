package assignment3;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		//Declare variable
		double pounds;
		double kilograms;
		
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//receive input from keyboard
		System.out.println("Enter a num in pounds");
		pounds = input.nextDouble();
		
		//compute kilograms 
		//one pound is 0.454 kg
		
		kilograms = pounds * 0.454;
		
		//Display result
		System.out.println(pounds + " is " + kilograms +  " kilograms");
		
		
		
	}

}
