import java.util.Scanner;

public class CaseTypeOfAnimal 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an animal: ");
        String animal = input.next();

        switch(animal.toLowerCase()) 
        {
            case "cat":
            case "dog":
            case "cow":
                System.out.println("Mammal");
                break;
            case "snake":
            case "lizard":
                System.out.println("Reptile");
                break;
            case "parrot":
            case "eagle":
                System.out.println("Bird");
                break;
            case "goldfish":
            case "shark":
                System.out.println("Fish");
                break;
            default:
                System.out.println("Unknown animal.");
                break;
        }
    }
}
