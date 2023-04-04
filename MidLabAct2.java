// Santiago, Bryan Aaron B. | ICT-101

import java.util.Scanner;

public class MidLabAct2
{
	public static void main(String[] args) 
	{
        	Scanner cue = new Scanner(System.in);
			System.out.println("ARRAY OF CHARACTERS");
        	char[] characters = new char[11];

        	for (int ctr = 1; ctr <= 10; ctr++) 
		{
            	System.out.print("Character "+ctr+" Input: ");
            	characters[ctr] = cue.next().charAt(0);
        	}

        	System.out.print("Characters given by user 'in order' are :");
        	for (int ctr = 0; ctr < characters.length; ctr++) 
		{
            	System.out.print(characters[ctr]+" ");
        	}
    	}
}

//Create Midterm Lab Activity 2 with the class name MidLabAct2 and file name MidLabAct2.java
//   The objective is to :

//   Create an array of characters.
//   Let the user input 10 characters.
//   Display the characters that were given by the user in order. 











