import java.util.Scanner;

public class CountVowels 
{
    static void CountVowelsInString()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        int count = 0;
        
        for(int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        
        System.out.println("Number of vowels in the string: " + count);
    }
    public static void main(String[] args)
    {
        CountVowelsInString();
    }
}
