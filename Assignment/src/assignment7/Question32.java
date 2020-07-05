//32.	Write a Program to accepts 5 values in array and display their sum.
package assignment7;

import java.util.Scanner;


public class Question32 {
	public static void sumOfArray(int ...arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
		sum=sum+arr[i];
			
		}
		System.out.println("Sum is: " + sum);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr =new int[5];		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("ENTER Number");
			arr[i]= input.nextInt()	;
			}
		sumOfArray(arr);
	

	}
	
	}


