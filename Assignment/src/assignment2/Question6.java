// Calculating perimeter
package assignment2;

import java.util.Scanner;

public class Question6 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Perimeter of rectangle
		System.out.println("\n Enter the length of the rectangle:  ");
		double l = input.nextDouble();
		
		System.out.println("\n Enter the width of the rectangle:  ");
		double w = input.nextDouble();
		
		
	double pr= 2*(l + w);
	System.out.println("Perimeter of the Rectangle is: "+ pr);
			
	//perimeter of triangle
	   System.out.println("\n Enter the side of the triangle  ");
		double s1 = input.nextDouble();

		System.out.println("\n Enter the side of the triangle  ");
		double s2 = input.nextDouble();

		System.out.println("\n Enter the side of the triangle  ");
		double s3 = input.nextDouble();
		
		double pt= s1 + s2 + s3;
		System.out.println("\n Area of the triangle: " + pt);
		
		// perimeter of circle
		final double PI= Math.PI;
		System.out.println("Enter radius: ");
		double r = input.nextDouble();
		
		double pc = 2*PI*r;
		System.out.println("Perimeter of Circle is:" + pc);
	
		
		
		
	}
}
