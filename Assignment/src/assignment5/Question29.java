//29.	Write a Program for the following Mathematical.
package assignment5;

import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n= input.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum = sum + (i/findFactorial(i));
		}
		System.out.println("Sum of nth series is: " + sum);
		input.close();

	}
	
	public static int findFactorial(int n) {
		
		int factorial = 1;
		for(int i=1; i<=n; i++) {
			factorial =factorial * i; 
			
			
	}
		return factorial; 

}
}
