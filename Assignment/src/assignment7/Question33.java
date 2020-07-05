//33.	Write a Program to display number in ascending order in array.
package assignment7;

import java.util.Arrays;
import java.util.Scanner;

public class Question33 {

	public static void ascendingArray(int ...arr) {
		int num;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					num = arr[i];
				arr[i] = arr[j];
				arr[j] = num;
				}
			}
			
		}
	}
 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the size of Array: ");
	int size = input.nextInt();
	int array[] = new int[size];
	for (int i = 0; i < array.length; i++) {
		System.out.println("Enter Elements: ");
		array[i] = input.nextInt();
	}
	ascendingArray(array);
	System.out.println(Arrays.toString(array));
}
	

}
