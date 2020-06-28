package assignment6;

public class Assignment6 {

	public void findFactorial(int n) {
		int result = 1;
		for(int i = 1; i <=n; i++) {
			result = result * i;
		}
		System.out.println(n + "!" + "=" + result);


	}
	
	public void printTable(int n) {
		int result;			
		for (int i=1; i<=10; i++)
		{
	 result = n * i;
	System.out.println( n + "*" + i + "=" + result);
		}
	}
	
	
	public boolean isPrime(int n) {
		boolean isPrimeNumber = true;
		for(int i =2; i<=n /2; i++) {
			if (n% i == 0) {
				isPrimeNumber = false;
				break;
			}
		}
		
		return isPrimeNumber;
	}
	 public void printReverse(int n) {
			int rev = 0;
			
			while (n >=1){
				int digit = n % 10;
				rev = rev*10 + digit;
				n = n/ 10;
			}
			
			System.out.println("reverse number is " + rev);
		 
	 }
	 
	 public void fibo(int n) {
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
