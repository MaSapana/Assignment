//21.	Program to input the number of (1...7) and translate to its equivalent name of the day of the week.
package assignment5;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter number beteween 1 to 7 ");
		int n = input.nextInt();
		
		if (n ==1)
		{
			System.out.println("Monday");
		}
		else if (n==2)
		{
			System.out.println("Tuesday");
		}
		else if (n==3)
		{
			System.out.println("Wednesday");
		}
		else if (n==4)
		{
			System.out.println("Thursday");
		}
		else if (n==5)
		{
			System.out.println("Friday");
		}
		else if (n==6)
		{
			System.out.println("Saturday");
		}
		else if (n==7)
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("invalid num");
		}

	}

}
