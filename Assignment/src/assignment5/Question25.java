/*25.	Write a program that prompts the user to enter the number of students and each student’s name and score. 
 *Finally display the student with highest score.
 */
package assignment5;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter number of Student: ");
		int n = input.nextInt();
		int maxScore = 0;
		String studentName = " ";
		
		for (int i = 1; i <=n; i++) {
			System.out.println("Enter student name: ");
			String name = input.next();
			System.out.println("Enter score: ");
			int score = input.nextInt();
			
			if (score > maxScore) {
				maxScore = score;
				studentName = name;
			}
		}
System.out.println("Student with high score is:\n" + studentName + "\t" + maxScore);
input.close();
	}

}
