//43.	Write a program to trap the exception handling to trap the divided by zero and out of index value in array.
package assignment8;

import java.util.Scanner;

public class Question43 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		
		try {
			
		System.out.println("try start ");
		
	int div = divide(a, b);
		
		System.out.println("dividion is: " + div);	
		System.out.println("try will end");
		} catch(ArithmeticException ae) {
			System.out.println("inside catch " );	
		} finally {
			System.out.println("inside finally block");
			input.close();   
		}
		
		System.out.println("exit catch");
	}
	
	public static int divide (int a, int b) {
		return a/b;
	}


	

}
