//22.	Write a program to print the table of given number.
package assignment5;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args)
	{
			System.out.println("Enter a num: ");
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
			
			int result;			
			for (int i=1; i<=10; i++)
			{
		 result = num * i;
		System.out.println( num + "*" + i + "=" + result);
			}
			input.close();

}
}

