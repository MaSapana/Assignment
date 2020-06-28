// c=Calculating area of circle, rectangle, and triangle
package assignment2;

import java.util.Scanner;

public class Question5 {
// area of rectangle
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n Enter the length of the rectangle:  ");
		double l = input.nextDouble();
		
		System.out.println("\n Enter the width of the rectangle:  ");
		double w = input.nextDouble();
		
		
	double ar= l * w;
	System.out.println("Area of the Rectangle is: "+ ar);
			
	//area of triangle
	   System.out.println("\n Enter the height of the triangle  ");
		double h = input.nextDouble();

		System.out.println("\n Enter the base of the triangle  ");
		double b = input.nextDouble();
		
		double at= (h*b)/2;
		System.out.println("\n Area of the triangle: " + at);
		
		// area of circle
		System.out.println("Enter radius: ");
		double r = input.nextDouble();
		final double PI= Math.PI;
		double area_Circle = PI*(Math.pow(r, 2));
		System.out.println("Area of Circle is: "+ area_Circle);
		

	}
	

}
