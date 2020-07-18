//41.	Write a program to find the duplicate letter in a word.
package assignment8;

public class Question41 {
	
	public static void main(String[] args) {
		String input = "hello world";
		System.out.println(input);
		
		String character = "";
		String duplicates= "";
		for (int i = 0; i < input.length(); i++) {
			String current = Character.toString(input.charAt(i));
			if(character.contains(current)) {
				if(!duplicates.contains(current)) {
				duplicates += current;
				}
			}
			character += current;
		
			
		}
		System.out.println("dublicates letters are: " + duplicates);
	}
		


}
