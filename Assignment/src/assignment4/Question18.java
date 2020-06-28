//program to find largest of three number
package assignment4;

public class Question18 {

	public static void main(String[] args) {
		int x = 9;
		int y = 15;
		int z = 7;
		
		if (x>y)
		{
			if(x>z)
			{ 
				System.out.println("X is the greatest");
			}
			else
			{
				System.out.println("Z is the greatest");
			}
				
				
		}
		else if (y>x)
		{
			if(y>z)
			{
				System.out.println("Y is the greates");
			}
			else
			{
				System.out.println("Z is the greatest");
			}
		}
		
		
	}

}
