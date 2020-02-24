package Firstone.Samplepro;

import java.util.Scanner;

public class PalindromeCheck {
	
 
	public static void main(String[] args) {
		String reversestring=" ";
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the string to palindrome");
		String input=scan.nextLine();
		int stringsize=input.length();
		
		for (int a=stringsize-1;a>=0;a-- )
		{
			reversestring=reversestring+input.charAt(a);
		}
			//System.out.println(reversestring);
			if(input.equals(reversestring))
					
		System.out.println(input+ "is a palindrome");
			else
				System.out.println(input+ "is not a palindrome");
	}

	}
	


