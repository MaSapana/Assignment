//35.	Write a function to find second largest number in given array.
package assignment7;

public class Question35 {
	
	public static void secondLargest(int ...arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i +1; j < arr.length; j++) {
			if (arr[i] > arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j]= temp;
			}
			
		}
	}
	System.out.print("Second largest number is:   ");
	for (int i = 0; i < arr.length - 1; i++)
	{
		
	}
		
	
		System.out.println(arr[arr.length-2]);
	}
	public static void main(String[] args) {
		int[] list = new int [] { 45, 67, 34, 76};
		secondLargest(list);
	}

}
