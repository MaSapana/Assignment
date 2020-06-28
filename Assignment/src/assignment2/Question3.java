package assignment2;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		
		int a = input.nextInt();
		
		System.out.println("Enter b: ");
		int b = input.nextInt();
		
		//performing Calculation 
		int sum = a + b;
		int avg = (a+b)/2;
		
		
		//printing Output
		System.out.println("The sum of " +a + " and " +b + " is: " + sum);
		System.out.println("The average of " +a  +" and " +b + " is: " + avg);
					
		
	}

}
