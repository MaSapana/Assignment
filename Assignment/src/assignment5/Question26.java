//26.	Write a Program to reverse the given number. //123 => 321
package assignment5;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no. to reverse.");
		int num = input.nextInt();
		int rev = 0;
		
		while (num >=1){
			int digit = num % 10;
			rev = rev*10 + digit;
			num = num / 10;
		}
		
		System.out.println("reverse number is " + rev);
input.close();

	}

}
