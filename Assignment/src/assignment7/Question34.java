//34.	Write a program to reverse the element of an array.
package assignment7;



public class Question34 {

	public static void arrayReverse(int arr[] , int start, int end) {
		while (start < end)
		{
		int temp =arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		start++;
		end--;
		}
	}
	
	public static void printArray(int arr[], int size) {
		for (int i = 0; i < size; i++) 
			System.out.println(arr[i] + " ");
		}
	
	public static void main(String[] args) {
		int[] list = new int[] {54, 89, 99 ,24, 87, 28};
		arrayReverse(list , 0, list.length-1);
		printArray(list, list.length);
	}
	}
	