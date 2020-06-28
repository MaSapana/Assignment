package assignment3;

public class Question11 {
	
	public static void main(String[] args) {
		int temp, a, b;
		a= 5;
		b= 6;
		
		System.out.println("Before interchange\tvalue of a = "+a+"\tvalue of b: "+b);
		
		temp = a;
		a= b;
		b = temp;
		System.out.println("After interchanging\tvalue of a: " +a+"\tvalue of b: "+b);
	}

}
