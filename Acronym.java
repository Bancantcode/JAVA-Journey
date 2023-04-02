import java.util.Scanner;

public class Acronym {
    public static String acronym(String sentence) 
    {
       StringBuilder result = new StringBuilder();
       for (String token : sentence.split("\\s+")) 
       {
          result.append(token.toUpperCase().charAt(0));
       }
       return result.toString();
    }
    public static void main(String[] args) 
    {
        Scanner cue = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = cue.nextLine();
        System.out.println("The acronym for " + message+ " is " +(acronym(message)));
    }
 }