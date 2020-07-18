// 38.	Write a program to check whether given string is palindrome or not. 
package assignment8;

import java.util.Scanner;

public class Question38 {

	public static void main(String[] args) {
		String rev = "";
		System.out.println("Enter input: ");
		Scanner input = new Scanner(System.in);
		String source = input.next();
		
		for (int i = source.length()-1;i>=0;i--) {
			rev = rev+source.charAt(i);			
		}
		if(source.equals(rev)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
		input.close(); 
	}
			

	}





