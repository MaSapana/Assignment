/*20.	Write a program to create the equivalent of a four-function calculator. 
 * The program to enter two integer’s numbers and an operator. It then carries out the 
 * specified arithmetic operator operation: addition, subtraction, multiplication or division of the two numbers.
 *  Finally, it displays the result.
 */
package assignment4;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int a = input.nextInt();
		
		System.out.println("Enter b: ");
		int b = input.nextInt();
		
		System.out.println("Enter your choice: ");
		char choice = input.next().charAt(0);
		
			
		switch(choice) {
		case '+':
			System.out.println("this is additional");
			int sum = a + b;
					System.out.println("Sum of the number is: " + sum);					
			break;
			
		case '-':
			System.out.println("this is subtraction");
			int sub = a - b;
			System.out.println("Difference of the number is: " + sub);		
			break;
			
		case '*':
			System.out.println("this is multiplication");
			int mul = a * b;
			System.out.println("Product of the number is: " + mul);		
			break;
		
		case '/':
			System.out.println("this is division");
			int div = a / b;
			System.out.println("Quotient of the number is: " + div);		
			break;
			default:
				System.out.println("wrong choice!!!");
				break;
		}
		System.out.println("exited from switch case");
		input.close();
		

	}

}
