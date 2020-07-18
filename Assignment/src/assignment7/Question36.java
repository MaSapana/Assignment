//36.	Write a function to find duplicate elements in an array.
package assignment7;

public class Question36 {

	public static void main(String[] args) {
		int [] arr =  { 1, 2, 2,3, 4, 5, 6, 7, 7, 9};
		for(int i = 0; i < arr.length-1; i++) 
		{
			for(int j = i + 1; j < arr.length; j ++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate value is: " + arr[j]);
				}
			}
		}
			

	}

}
