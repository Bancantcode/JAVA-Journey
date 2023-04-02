import java.util.Scanner;
public class Alphabets
{
	public static void main(String[] args)
	{
		char letter;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter A Single Letter: ");
		letter = scan.next().charAt(0);
		
		switch(letter) 
		{
			case 'a': {System.out.println("A is for Archery."); break;}
			case 'b': {System.out.println("B is for Badminton. "); break;}
			case 'c': {System.out.println("C is for Cycling."); break;}
			case 'd': {System.out.println("D is for Diving."); break;}
			case 'e': {System.out.println("E is for Equestrian."); break;}
			case 'f': {System.out.println("F is for Fencing."); break;}
			case 'g': {System.out.println("G is for Gymnastics."); break;}
			case 'h': {System.out.println("H is for Handball."); break;}
			case 'i': {System.out.println("I is for Ice Hockey."); break;}
			case 'j': {System.out.println("J is for Judo."); break;}
			case 'k': {System.out.println("K is for Karate."); break;}
			case 'l': {System.out.println("L is for Long Jump."); break;}
			case 'm': {System.out.println("M is for Marathon."); break;}
			case 'n': {System.out.println("N is for Nordic Combined."); break;}
			case 'o': {System.out.println("O is for Oil Wrestling."); break;}
			case 'p': {System.out.println("P is for Poker."); break;}
			case 'q': {System.out.println("Q is for Quidditch."); break;}
			case 'r': {System.out.println("R is for Running."); break;}
			case 's': {System.out.println("S is for Shot Put."); break;}
			case 't': {System.out.println("T is for Table Tennis."); break;}
			case 'u': {System.out.println("U is for Underwater Aerobics."); break;}
			case 'v': {System.out.println("V is for Volleyball."); break;}
			case 'w': {System.out.println("W is for Weightlifting."); break;}
			case 'x': {System.out.println("X is for XC Mountain Biking."); break;}
			case 'y': {System.out.println("Y is for Yo-Yo."); break;}
			case 'z': {System.out.println("Z is for Zorbing."); break;}
			default: {System.out.println("That is not a vowel."); break;}
		}
		
	}
}


//Santiago, Bryan Aaron B. | ICT-101