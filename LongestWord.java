import java.util.Scanner;

public class LongestWord 
{
    static void LongestWord()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of words: ");
        int n = input.nextInt();
        String[] words = new String[n];
        
        System.out.println("Enter the words: ");
        for(int i = 0; i < n; i++) 
        {
            words[i] = input.next();
        }
        
        String longestWord = words[0];
        for(int i = 1; i < n; i++) 
        {
            if(words[i].length() > longestWord.length()) 
            {
                longestWord = words[i];
            }
        }
        
        System.out.println("The longest word in the list is: " + longestWord);
    }
    public static void main(String[] args)
    {
        LongestWord();
    }
}
