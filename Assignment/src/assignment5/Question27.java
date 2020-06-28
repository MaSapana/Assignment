//27.	Write a Program to sum each digit of given number as we XX ll as product. //456 =>4*5*6 and 4+5+6
package assignment5;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
 System.out.println("Enter the no. to reverse.");
 int num = input.nextInt();
 int sumNum=0, mulNum = 1;
 while(num!=0) {
	 int digit = num % 10;
	 sumNum= sumNum + digit;
	 
	 mulNum = mulNum * digit;
	 num  /= 10;
 }
 System.out.println("sum of each no = " + sumNum);
 System.out.println("multiple of each no = " + mulNum);
 input.close();
	}

}
