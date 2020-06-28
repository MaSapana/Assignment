//24.	Write a program to print the factorial number of given numbers.
package assignment5;

import java.util.Scanner;

public class Question24 {
	public static void main(String[] args) {		
	System.out.println("Enter the num.");
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	int result = 1;
	for(int i = 1; i <=num; i++) {
		result = result * i;
	}
	System.out.println(num + "!" + "=" + result);
		input.close();
	}

}
