//ask this
package assignment2;

import java.util.Scanner;

public class Question4 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
	System.out.println("Eneter Principle Amount: ");
	
	int p = input.nextInt();
	
	System.out.println("Enter Time Period: ");
	int t = input.nextInt();
	
	System.out.println("Enter rate: ");
	int r = input.nextInt();
	
	double i = (p*t*r)/100;
	
	
	System.out.println("Simple Interest is " + i);
	
		
	}
	

}
