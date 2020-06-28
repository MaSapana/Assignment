//30.	Write a program to print the Fibonacci series. 1 1 2 3 5 8 ….

package assignment5;

public class Question30 {

	public static void main(String[] args) {
		
		int fsize = 10;
		
		int[] fibo = new int[fsize];
		fibo[0] = 1;
		fibo[1]=1;
		
		for(int i = 2; i<fsize-1;i++) {
			fibo[i] = fibo[i-1]+fibo[i-2];
		}
		for(int i = 0; i<fsize-1; i++) {
			System.out.print(fibo[i] + " ");
		}
		
	}

}
