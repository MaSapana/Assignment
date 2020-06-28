package assignment3;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = input.nextLine();		//next will print only one word name. if we want to print more than one word name we need to use nextLine.
		System.out.println("Enter Nationality :");
		String nationality = input.nextLine();		
		System.out.println("Enter roll");
		int roll = input.nextInt();
		
		System.out.println("==============================");
		System.out.println(" Name is: " + name);
		System.out.println("Roll no is: " + roll);
		System.out.println("Nationality is: " + nationality);
	
	}

}

// when we write next line we need to write in certain way. use all the nextLine first and then nextInt. 