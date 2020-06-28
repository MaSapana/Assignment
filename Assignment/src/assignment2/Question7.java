// 7.	Write a program that read the radius and length of a cylinder and computes volume.
package assignment2;

import java.util.Scanner;

public class Question7 {
	final  static double VALUE_OF_PI= Math.PI;
	public static void main(String[] args) {
		
		
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the radius of the cylinder ");
			double r = input.nextDouble();
			
			System.out.println("Enter the height of cylinder");
			double h = input.nextDouble();
			double volume = VALUE_OF_PI * r*r*h;
			System.out.println("The Volume of cylinder is: " + volume);
					

	}

}
