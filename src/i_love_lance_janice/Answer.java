
 /*
  * Programming challenge taken from Google's foo.bar wherein a message must
  * be decrypted using what seems to be a type of Caesar Cipher where only 
  * lower case letters have been altered and to the letter inverse of them 
  * in relation to their position in the alphabet.
  */
package i_love_lance_janice;

import java.util.Scanner;

public class Answer 
{
	//method to do the encryption/decryption
	public static String encDec(String s)
	{
	
		String product = "";
		//loops through the string 
		for(int i = 0; i < s.length(); i++)
		{	//tests whether the character is a lower case letter
			if((!Character.isUpperCase(s.charAt(i))) && Character.isLetter(s.charAt(i)))
			{ 	//swaps letter with its alphabetical inverse
				product += (char)(122 - (((int)s.charAt(i)) - 97));
			}
			else
			{	//leaves character be if it does not meet the criteria as
				//stated above
				product += s.charAt(i);
			}
		}
		//returns encrypted or decrypted string
		return product;
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
			System.out.println("Input ordinary text in order to have it encrypted\n"
					+ "or input encrypted text in order to have it decrypted:");
			System.out.println(encDec(in.nextLine()));		
	}
}
