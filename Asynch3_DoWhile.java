import java.util.Scanner;
public class Asynch3_DoWhile
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		char choice = 'y';
		do 
		{
			System.out.println("Almighty God, we glorify you for giving us the Angelite Charism. \nWe thank you for the gift of your Son, Jesus Christ, who is the Way, Truth and Life.\nWe bless you for the continuous guidance of the Holy Spirit.");
			System.out.println("Grand us, we pray, courage and strength that we may give perpetual praise to you in whatever we do.\nWe ask this through Christ, our Lord. Amen.\nOh, Holy Guardian Angels, guide us and protect us!\nLaus Deo semper!");

			System.out.print("Do you want to read the prayer once again? [Y/N]: ");
			choice = userInput.next().charAt(0);
		}	
			while ((choice != 'N' && choice != 'n'));
	}
}