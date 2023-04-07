import java.util.Scanner;

public class InchToMeter {

    public static void InchToMeters()
    {
        double inches, inchToMeter;

        Scanner input = new Scanner(System.in);
        System.out.print("Input a value for inch: ");
        inches = input.nextDouble();
        inchToMeter = inches * 0.0254;
        System.out.println(inches +" inch is "+ inchToMeter +" meters");
    }
    public static void main(String[] args)
    {
        InchToMeters();
    }
}





