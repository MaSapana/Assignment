//19.	Write a Program to accept three sides of triangle and display which kind of triangle is formed.
package assignment4;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter side of the triangle: ");
		double s1 = input.nextDouble();
		
		System.out.println("Enter side of the triangle: ");
		double s2 = input.nextDouble();
		
		System.out.println("Enter side of the triangle: ");
		double s3 = input.nextDouble();
		
		
		if (s1==s2 && s2==s3)
		
			{ 
				System.out.println("This is an Equilateral Triangle");
			}
			
				
			else if (s1!=s2 && s2!=s3)
			
				{
					System.out.println("This is an Scalene Triangle");
				}
				else
				{
					System.out.println("This is an Isosceles Triangle");
				}
		}

	}



