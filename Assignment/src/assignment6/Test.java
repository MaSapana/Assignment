package assignment6;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Assignment6 ob = new Assignment6();
		Scanner input = new Scanner(System.in);
		String decision = "";
		do {
			System.out.println("Which operation do you want to perform: ");
			String choice = input.next();
			
			switch (choice) {
			case "table": 
				System.out.println("Enter number to find the table:");
				int n = input.nextInt();
				ob.printTable(n);
				break;
				
			case "factorial": 
				System.out.println("Enter number to find the factorial:");
				 n = input.nextInt();
				ob.findFactorial(n);
				break;
				
			case "prime": 
				System.out.println("Enter number to find the factorial:");
			     n = input.nextInt();
				ob.isPrime(n);
				break;
				
			case "reverse": 
				System.out.println("Enter number to reverse:");
			     n = input.nextInt();
				ob.printReverse(n);
				break;
				
			case "fib": 
				System.out.println("Enter number to print Fibonacci series: ");
			     n = input.nextInt();
				ob.fibo(n);
				break;
				
				
			
			default:
				System.out.println("wrong choice!!");
			}
			System.out.println("do you want to continue?");
			decision = input.next();
		}while(decision.equalsIgnoreCase("Yes"));
System.out.println(" Thank you, See you Again!!!");
input.close();
	}
}


