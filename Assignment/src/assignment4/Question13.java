//13.	Write a program to print the number entered by user only if the number entered is negative.
package assignment4;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		int num;
			Scanner sc = new Scanner(System.in);
			num=sc.nextInt();
			
			
			
			if(num<0) {
				System.out.println("The given number is = " + num );
			}
			else {
				System.out.println("The given number is not valid");
			}
				
							
		
	}
	}
	
	
	
